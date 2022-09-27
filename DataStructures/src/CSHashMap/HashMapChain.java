package CSHashMap;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;

/**
 *
 * https://www.di.fc.ul.pt/~mal/aed/map/src/HashtableChain.java
 *
 *
 * Hash table implementation using chaining.
 *
 * @author Koffman and Wolfgang
 * @author Vasco T. Vasconcelos
 */
public class HashMapChain<K, V> implements Cloneable {

    /**
     * The array holding the elements in the table. Why not a List (the
     * interface)? Because it does not extend the Cloneable interface.
     */
    private LinkedList<Entry<K, V>>[] table;

    /**
     * The number of keys in this table.
     */
    private int numKeys;

    /**
     * The initial capacity of this table.
     */
    private static final int INITIAL_CAPACITY = 13;

    /**
     * The maximum load factor for this table.
     */
    private static final double LOAD_THRESHOLD = 3.0;

    /**
     * The key-value pairs for a hash table.
     */
    private static class Entry<K, V> {

        /**
         * The key
         */
        @SuppressWarnings("FieldMayBeFinal")
        private K key;

        /**
         * The value
         */
        private V value;

        /**
         * Creates a new key-value pair.
         *
         * @param key The key
         * @param value The value
         */
        private Entry(K key, V value) {
            this.key = key;
            this.value = value;
            System.out.println("New entry made");
        }

        /**
         * Is this entry equals to another entry?
         */
        @SuppressWarnings("unchecked")
        @Override
        public boolean equals(Object other) {            
            return other instanceof Entry
                    && key.equals(((Entry<K, V>) other).key);
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 41 * hash + Objects.hashCode(this.key);
            hash = 41 * hash + Objects.hashCode(this.value);
            return hash;
        }

        /**
         * The textual representation of this entry.
         */
        @Override
        public String toString() {
            return "(" + key + ", " + value + ")";
        }
    }

    /**
     * Construct an empty hash table.
     */
    @SuppressWarnings("unchecked")
    public HashMapChain() {
        table = new LinkedList[INITIAL_CAPACITY];
        System.out.println("Empty table built");
        // Java cannot create a generic array of LinkedList<Entry<K, V>>
    }

    /**
     * Obtain the value associated with a given key..
     *
     * @param key The key being sought
     * @return The value associated with this key if found; otherwise, null
     */
    public V get(K key) {
        System.out.println("In get " + key);
        int index = hash(key);
        if (table[index] != null) {
            // Search the list at table[index] to find the key.
            for (Entry<K, V> nextItem : table[index]) {
                if (nextItem.key.equals(key)) {
                    return nextItem.value;
                }
            }
        }
        // assert: key is not in the table.
        return null;
    }

    /**
     * Method put for class HashMapChain. post: This key-value pair is inserted
     * in the table and numKeys is incremented. If the key is already in the
     * table, its value is changed to the argument value and numKeys is not
     * changed.
     *
     * @param key The key of item being inserted
     * @param value The value for this key
     */
    public void put(K key, V value) {
        System.out.println("Put: " + key + " " + value);
        int index = hash(key);
        if (table[index] == null) {
            // Create a new linked list at table[index].
            table[index] = new LinkedList<>();
            System.out.println("New linked list created");
        }
        // Search the list at table[index] to find the key.
        for (Entry<K, V> nextItem : table[index]) {
            // If the search is successful, replace the old value.
            if (nextItem.key.equals(key)) {
                nextItem.value = value;
                return;
            }
        }
        // assert: key is not in the table, add new item.
        table[index].addFirst(new Entry<>(key, value));        
        numKeys++;
        double loadFactor = (double) numKeys / table.length;
        System.out.println("Adding new item: " + key + " " + value+ " Load factor: " + loadFactor);
        if (loadFactor > LOAD_THRESHOLD) {
            rehash();
        }
    }

    /**
     * Is a given key present in this table?
     *
     * @param key The key being sought
     * @return 
     */
    public boolean containsKey(K key) {
        System.out.println("In containsKey: " + key);
        int index = hash(key);
        return table[index] != null
                && table[index].contains(new Entry<>(key, null));
    }

    /**
     * The index where the entry containing a given key is, or the index where
     * it should be included.
     * 
     *  0x7fffffff is a bitmask. In low-level computation, it's an efficient way to 
     * clear out bits of register. In this case, the mask has all bits of a 32 bit 
     * integer set, except the signed bit. The signed bit is the bit that determines 
     * if the number is positive or negative. ANDing (&) with this mask effectively 
     * sets the signed bit to 0, which means the number will always be positive.
     *
     * @param key The key being sought.
     */
    private int hash(K key) {
        System.out.println("In hash: " + key);
        return (key.hashCode() & 0x7fffffff) % table.length;
    }

    /**
     * The number of entries in the map.
     * @return 
     */
    public int size() {
        return numKeys;
    }

    /**
     * Is this table empty?
     */
    public boolean isEmpty() {
        return numKeys == 0;
    }

    /**
     * Remove a key-value pair from this table.
     *
     * @param key The key of the pair.
     */
    public void remove(K key) {
        System.out.println("In remove: " + key);
        int index = hash(key);
        if (table[index] != null
                && table[index].remove(new Entry<K, V>(key, null))) {
            numKeys--;
        }
    }

    /**
     * Increase the size of the array holding the entries in the table.
     */
    @SuppressWarnings("unchecked")
    private void rehash() {
        System.out.println("Rehashing" + Arrays.toString(table));
        LinkedList<Entry<K, V>>[] oldTable = table;
        table = new LinkedList[2 * table.length];
        numKeys = 0;
        
        for (LinkedList<Entry<K, V>> l : oldTable) {
            if (l != null) {
                for (Entry<K, V> e : l) {
                    put(e.key, e.value);
                }
            }
        }
    }

    /**
     * The textual representation of this table.
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        for (LinkedList<Entry<K, V>> l : table) {
            if (l != null) {
                builder.append(l);
                builder.append(" ");
            }
        }
        builder.append("]");
        return builder.toString();
    }

    /**
     * A faithful copy of this table.
     */
    @SuppressWarnings("unchecked")
    @Override
    public HashMapChain<K, V> clone() {
        System.out.println("Cloning");
        try {
            HashMapChain<K, V> result = (HashMapChain<K, V>) super.clone();
            result.table = table.clone();
            for (int i = 0; i < table.length; i++) {
                if (table[i] != null) {
                    result.table[i] = new LinkedList<Entry<K, V>>();
                    for (Entry<K, V> e : table[i]) {
                        result.table[i].add(new Entry<K, V>(e.key, e.value));
                    }
                }
            }
            return result;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e.toString());
        }
    }

    /**
     * A faithful copy of this table.
     */
    @SuppressWarnings("unchecked")
    public boolean equals(Object other) {
        return this == other || other instanceof HashMapChain
                && equalTables((HashMapChain<K, V>) other);
    }

    /**
     * Is this table equal to a given table?
     *
     * @param other The other table.
     */
    private boolean equalTables(HashMapChain<K, V> other) {
        if (numKeys != other.numKeys) {
            return false;
        }
        for (LinkedList<Entry<K, V>> l : table) {
            if (l != null) {
                for (Entry<K, V> e : l) {
                    if (!e.value.equals(other.get(e.key))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
