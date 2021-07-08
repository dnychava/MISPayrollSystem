/**
 * 
 */
package com.ikaustubh.mispayrollsystem.dto;

import java.time.LocalDateTime;

/**
 * This class hold the Employee detail.
 * 
 * @author Dnyaneshwar
 * @since 29-June-2021
 *
 */
public class EmployeeDTO {
		
    private DesignationDTO designation;
	
	private String firstName;
	
	private String middleName;
	
	private String lastName;
	
	private UnitDTO unit;
	
	private String gender;
	
	private LocalDateTime dateOfBirth;
	
	private LocalDateTime dateOfJoining;
	
	private Boolean isHandicap = new Boolean(false);

	private long adharNo;

	private long mobileNo;

	private String emailId;
	
	private AddressDTO address;
	
	private BankDTO bank;
	
	private PFDTO pf;
	
	public EmployeeDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the designation
	 */
	public DesignationDTO getDesignation() {
		return designation;
	}

	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(DesignationDTO designation) {
		this.designation = designation;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the unit
	 */
	public UnitDTO getUnit() {
		return unit;
	}

	/**
	 * @param unit the unit to set
	 */
	public void setUnit(UnitDTO unit) {
		this.unit = unit;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the dateOfBirth
	 */
	public LocalDateTime getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(LocalDateTime dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @return the dateOfJoining
	 */
	public LocalDateTime getDateOfJoining() {
		return dateOfJoining;
	}

	/**
	 * @param dateOfJoining the dateOfJoining to set
	 */
	public void setDateOfJoining(LocalDateTime dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	/**
	 * @return the isHandicap
	 */
	public Boolean getIsHandicap() {
		return isHandicap;
	}

	/**
	 * @param isHandicap the isHandicap to set
	 */
	public void setIsHandicap(Boolean isHandicap) {
		this.isHandicap = isHandicap;
	}

	/**
	 * @return the adharNo
	 */
	public long getAdharNo() {
		return adharNo;
	}

	/**
	 * @param adharNo the adharNo to set
	 */
	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}

	/**
	 * @return the mobileNo
	 */
	public long getMobileNo() {
		return mobileNo;
	}

	/**
	 * @param mobileNo the mobileNo to set
	 */
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @return the address
	 */
	public AddressDTO getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(AddressDTO address) {
		this.address = address;
	}

	/**
	 * @return the bank
	 */
	public BankDTO getBank() {
		return bank;
	}

	/**
	 * @param bank the bank to set
	 */
	public void setBank(BankDTO bank) {
		this.bank = bank;
	}

	/**
	 * @return the pf
	 */
	public PFDTO getPf() {
		return pf;
	}

	/**
	 * @param pf the pf to set
	 */
	public void setPf(PFDTO pf) {
		this.pf = pf;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmployeeDTO [designation=" + designation + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", unit=" + unit + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth
				+ ", dateOfJoining=" + dateOfJoining + ", isHandicap=" + isHandicap + ", adharNo=" + adharNo
				+ ", mobileNo=" + mobileNo + ", emailId=" + emailId + ", address=" + address + ", bank=" + bank
				+ ", pf=" + pf + "]";
	}
}
