/**
 * @className Entry
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/4/23 11:29
 * @Version 1.0
 **/
public class Entry<K,V> {
    K key;
    V value;
    Entry<K,V> next=null;
    public Entry(K key,V value){
        this.key=key;
        this.value=value;
    }

    public K getKey() {
        return key;
    }
    public V getValue(){
        return value;
    }
}
