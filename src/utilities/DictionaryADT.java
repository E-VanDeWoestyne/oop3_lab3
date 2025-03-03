package utilities;

/**
 * DictionaryADT.java
 *
 * @author your name
 * @version major.minor revision number starting at 1.0
 * 
 *          Class Definition: This interface represents the public contract for
 *          the implementation of Dictionary for the DictionaryADT Lab.
 */

public interface DictionaryADT<K, V>
{
	int size();

	boolean isEmpty();

	boolean containsKey(Object Key);

	V get(Object key);

	V put(K key, V value);

	V remove(Object key);
}
