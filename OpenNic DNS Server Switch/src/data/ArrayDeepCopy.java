package data;

public class ArrayDeepCopy {

	public ArrayDeepCopy() {
		
	}
	
	public <T> T[][] copyArray(T[][] theArray) {
		T[][] newArray = theArray.clone();
		int i, j, iSize = theArray.length, jSize = theArray[0].length;
		//newArray = new T[][];
		for (i = 0; i < iSize; i++) {
			for (j = 0; j < jSize; j++) {
				newArray[i][j] = theArray[i][j];
			}
		}
		
		return newArray;
		
	}
}
