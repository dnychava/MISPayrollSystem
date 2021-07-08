/**
 * 
 */
package com.ikaustubh.mispayrollsystem.dto;

/**
 * This class hold the Bank detail of <code>Employee</code>.
 * 
 * @author Dnyaneshwar
 * @since 29-June-2021
 *
 */
public class BankDTO {
		
	private long accountNo;
	
	private String name;
	
	private String ifscCode;
		
	public BankDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the accountNo
	 */
	public long getAccountNo() {
		return accountNo;
	}

	/**
	 * @param accountNo the accountNo to set
	 */
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the ifscCode
	 */
	public String getIfscCode() {
		return ifscCode;
	}

	/**
	 * @param ifscCode the ifscCode to set
	 */
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BankDTO [accountNo=" + accountNo + ", name=" + name + ", ifscCode=" + ifscCode + "]";
	}
	
	
}
