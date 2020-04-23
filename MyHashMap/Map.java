public interface Map<K,V> {
    int size();
    boolean isEmpty();
    V put(K key,V value);
    V get(K key);
}
