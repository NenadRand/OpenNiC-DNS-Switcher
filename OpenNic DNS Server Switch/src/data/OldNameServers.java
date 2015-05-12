package data;

import java.util.ArrayList;

public class OldNameServers {
	
	private ArrayList<String> nameServers;
	
	public OldNameServers(final ArrayList<String> theNameServers) {
		this.nameServers = theNameServers;
		
	}
	
	final public String getNameServer(final int theServerNumber) {
		return this.nameServers.get(theServerNumber);
	}
	
	final public ArrayList<String> getNameServers() {
		DeepCopy copy = new DeepCopy();
		ArrayList<String> returnValue = copy.deepCopy(this.nameServers);
		return returnValue;
	}
	public String toString() {
		String returnValue;
		StringBuilder tempString = new StringBuilder();
		int araySize = this.nameServers.size();
		int i;
		for (i = 0; i < araySize; i++) {
			tempString.append("Name Server " + i + ": " + this.nameServers.get(i) + "\n");
		}
		returnValue = tempString.toString();
		return returnValue;
	}
	
	final void addNameServer(final String theNameServer) {
		this.nameServers.add(theNameServer);
	}
	

	
	
}
