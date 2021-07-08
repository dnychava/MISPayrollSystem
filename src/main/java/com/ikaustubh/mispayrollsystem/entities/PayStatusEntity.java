package com.ikaustubh.mispayrollsystem.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * This entity is showing the a current status of the <B>PAYMENT</B> record.
 * 
 * @author Dnyaneshwar Chavan
 * @since 06-June-2021
 */

@Entity
@Table(name = "PAY_STATUS")
//@Scope("global-session")
public class PayStatusEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PAY_STATUS_RID", length = 10, nullable = false)
	private long rid;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "PAY_STATUS__PAY_DTL_RID", nullable = false, referencedColumnName = "PAY_DTL_RID")
	private PayEntity payEntity;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "PAY_STATUS__RECORD_STATUS_RID", nullable = false, referencedColumnName = "RECORD_STATUS_RID")
	private RecordStatusEntity recordStatusEntity;
	
	@Column(name = "PAY_STATUS_CHANGE_DATE", nullable = false)
	private LocalDate changeDate;
	
	@Column(name = "PAY_STATUS_REMARK", nullable = true, length = 100)
	private String remark;
		
	@Column(name = "PAY_STATUS_CREATED_BY", nullable = true, length = 15)
	private String yCreatedBy;

	@Column(name = "PAY_STATUS_CREATED_TIMESTAMP", nullable = true)
	private LocalDateTime yCreatedDateAndTime;

	/**
	 * @return the payEntity
	 */
	public PayEntity getPayEntity() {
		return payEntity;
	}

	/**
	 * @param payEntity the payEntity to set
	 */
	public void setPayEntity(PayEntity payEntity) {
		this.payEntity = payEntity;
	}

	/**
	 * @return the recordStatusEntity
	 */
	public RecordStatusEntity getRecordStatusEntity() {
		return recordStatusEntity;
	}

	/**
	 * @param recordStatusEntity the recordStatusEntity to set
	 */
	public void setRecordStatusEntity(RecordStatusEntity recordStatusEntity) {
		this.recordStatusEntity = recordStatusEntity;
	}

	/**
	 * @return the changeDate
	 */
	public LocalDate getChangeDate() {
		return changeDate;
	}

	/**
	 * @param changeDate the changeDate to set
	 */
	public void setChangeDate(LocalDate changeDate) {
		this.changeDate = changeDate;
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
		return "PayStatusEntity [rid=" + rid + ", changeDate=" + changeDate + ", remark=" + remark + ", yCreatedBy="
				+ yCreatedBy + ", yCreatedDateAndTime=" + yCreatedDateAndTime + "]";
	}

}
