package com.ikaustubh.mispayrollsystem.entities;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 
 * @author Dnyaneshwar Chavan
 * @since 01-July-2021
 *
 */

@Entity
@Table(name = "EMP_TBL", indexes = {
		@Index(columnList = " EMP_TBL_FIRST_NAME, EMP_TBL_MIDLE_NAME, EMP_TBL_LAST_NAME", 
				name = "emp_tbl_index"),
		@Index(columnList = " EMP_TBL__UNIT_RID", 
				name = "emp_tbl__unit_index"),
		@Index(columnList = " EMP_TBL__DESIGNATION_RID", 
				name = "emp_tbl__designation_index")})
public class EmployeeEntity {

	@Id
	@GenericGenerator(name = "sequence_emp_id", strategy = "com.ikaustubh.mispayrollsystem.custom.ids.EmployeeIdCustom")
	@GeneratedValue(generator = "sequence_emp_id")  
	@Column(name = "EMP_TBL_RID", length = 10, nullable = false)
	private String rid;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "EMP_TBL__UNIT_RID", nullable = false, referencedColumnName = "UNIT_RID")
	private UnitEntity unitEntity;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "EMP_TBL__DESIGNATION_RID", nullable = false, referencedColumnName = "DESIGNATION_RID")
	private DesignationEntity designationEntity;
	
	@JsonIgnore
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "emplEntity", cascade = CascadeType.ALL)
	private PFEntity pfEntity;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "EMP_TBL__BANK_DTL_RID", nullable = false, referencedColumnName = "BANK_DTL_RID")
	private BankEntity bankEntity;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "EMP_TBL__DOC_TBL_RID", nullable = true, referencedColumnName = "DOC_TBL_RID")
	private DocumentEntity documentEntity;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "EMP_TBL__ADDRESS_RID", nullable = true, referencedColumnName = "ADDRESS_RID")
	private AddressEntity addressEntity;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "empEntity", cascade = CascadeType.ALL)
	private Set<SalaryEntity> salaryEntities = new HashSet<SalaryEntity>();

	@Column(name = "EMP_TBL_FIRST_NAME", nullable = false, length = 20)
	private String firstName;

	@Column(name = "EMP_TBL_MIDLE_NAME", nullable = false, length = 20)
	private String midleName;

	@Column(name = "EMP_TBL_LAST_NAME", nullable = false, length = 20)
	private String lastName;

	@Column(name = "EMP_TBL_GENDER", nullable = false, length = 10)
	private String gender;

	@Column(name = "EMP_TBL_DOB", nullable = true)
	private LocalDateTime dateOfBirth;

	@Column(name = "EMP_TBL_EMAIL_ID", nullable = false, length = 100)
	private String emailId;

	@Column(name = "EMP_TBL_MOBILE_NO", nullable = false, length = 13)
	private long mobileNo;
	
	@Column(name = "EMP_TBL_IS_EPF_APPLICABLE", nullable = false)
	@ColumnDefault(value="false")
	private boolean isEPFApplicable = false;
	
	@Column(name = "EMP_TBL_IS_HANDICAP", nullable = false)
	@ColumnDefault(value="false")
	private boolean isHandicap = false;
	
	@Column(name = "EMP_TBL_ADHAR_NO", nullable = false, length = 13)
	private long adharNo;
	
	@Column(name = "EMP_TBL_IS_ACTIVE", nullable = false)
	@ColumnDefault(value="true")
	private boolean isActive = true;

	@Column(name = "EMP_TBL_REMARK", nullable = true, length = 100)
	private String remark;
	
	@Column(name = "EMP_TBL_CREATED_BY", nullable = true, length = 15)
	private String yCreatedBy;

	@Column(name = "EMP_TBL_CREATED_TIMESTAMP", nullable = true)
	private LocalDateTime yCreatedDateAndTime;

	@Column(name = "EMP_TBL_MODIFIED_BY", nullable = true, length = 15)
	private String zModifiedBy;

	@Column(name = "EMP_TBL_MODIFIED_TIMESTAMP", nullable = true)
	private LocalDateTime zModifiedDateAndTime;

	/**
	 * @return the unitEntity
	 */
	public UnitEntity getUnitEntity() {
		return unitEntity;
	}

	/**
	 * @param unitEntity the unitEntity to set
	 */
	public void setUnitEntity(UnitEntity unitEntity) {
		this.unitEntity = unitEntity;
	}

	/**
	 * @return the designationEntity
	 */
	public DesignationEntity getDesignationEntity() {
		return designationEntity;
	}

	/**
	 * @param designationEntity the designationEntity to set
	 */
	public void setDesignationEntity(DesignationEntity designationEntity) {
		this.designationEntity = designationEntity;
	}

	/**
	 * @return the pfEntity
	 */
	public PFEntity getPfEntity() {
		return pfEntity;
	}

	/**
	 * @param pfEntity the pfEntity to set
	 */
	public void setPfEntity(PFEntity pfEntity) {
		this.pfEntity = pfEntity;
	}

	/**
	 * @return the bankEntity
	 */
	public BankEntity getBankEntity() {
		return bankEntity;
	}

	/**
	 * @param bankEntity the bankEntity to set
	 */
	public void setBankEntity(BankEntity bankEntity) {
		this.bankEntity = bankEntity;
	}

	/**
	 * @return the documentEntity
	 */
	public DocumentEntity getDocumentEntity() {
		return documentEntity;
	}

	/**
	 * @param documentEntity the documentEntity to set
	 */
	public void setDocumentEntity(DocumentEntity documentEntity) {
		this.documentEntity = documentEntity;
	}

	/**
	 * @return the addressEntity
	 */
	public AddressEntity getAddressEntity() {
		return addressEntity;
	}

	/**
	 * @param addressEntity the addressEntity to set
	 */
	public void setAddressEntity(AddressEntity addressEntity) {
		this.addressEntity = addressEntity;
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
	 * @return the midleName
	 */
	public String getMidleName() {
		return midleName;
	}

	/**
	 * @param midleName the midleName to set
	 */
	public void setMidleName(String midleName) {
		this.midleName = midleName;
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
	 * @return the isEPFApplicable
	 */
	public boolean isEPFApplicable() {
		return isEPFApplicable;
	}

	/**
	 * @param isEPFApplicable the isEPFApplicable to set
	 */
	public void setEPFApplicable(boolean isEPFApplicable) {
		this.isEPFApplicable = isEPFApplicable;
	}

	/**
	 * @return the isHandicap
	 */
	public boolean isHandicap() {
		return isHandicap;
	}

	/**
	 * @param isHandicap the isHandicap to set
	 */
	public void setHandicap(boolean isHandicap) {
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
	 * @return the isActive
	 */
	public boolean isActive() {
		return isActive;
	}

	/**
	 * @param isActive the isActive to set
	 */
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
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
	public String getRid() {
		return rid;
	}

	/**
	 * @return the salaryEntities
	 */
	public Set<SalaryEntity> getSalaryEntities() {
		return salaryEntities;
	}

	/**
	 * @param salaryEntities the salaryEntities to set
	 */
	public void setSalaryEntities(Set<SalaryEntity> salaryEntities) {
		this.salaryEntities = salaryEntities;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmployeeEntity [rid=" + rid + ", firstName=" + firstName + ", midleName=" + midleName + ", lastName="
				+ lastName + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth + ", emailId=" + emailId
				+ ", mobileNo=" + mobileNo + ", isEPFApplicable=" + isEPFApplicable + ", isHandicap=" + isHandicap
				+ ", adharNo=" + adharNo + ", isActive=" + isActive + ", remark=" + remark + ", yCreatedBy="
				+ yCreatedBy + ", yCreatedDateAndTime=" + yCreatedDateAndTime + ", zModifiedBy=" + zModifiedBy
				+ ", zModifiedDateAndTime=" + zModifiedDateAndTime + "]";
	}
	
}
