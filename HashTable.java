import java.util.LinkedList;
import java.util.Map;

public class HashTable<K, V> {
    private final int length = 16;
    private final int XOR = 339339993;
    LinkedList<Tuple<K, V>>[] array = new LinkedList[length];
    private int size = 0;


    public void put(K key, V value) {
        int index = hash(key);
        if (array[index] == null) {
            array[index] = new LinkedList<Tuple<K, V>>();
        }
        for (Tuple<K, V> tuple : array[index]){
            if (tuple.getKey().equals(key)){
                tuple.setValue(value);
                return;
            }
        }
        array[index].add(new Tuple<K, V>(key, value));
        size++;
    }
    public LinkedList<Tuple<K, V>> get(K key) {
        int index = hash(key);
        return array[index];
    }
    public void remove(K key){
        int index = hash(key);
        for (var i : array[index]){
            if (i.getKey() == key){
                array[index].remove(i);
            }
        }
        size--;
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("HashTable\n");
        for (int i = 0; i < length; ++i) {
            if (array[i] != null) {
                for (var j : array[i]) {
                    sb.append("Key: " + j.getKey() + " | HashKey: " + hash(j.getKey()) + " | Value: " + j.getValue() + '\n');
                }
            }
        }
        return sb.toString();
    }

    private int hash(K key){
        return Math.abs((key.hashCode() ^ XOR) % length);
    }
}
class Tuple<K, V> implements Map.Entry<K, V> {
    private K key;
    private V value;

    Tuple(K key, V value){
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public V setValue(Object value) {
        this.value = (V) value;
        return (V) value;
    }
}
