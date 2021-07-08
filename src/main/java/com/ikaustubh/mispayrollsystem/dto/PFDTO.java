/**
 * 
 */
package com.ikaustubh.mispayrollsystem.dto;

/**
 * This class hold the PF detail of <code>Employee</code>.
 * 
 * @author Dnyaneshwar
 * @since 29-June-2021
 *
 */
public class PFDTO {
		
	private Boolean isEPFApplicable = new Boolean(false);
	
	private String memberId;

	private long uanNo;
	
	private String epfName;
		
	public PFDTO() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @return the isEPFApplicable
	 */
	public Boolean getIsEPFApplicable() {
		return isEPFApplicable;
	}

	/**
	 * @param isEPFApplicable the isEPFApplicable to set
	 */
	public void setIsEPFApplicable(Boolean isEPFApplicable) {
		this.isEPFApplicable = isEPFApplicable;
	}



	/**
	 * @return the memberId
	 */
	public String getMemberId() {
		return memberId;
	}

	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	/**
	 * @return the uanNo
	 */
	public long getUanNo() {
		return uanNo;
	}

	/**
	 * @param uanNo the uanNo to set
	 */
	public void setUanNo(long uanNo) {
		this.uanNo = uanNo;
	}

	/**
	 * @return the epfName
	 */
	public String getEpfName() {
		return epfName;
	}

	/**
	 * @param epfName the epfName to set
	 */
	public void setEpfName(String epfName) {
		this.epfName = epfName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PFDTO [isEPFApplicable=" + isEPFApplicable + ", memberId=" + memberId + ", uanNo=" + uanNo
				+ ", epfName=" + epfName + "]";
	}
	
}
