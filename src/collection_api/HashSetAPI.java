package collection_api;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * This class implements the Set interface, backed by a hash table. It makes no guarantees as to the iteration
 * order of the set; in particular, it does not guarantee that the order will remain constant over time.
 * This class permits the null element
 * This class offers constant time performance for the basic operations (add, remove, contains and size),
 * assuming the hash function disperses the elements properly among the buckets, Iterating over time this set
 * requires time proportional to the sum of the HashSet instance's size( the number of elements) plus the 
 * "capacity" of the backing HashMap instance (the number of buckets). Thus, It's very important not to set
 * the initial capacity too high (or the load factor too low) if iteration performance is important.
 * @author thangnd3
 *
 */
public class HashSetAPI<E> {
	
	private Set<E> hashSet;

	/*
	 * Constructs a new, empty set, the backing HashMap instance has default
	 * initial capacity
	 */
	public HashSetAPI() {
		hashSet = new HashSet<E>();
	}
	/*
	 * Constructs a new set containing the elements in the specified collection
	 */
	public HashSetAPI(Collection<? extends E> c){
		hashSet = new HashSet<E>(c);
	}
	/*
	 * constructs a new, empty set, the backing HashMap instance has the 
	 * specified initial capacity and the specified load factor
	 */
	public HashSetAPI(int initialCapacity, float loadFactor){
		hashSet = new HashSet<E>(initialCapacity, loadFactor);
	}
	/**
	 * 
	 */

}
