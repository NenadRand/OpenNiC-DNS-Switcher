package test;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;

import data.OldNameServers;

public class test {
	
	
	
	public static void main(String[] args) {
		//System.setProperties();
		//System.getProperties();
		String ipOne = "1.0.0.0";
		String ipTwo = "2.0.0.0";
		String ipThree = "3.0.0.0";
		String ipFour = "4.0.0.0";
		ArrayList<String> tempIP = new ArrayList<String>(), newArrayList;
		OldNameServers oldServers;
		tempIP.add(ipOne);
		tempIP.add(ipTwo);
		tempIP.add(ipThree);
		tempIP.add(ipFour);
		oldServers = new OldNameServers(tempIP);
		newArrayList = oldServers.getNameServers();
		InetAddress ipAddressString = null;
		String ipAdd = null;
		try {
			ipAddressString = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (!ipAddressString.isLoopbackAddress()) {
			ipAdd = ipAddressString.getHostAddress();
			System.out.println("Canonical Hostname: " + ipAddressString.getCanonicalHostName() + "\n");
		}
		System.out.println("toString()");
		System.out.println(oldServers.toString());
		System.out.println("theCopiedArray");
		int i, arraySize = newArrayList.size();
		for(i = 0; i < arraySize; i++) {
			System.out.println(newArrayList.get(i));
		}
		System.out.println("The IP Address: " + ipAdd);
	}
	
}
