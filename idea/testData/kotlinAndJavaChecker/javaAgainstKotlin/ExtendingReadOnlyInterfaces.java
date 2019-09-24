public class EtendingReadOnlyInterfaces {
    public static class Lists {
        <error descr="Class 'ExtendIList1' must either be declared abstract or implement abstract method 'getSize()' in 'List'">public static class ExtendIList1 implements IList<String></error> {

        }

        <error descr="Class 'ExtendIList2' must either be declared abstract or implement abstract method 'contains(E)' in 'List'">public static class ExtendIList2<E> implements IList<E></error> {

        }

        <error descr="Class 'ExtendCList1' must either be declared abstract or implement abstract method 'contains(E)' in 'List'">public static class ExtendCList1<E> extends CList<E></error> {

        }

        <error descr="Class 'ExtendCList2' must either be declared abstract or implement abstract method 'getSize()' in 'List'">public static class ExtendCList2<E> extends CList<String></error> {

        }

        <error descr="Class 'ExtendSList' must either be declared abstract or implement abstract method 'getSize()' in 'List'">public static class ExtendSList extends SList</error> {

        }

        <error descr="Class 'ExtendAList' must either be declared abstract or implement abstract method 'getSize()' in 'List'">public static class ExtendAList extends AList</error> {

        }
    }

    public static class Collections {
        <error descr="Class 'ExtendICollection1' must either be declared abstract or implement abstract method 'getSize()' in 'Collection'">public static class ExtendICollection1 implements ICollection<String></error> {

        }

        <error descr="Class 'ExtendICollection2' must either be declared abstract or implement abstract method 'contains(E)' in 'Collection'">public static class ExtendICollection2<E> implements ICollection<E></error> {

        }

        <error descr="Class 'ExtendCCollection1' must either be declared abstract or implement abstract method 'contains(E)' in 'Collection'">public static class ExtendCCollection1<E> extends CCollection<E></error> {

        }

        <error descr="Class 'ExtendCCollection2' must either be declared abstract or implement abstract method 'getSize()' in 'Collection'">public static class ExtendCCollection2<E> extends CCollection<String></error> {

        }

        <error descr="Class 'ExtendSCollection' must either be declared abstract or implement abstract method 'getSize()' in 'Collection'">public static class ExtendSCollection extends SCollection</error> {

        }

        <error descr="Class 'ExtendACollection' must either be declared abstract or implement abstract method 'getSize()' in 'Collection'">public static class ExtendACollection extends ACollection</error> {

        }
    }

    public static class Sets {
        <error descr="Class 'ExtendISet1' must either be declared abstract or implement abstract method 'getSize()' in 'Set'">public static class ExtendISet1 implements ISet<String></error> {

        }

        <error descr="Class 'ExtendISet2' must either be declared abstract or implement abstract method 'contains(E)' in 'Set'">public static class ExtendISet2<E> implements ISet<E></error> {

        }

        <error descr="Class 'ExtendCSet1' must either be declared abstract or implement abstract method 'contains(E)' in 'Set'">public static class ExtendCSet1<E> extends CSet<E></error> {

        }

        <error descr="Class 'ExtendCSet2' must either be declared abstract or implement abstract method 'getSize()' in 'Set'">public static class ExtendCSet2<E> extends CSet<String></error> {

        }

        <error descr="Class 'ExtendSSet' must either be declared abstract or implement abstract method 'getSize()' in 'Set'">public static class ExtendSSet extends SSet</error> {

        }

        <error descr="Class 'ExtendASet' must either be declared abstract or implement abstract method 'getSize()' in 'Set'">public static class ExtendASet extends ASet</error> {

        }
    }

    public static class Iterables {
        <error descr="Class 'ExtendIIterable1' must either be declared abstract or implement abstract method 'iterator()' in 'Iterable'">public static class ExtendIIterable1 implements IIterable<String></error> {

        }

        <error descr="Class 'ExtendIIterable2' must either be declared abstract or implement abstract method 'iterator()' in 'Iterable'">public static class ExtendIIterable2<E> implements IIterable<E></error> {

        }

        <error descr="Class 'ExtendCIterable1' must either be declared abstract or implement abstract method 'iterator()' in 'Iterable'">public static class ExtendCIterable1<E> extends CIterable<E></error> {

        }

        <error descr="Class 'ExtendCIterable2' must either be declared abstract or implement abstract method 'iterator()' in 'Iterable'">public static class ExtendCIterable2<E> extends CIterable<String></error> {

        }

        <error descr="Class 'ExtendSIterable' must either be declared abstract or implement abstract method 'iterator()' in 'Iterable'">public static class ExtendSIterable extends SIterable</error> {

        }

        <error descr="Class 'ExtendAIterable' must either be declared abstract or implement abstract method 'iterator()' in 'Iterable'">public static class ExtendAIterable extends AIterable</error> {

        }
    }

    public static class Iterators {
        <error descr="Class 'ExtendIIterator1' must either be declared abstract or implement abstract method 'hasNext()' in 'Iterator'">public static class ExtendIIterator1 implements IIterator<String></error> {

        }

        <error descr="Class 'ExtendIIterator2' must either be declared abstract or implement abstract method 'hasNext()' in 'Iterator'">public static class ExtendIIterator2<E> implements IIterator<E></error> {

        }

        <error descr="Class 'ExtendCIterator1' must either be declared abstract or implement abstract method 'hasNext()' in 'Iterator'">public static class ExtendCIterator1<E> extends CIterator<E></error> {

        }

        <error descr="Class 'ExtendCIterator2' must either be declared abstract or implement abstract method 'hasNext()' in 'Iterator'">public static class ExtendCIterator2<E> extends CIterator<String></error> {

        }

        <error descr="Class 'ExtendSIterator' must either be declared abstract or implement abstract method 'hasNext()' in 'Iterator'">public static class ExtendSIterator extends SIterator</error> {

        }

        <error descr="Class 'ExtendAIterator' must either be declared abstract or implement abstract method 'hasNext()' in 'Iterator'">public static class ExtendAIterator extends AIterator</error> {

        }
    }

    public static class Maps {
        <error descr="Class 'ExtendIMap1' must either be declared abstract or implement abstract method 'getSize()' in 'Map'">public static class ExtendIMap1 implements IMap<String, Integer></error> {

        }

        <error descr="Class 'ExtendIMap2' must either be declared abstract or implement abstract method 'containsValue(V)' in 'Map'">public static class ExtendIMap2<E> implements IMap<String, E></error> {

        }

        <error descr="Class 'ExtendCMap1' must either be declared abstract or implement abstract method 'containsKey(K)' in 'Map'">public static class ExtendCMap1<K, V> extends CMap<K, V></error> {

        }

        <error descr="Class 'ExtendCMap2' must either be declared abstract or implement abstract method 'containsValue(V)' in 'Map'">public static class ExtendCMap2<V> extends CMap<String, V></error> {

        }

        // NOTE: looks like a bug in compiler see KT-17738

        //public static class ExtendSMap extends SMap<A> {
        //
        //}
        //
        //public static class ExtendABMap extends ABMap {
        //
        //}
    }

    public static class MapEntrys {
        <error descr="Class 'ExtendIMapEntry1' must either be declared abstract or implement abstract method 'getKey()' in 'Entry'">public static class ExtendIMapEntry1 implements IMapEntry<String, Integer></error> {

        }

        <error descr="Class 'ExtendIMapEntry2' must either be declared abstract or implement abstract method 'getKey()' in 'Entry'">public static class ExtendIMapEntry2<E> implements IMapEntry<String, E></error> {

        }

        <error descr="Class 'ExtendCMapEntry1' must either be declared abstract or implement abstract method 'getKey()' in 'Entry'">public static class ExtendCMapEntry1<K, V> extends CMapEntry<K, V></error> {

        }

        <error descr="Class 'ExtendCMapEntry2' must either be declared abstract or implement abstract method 'getKey()' in 'Entry'">public static class ExtendCMapEntry2<V> extends CMapEntry<String, V></error> {

        }

        <error descr="Class 'ExtendSMapEntry' must either be declared abstract or implement abstract method 'getKey()' in 'Entry'">public static class ExtendSMapEntry extends SMapEntry<A></error> {

        }

        <error descr="Class 'ExtendAMapEntry' must either be declared abstract or implement abstract method 'getKey()' in 'Entry'">public static class ExtendAMapEntry extends ABMapEntry</error> {

        }
    }
}