/**
 * 
 */
package com.ikaustubh.mispayrollsystem.dto;

/**
 * This class hold the Address detail of <code>Employee</code>.
 * 
 * @author Dnyaneshwar
 * @since 29-June-2021
 *
 */
public class AddressDTO {
		
	private String address;
	
	private String talk;
	
	private String dist;
	
	private int pinCode;
	
	private int phoneNo;
	
	public AddressDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the talk
	 */
	public String getTalk() {
		return talk;
	}

	/**
	 * @param talk the talk to set
	 */
	public void setTalk(String talk) {
		this.talk = talk;
	}

	/**
	 * @return the dist
	 */
	public String getDist() {
		return dist;
	}

	/**
	 * @param dist the dist to set
	 */
	public void setDist(String dist) {
		this.dist = dist;
	}

	/**
	 * @return the pinCode
	 */
	public int getPinCode() {
		return pinCode;
	}

	/**
	 * @param pinCode the pinCode to set
	 */
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	/**
	 * @return the phoneNo
	 */
	public int getPhoneNo() {
		return phoneNo;
	}

	/**
	 * @param phoneNo the phoneNo to set
	 */
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AddressDTO [address=" + address + ", talk=" + talk + ", dist=" + dist + ", pinCode=" + pinCode
				+ ", phoneNo=" + phoneNo + "]";
	}
	
}
