package org.safari.struct.interpreter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import org.safari.struct.util.Platform;

/**
 * @class SymbolTable
 * 
 * @brief This class stores variables and their values for use by the
 *        Interpreter. It plays the role of the "Context" in the Interpreter
 *        pattern.
 */
public class SymbolTable {

	/** Hash table containing variable names and values */
	private HashMap<String, Integer> map = new HashMap<String, Integer>();

	public SymbolTable() {
	}

	/** If variable isn't set then assign it a 0 value. */
	public int get(String variable) {

		int result = 0;

		if (map.get(variable) != null) {

			result = map.get(variable);
		} else {
			map.put(variable, 0);
			result = 0;
		}

		return result;
	}

	/** Set the value of a variable. */
	public void set(String key, int value) {

		if (map.containsKey(key))
			map.put(key, value);
	}

	/**
	 * Print all variables and their values as an aid for debugging.
	 */
	public void print() {

		for (Iterator<Entry<String, Integer>> it = map.entrySet().iterator(); it
				.hasNext();) {
			Entry<String, Integer> x = it.next();
			Platform.instance().outputLine((x.getKey() + " = " + x.getValue()));
		}
	}

	/** Clean all variable and their values. */
	public void resetClearAll() {
		map.clear();
	}
}
