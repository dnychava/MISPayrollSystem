package com.ikaustubh.mispayrollsystem.entities;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * This entity is represent the Bank details of the employee <BR>
 * 
 * @author Dnyaneshwar Chavan
 * @since 06-June-2021
 */

@Entity
@Table(name = "BANK_DTL")
//@Scope("global-session")
public class BankEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "BANK_DTL_RID", length = 10, nullable = false)
	private long rid;
	
	@JsonIgnore
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "bankEntity", cascade = CascadeType.ALL)
	private EmployeeEntity emplEntity;
	
	@Column(name = "BANK_DTL_ACCOUNT_NO", unique = false, nullable = false, length = 20)
	private long accountNo;
	
	@Column(name = "BANK_DTL_NAME", nullable = false, length = 50)
	private String name;
	
	@Column(name = "BANK_DTL_IFSC_CODE", unique = false, nullable = false, length = 15)
	private String ifscCode;
	
	@Column(name = "BANK_DTL_CREATED_BY", nullable = true, length = 15)
	private String yCreatedBy;

	@Column(name = "BANK_DTL_CREATED_TIMESTAMP", nullable = true)
	private LocalDateTime yCreatedDateAndTime;

	@Column(name = "BANK_DTL_MODIFIED_BY", nullable = true, length = 15)
	private String zModifiedBy;

	@Column(name = "BANK_DTL_MODIFIED_TIMESTAMP", nullable = true)
	private LocalDateTime zModifiedDateAndTime;

	/**
	 * @return the emplEntity
	 */
	public EmployeeEntity getEmplEntity() {
		return emplEntity;
	}

	/**
	 * @param emplEntity the emplEntity to set
	 */
	public void setEmplEntity(EmployeeEntity emplEntity) {
		this.emplEntity = emplEntity;
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

	/**
	 * @return the yCreatedBy
	 */
	public String getyCreatedBy() {
		return yCreatedBy;
	}

	/**
	 * @param yCreatedBy the yCreatedBy to set
	 */
	public void setyCreatedBy(String yCreatedBy) {
		this.yCreatedBy = yCreatedBy;
	}

	/**
	 * @return the yCreatedDateAndTime
	 */
	public LocalDateTime getyCreatedDateAndTime() {
		return yCreatedDateAndTime;
	}

	/**
	 * @param yCreatedDateAndTime the yCreatedDateAndTime to set
	 */
	public void setyCreatedDateAndTime(LocalDateTime yCreatedDateAndTime) {
		this.yCreatedDateAndTime = yCreatedDateAndTime;
	}

	/**
	 * @return the zModifiedBy
	 */
	public String getzModifiedBy() {
		return zModifiedBy;
	}

	/**
	 * @param zModifiedBy the zModifiedBy to set
	 */
	public void setzModifiedBy(String zModifiedBy) {
		this.zModifiedBy = zModifiedBy;
	}

	/**
	 * @return the zModifiedDateAndTime
	 */
	public LocalDateTime getzModifiedDateAndTime() {
		return zModifiedDateAndTime;
	}

	/**
	 * @param zModifiedDateAndTime the zModifiedDateAndTime to set
	 */
	public void setzModifiedDateAndTime(LocalDateTime zModifiedDateAndTime) {
		this.zModifiedDateAndTime = zModifiedDateAndTime;
	}

	/**
	 * @return the rid
	 */
	public long getRid() {
		return rid;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BankEntity [rid=" + rid + ", accountNo=" + accountNo + ", name=" + name + ", ifscCode=" + ifscCode
				+ ", yCreatedBy=" + yCreatedBy + ", yCreatedDateAndTime=" + yCreatedDateAndTime + ", zModifiedBy="
				+ zModifiedBy + ", zModifiedDateAndTime=" + zModifiedDateAndTime + "]";
	}	
}
