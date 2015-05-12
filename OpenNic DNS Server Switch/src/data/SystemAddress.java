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
	
	
}
