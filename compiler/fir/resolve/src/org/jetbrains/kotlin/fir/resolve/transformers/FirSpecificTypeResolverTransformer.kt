/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir.resolve.transformers

import org.jetbrains.kotlin.fir.FirSession
import org.jetbrains.kotlin.fir.declarations.FirResolvePhase
import org.jetbrains.kotlin.fir.declarations.FirValueParameter
import org.jetbrains.kotlin.fir.expressions.FirAnnotationCall
import org.jetbrains.kotlin.fir.resolve.FirTypeResolver
import org.jetbrains.kotlin.fir.scopes.FirPosition
import org.jetbrains.kotlin.fir.scopes.FirScope
import org.jetbrains.kotlin.fir.types.*
import org.jetbrains.kotlin.fir.types.impl.FirResolvedFunctionTypeRefImpl
import org.jetbrains.kotlin.fir.types.impl.FirResolvedTypeRefImpl
import org.jetbrains.kotlin.fir.visitors.CompositeTransformResult
import org.jetbrains.kotlin.fir.visitors.compose

class FirSpecificTypeResolverTransformer(
    private val towerScope: FirScope,
    private val position: FirPosition,
    override val session: FirSession
) : FirAbstractTreeTransformer(phase = FirResolvePhase.SUPER_TYPES) {
    override fun transformTypeRef(typeRef: FirTypeRef, data: Nothing?): CompositeTransformResult<FirTypeRef> {
        val typeResolver = FirTypeResolver.getInstance(session)
        typeRef.transformChildren(FirSpecificTypeResolverTransformer(towerScope, FirPosition.OTHER, session), null)
        return transformType(typeRef, typeResolver.resolveType(typeRef, towerScope, position))
    }

    override fun transformFunctionTypeRef(functionTypeRef: FirFunctionTypeRef, data: Nothing?): CompositeTransformResult<FirTypeRef> {
        val typeResolver = FirTypeResolver.getInstance(session)
        functionTypeRef.transformChildren(this, data)
        return FirResolvedFunctionTypeRefImpl(
            functionTypeRef.psi,
            functionTypeRef.isMarkedNullable,
            functionTypeRef.annotations as MutableList<FirAnnotationCall>,
            functionTypeRef.receiverTypeRef,
            functionTypeRef.valueParameters as MutableList<FirValueParameter>,
            functionTypeRef.returnTypeRef,
            typeResolver.resolveType(functionTypeRef, towerScope, position)
        ).compose()
    }

    private fun transformType(typeRef: FirTypeRef, resolvedType: ConeKotlinType): CompositeTransformResult<FirTypeRef> {
        return FirResolvedTypeRefImpl(
            typeRef.psi,
            resolvedType,
            typeRef.annotations
        ).compose()
    }

    override fun transformResolvedTypeRef(resolvedTypeRef: FirResolvedTypeRef, data: Nothing?): CompositeTransformResult<FirTypeRef> {
        return resolvedTypeRef.compose()
    }

    override fun transformImplicitTypeRef(implicitTypeRef: FirImplicitTypeRef, data: Nothing?): CompositeTransformResult<FirTypeRef> {
        return implicitTypeRef.compose()
    }

    override fun transformErrorTypeRef(errorTypeRef: FirErrorTypeRef, data: Nothing?): CompositeTransformResult<FirTypeRef> {
        return transformTypeRef(errorTypeRef, data)
    }

    override fun transformResolvedFunctionTypeRef(
        resolvedFunctionTypeRef: FirResolvedFunctionTypeRef,
        data: Nothing?
    ): CompositeTransformResult<FirTypeRef> {
        return transformTypeRef(resolvedFunctionTypeRef, data)
    }

    override fun transformTypeRefWithNullability(
        typeRefWithNullability: FirTypeRefWithNullability,
        data: Nothing?
    ): CompositeTransformResult<FirTypeRef> {
        return transformTypeRef(typeRefWithNullability, data)
    }

    override fun transformUserTypeRef(userTypeRef: FirUserTypeRef, data: Nothing?): CompositeTransformResult<FirTypeRef> {
        return transformTypeRef(userTypeRef, data)
    }

    override fun transformDynamicTypeRef(dynamicTypeRef: FirDynamicTypeRef, data: Nothing?): CompositeTransformResult<FirTypeRef> {
        return transformTypeRef(dynamicTypeRef, data)
    }

    override fun transformDelegatedTypeRef(delegatedTypeRef: FirDelegatedTypeRef, data: Nothing?): CompositeTransformResult<FirTypeRef> {
        return transformTypeRef(delegatedTypeRef, data)
    }
}
