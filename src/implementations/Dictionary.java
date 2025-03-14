package implementations;

import java.util.ArrayList;

import exceptions.DuplicateKeyException;
import utilities.DictionaryADT;

/**
* Dictionary.java
*
* @author Mace Howald & ...
* @version 1.2
* 
* Class Definition: This interface is the implementation
* of the Dictionary for the DictionaryADT Lab. This data type 
* will store data in (key, value) pairs and keys must be unique. 
*/


public class Dictionary<K,V> implements DictionaryADT<K,V>
{
	// constant
	private static final int DEFAULT_SIZE = 10;
	
	// index indicates pairing, e.g. keys[1] is stored at values[1]
	private ArrayList<K> keys;
	private ArrayList<V> values;
	
	
	// Both the create method and constructors seem to do the same thing but the DictionartADT wants the create method
	// and the DictionaryUnitTest wants the constructors
	
	// Constructor to initialize with a specified size
    public Dictionary(int size) {
        keys = new ArrayList<>(size);
        values = new ArrayList<>(size);
    }
    //constructor with no size specified.
    public Dictionary(){
        keys = new ArrayList<>(DEFAULT_SIZE);
        values = new ArrayList<>(DEFAULT_SIZE);
    }
	
    
    
	@Override
	public void create(int size) {
		// TODO Auto-generated method stub
		if (size > 0) {
			keys = new ArrayList<>(size);
	        values = new ArrayList<>(size);
		} else {
			keys = new ArrayList<>(DEFAULT_SIZE);
	        values = new ArrayList<>(DEFAULT_SIZE);
		}
	}
	
	
	@Override
	public boolean insert(K key, V value) throws DuplicateKeyException {
		if (key == null || value == null) {
			return false; // Return false if null
		}
		
		if (keys.contains(key)) {
			throw new DuplicateKeyException(); // Throw exception if duplicate key
		}
		
		keys.add(key);
		values.add(value);
		return true;
	}
	@Override
	public V remove(K key) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean update(K key, V value) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public V lookup(K key) {
		// TODO Auto-generated method stub
		return null;
	}

}
