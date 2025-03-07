package utilities;

/**
 * DictionaryADT.java
 *
 * @author Mace Howald
 * @version 1.1
 * 
 *          Class Definition: This interface represents the public contract for
 *          the implementation of Dictionary for the DictionaryADT Lab.
 */

public interface DictionaryADT<K, V>
{
	/**
	 * Returns the number of key-value pairs in the dictionary
	 * 
	 * @return the number of key-value pairs in the dictionary
	 * 
	 * Post: Returns the size of the dictionary
	 */
	int size();
	
	/**
	 * Returns true if the dictionary is empty
	 * 
	 * @return true if the dictionary is empty
	 * 
	 * Post: Returns true if the dictionary is empty, false if not.
	 */
	boolean isEmpty();
	
	
	/**
	 * Returns true if the dictionary contains a specified key.
	 * 
	 * @param Key The specified to key to check for in the dictionary
	 * @return true if the specified key is found, false if not.
	 * 
	 * Pre: Key is not null.
	 * Post: Returns true if the specified key is found, false if not.
	 */
	boolean containsKey(Object Key);

	/**
	 * 
	 * @param key
	 * @return
	 */
	V get(Object key);

	/**
	 * 
	 * @param key
	 * @param value
	 * @return
	 */
	V put(K key, V value);
	
	/**
	 * 
	 * @param key
	 * @return
	 */
	V remove(Object key);
}
