@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
annotation class UnimportantAnnotation

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
annotation class UnimportantAnnotationWithArg(val arg: String)


public interface Map<K, V> {
    @kotlin.SinceKotlin("1.3")
    @UnimportantAnnotation
    @UnimportantAnnotationWithArg("bar")
    public fun getOrDefault(key: K, defaultValue: V)
}

fun testGetOrDefault(c: Map<out Number, String>) =
    c.<!MEMBER_PROJECTED_OUT("@SinceKotlin(version = \"1.3\") public abstract fun getOrDefault(key: K, defaultValue: V): Unit defined in Map", "Map<out Number, String>")!>getOrDefault<!>(42, "")

@kotlin.SinceKotlin("1.3")
@UnimportantAnnotation
@UnimportantAnnotationWithArg("bar")
fun foo() {}

val bar = foo(
    <!TOO_MANY_ARGUMENTS("@SinceKotlin(version = \"1.3\") public fun foo(): Unit defined in root package in file renderingInDiagnostics.kt")!>42<!>
)