/*

https://algs4.cs.princeton.edu/34hash/SeparateChainingHashST.java.html
https://www.di.fc.ul.pt/~mal/aed/map/src/HashtableChain.java


 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSHashMap;

import java.util.LinkedList;

/**
 *
 * @author jeffrey.schneider
 */
@Deprecated
public class HashMapChainDepricated<K,V> implements HashMap<K,V> {
    /** the table*/
    private LinkedList<Entry <K,V>>[] table;
    /** the number of keys */
    private int numKeys;
    /** the capacity */
    private static final int CAPACITY = 13;
    /** the maximum load factor */
    private static final double LOAD_THRESHOLD = 3.0;
    
    //Constructor
    @Deprecated
    public HashMapChainDepricated(){
        table = new LinkedList[CAPACITY];
    }
    
    
    /**
     * Obtain the value associated with a given key...
     * @param key
     * @return The value associated with this key if found; otherwise null
     */
    @Override
    @Deprecated
    public V get(Object key) {
        int index = key.hashCode() % table.length;
        if(index <0)
            index += table.length;
        if(table[index] == null)
            return null;  //key is not in table
        
        //Search the list at table[index] to find the key.
        for(Entry<K,V> nextItem: table[index]){
            if(nextItem.key.equals(key))
                return nextItem.value;
        }
        //assert: key is not in the table;
        return null;
    }   
    

    @Override
    @Deprecated
    public boolean isEmpty() {
        return numKeys == 0;
    }

    @Override
    //Added note
    /**
	 * Method put for class HashtableChain. post: This key-value pair is
	 * inserted in the table and numKeys is incremented. If the key is already
	 * in the table, its value is changed to the argument value and numKeys is
	 * not changed.
	 * 
	 * @param key
	 *            The key of item being inserted
	 * @param value
	 *            The value for this key
	 */
    @Deprecated
    public V put(K key, V value) {
        int index = key.hashCode() % table.length;
        if(index < 0)
            index += table.length;
        if(table[index] == null){
            //create a new linked list at table[index]
            table[index] = new LinkedList<Entry<K, V>>();//<-- 
        }
        
        //Search the list at table[index] to find the key.
        for(Entry<K,V> nextItem: table[index]){
            //if the search is successful, replace the old value.
            if(nextItem.key.equals(key)){
                //Replace value for this key
                V oldVal = nextItem.value;
                nextItem.setValue(value);
                return oldVal;
            }
        }        
        //assert: key is not in the table, add new item.
        table[index].addFirst(new Entry<K, V>(key,value));
        numKeys++;
        if(numKeys > (LOAD_THRESHOLD * table.length))
            rehash();
        return null;
    }

    @Override
    @Deprecated
    public V remove(Object key) {
        if( key == null) throw new IllegalArgumentException("Can't remove() a null.");
        //return null;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    @Override
    @Deprecated
    public int size() {
        return numKeys;
    }
    
    public void rehash(){
    
    }
 
    
    //Inner class
    @Deprecated
    public static class Entry<K,V> {
    /** The key */
    private K key;
    /** the value */
    private V value;
    
    /** Creates a new key-value pair.
     * @param key The key
     * @param value The value
     */
    @Deprecated
    public Entry(K key, V value){
        this.key = key;
        this.value = value;
    }
    
    /**Retrieves the key
     * @return The key
     */
    @Deprecated
    public K getKey(){
        return key;
    }

    /**Retrieves the value
     * @return The value;
     */
    @Deprecated
    public V getValue(){
        return value;
    }
    
    /** Sets the value
     * @param val The new value
     * @return The old value
     */
    @Deprecated
    public V setValue(V val){
        V oldVal = value;
        value = val;
        return oldVal;
    }
    
    //Added this after printing
    @Deprecated
    public boolean equals(Object other) {
			return other instanceof Entry
					&& key.equals(((Entry<K, V>) other).key);
    }
    
    //Added this after printing
    /** The textual representation of this entry. */
    @Deprecated
    public String toString(){
        return "(" + key + ", " + value + ")";
    }
}
}
