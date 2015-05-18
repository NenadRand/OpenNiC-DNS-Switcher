package data;

public class SystemAddress {
	private String oldPrimaryDNS;
	private String oldSecondaryDNS;
	private String opennicPrimaryDNS;
	private String opennicSecondaryDNS;
	
	public SystemAddress() {
		
	}
	
	public SystemAddress(final String oldPrimaryDNS, final String oldSecondaryDNS, final String opennicPrimaryDNS, final String opennicSecondaryDNS) {
		this.oldPrimaryDNS = oldPrimaryDNS;
		this.oldSecondaryDNS = oldSecondaryDNS;
		this.opennicPrimaryDNS = opennicPrimaryDNS;
		this.opennicSecondaryDNS = opennicSecondaryDNS;
	}
	
	final public String getOldPrimaryServer() {
		return this.oldPrimaryDNS;
	}
	
	final public void setOldPrimaryServer(final String theServer) {
		this.oldPrimaryDNS = theServer;
	}
	
	final public String getOldSecondaryServer() {
		return this.oldSecondaryDNS;
	}
	
	final public void setOldSecondaryServer(final String theServer) {
		this.oldSecondaryDNS = theServer;
	}
	
	final public String getOpennicPrimaryServer() {
		return this.opennicPrimaryDNS;
	}
	
	final void setOpennicPrimaryServer(final String theServer) {
		this.opennicPrimaryDNS = theServer;
	}
	
	final public String getOpennicSecondaryServer() {
		return this.opennicSecondaryDNS;
	}
	
	final public void setOpennicSecondaryServer(final String theServer) {
		this.opennicSecondaryDNS = theServer;
	}
}
