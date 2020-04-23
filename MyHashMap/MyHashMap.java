/**
 * @className MyHashMap
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/4/23 11:32
 * @Version 1.0
 **/
public class MyHashMap<K,V> implements Map<K,V> {

    Entry<K,V>[] table=new Entry[16];
    int size=0;
    public static final double LOADER_FACTORY_THERSHOLD=0.75;
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return 0==size;
    }

    @Override
    public V put(K key, V value) {
        int hash=key.hashCode();
        hash=(hash>>>16)^hash;
        int index=hash&(table.length-1);
        Entry<K,V> head=table[index];
        Entry<K,V> node=head;
        while(node!=null){
            if(key.equals(node.key)){
                V old=node.value;
                node.value=value;
                return old;
            }
            node=node.next;
        }
        Entry<K,V> entry=new Entry<>(key,value);
        if(head==null){
            table[index]=entry;
        }else{
            entry.next=table[index];
            table[index]=entry;
        }
        return value;
    }

    @Override
    public V get(K key) {
        return null;
    }
}
