/*
 https://www.java67.com/2012/08/5-difference-between-hashtable-hashmap-Java-collection.html
 */
package CSHashMap;

/**
 *
 * @author jeffrey.schneider
 */
public interface HashMap<K, V> {
    public  V get(Object key);
    public boolean isEmpty();
    public V put(K key, V value);
    public V remove(Object key);
    public int size();
    
}
