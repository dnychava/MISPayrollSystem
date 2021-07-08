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
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * This entity is represent the PF details of the employee <BR>
 * 
 * @author Dnyaneshwar Chavan
 * @since 06-June-2021
 */

@Entity
@Table(name = "PF_DTL")
public class PFEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PF_DTL_RID", length = 10, nullable = false)
	private long rid;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "PF_TBL__EMP_TBL_RID", nullable = false, referencedColumnName = "EMP_TBL_RID")
	private EmployeeEntity emplEntity;
	
	@Column(name = "PF_DTL_MEMBER_ID", nullable = false, length = 30)
	private String memberId;
	
	@Column(name = "PF_DTL_UAN_NO", unique = true, nullable = false, length = 20)
	private long uanNo;
	
	@Column(name = "PF_DTL_EPF_NAME", unique = true, nullable = false, length = 100)
	private String epfName;
	
	@Column(name = "PF_DTL_CREATED_BY", nullable = true, length = 15)
	private String yCreatedBy;

	@Column(name = "PF_DTL_CREATED_TIMESTAMP", nullable = true)
	private LocalDateTime yCreatedDateAndTime;

	@Column(name = "PF_DTL_MODIFIED_BY", nullable = true, length = 15)
	private String zModifiedBy;

	@Column(name = "PF_DTL_MODIFIED_TIMESTAMP", nullable = true)
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
		return "PFEntity [rid=" + rid + ", memberId=" + memberId + ", uanNo=" + uanNo + ", epfName=" + epfName
				+ ", yCreatedBy=" + yCreatedBy + ", yCreatedDateAndTime="
				+ yCreatedDateAndTime + ", zModifiedBy=" + zModifiedBy + ", zModifiedDateAndTime="
				+ zModifiedDateAndTime + "]";
	}
	
}
