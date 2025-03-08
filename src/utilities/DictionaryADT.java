package utilities;

/**
 * DictionaryADT.java
 *
 * @author Mace Howald, Ethan Van De Woestyne
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
	 * Returns the value associated with the specified key in the dictionary.
	 *
	 * @param key The key whose associated value is to be returned
	 * @return The value associated with the specified key, or null if the key is not found
	 *
	 * Pre: Key is not null.
	 * Post: Returns the value associated with the specified key, or null if the key is not found.
	 */
	V get(Object key);

	/**
	 * Associates the specified value with the specified key in the dictionary, or
	 * updates it if the key already exists.
	 *
	 * @param key The key with which the specified value is to be associated
	 * @param value The value to be associated with the specified key
	 * @return The previous value associated with the key, or null if there was no mapping
	 *
	 * Pre: Key and value are not null.
	 * Post: The key-value pair is stored in the dictionary. If the key already existed,
	 *       its value is updated and the old value is returned.
	 */
	V put(K key, V value);
	
	/**
	 * Removes the key-value pair for the specified key from the dictionary if present.
	 *
	 * @param key The key whose mapping is to be removed from the dictionary
	 * @return The value previously associated with the key, or null if the key is not found
	 *
	 * Pre: Key is not null.
	 * Post: If the key was found, the key-value pair is removed from the dictionary
	 *       and the value is returned. If the key was not found, null is returned.
	 */
	V remove(Object key);
}
