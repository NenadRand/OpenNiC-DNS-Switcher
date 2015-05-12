package data;

import java.util.ArrayList;

public class DeepCopy {
	
	public DeepCopy() {
		
	}
	
	final public <T> ArrayList<T> deepCopy(final ArrayList<T> theArrayListToCopy) {
		int oldArraySize = theArrayListToCopy.size(), i;
		ArrayList<T> returnValue = new ArrayList<T>(oldArraySize);
		for (i = 0; i < oldArraySize; i++) {
			returnValue.add(theArrayListToCopy.get(i));
		}
		return returnValue;		
	}

}
