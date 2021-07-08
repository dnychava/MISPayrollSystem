package com.ikaustubh.mispayrollsystem.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

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
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;


/**
 * This entity is represent the salary details of the employee
 * And also storing the all incremented salary details history. <BR>
 * 
 * @author Dnyaneshwar Chavan
 * @since 06-June-2021
 */

@Entity
@Table(name = "SALARY_DTL", indexes = {
		@Index(columnList = " SALARY_DTL_DATE, SALARY_DTL_ACTIVE", 
				name = "salary_dtl_index"),
		@Index(columnList = " SALARY_DTL__EMP_TBL_RID", 
				name = "salary_dtl__emp_index"),
		@Index(columnList = " SALARY_DTL__INCREMENT_TYPE_RID", 
				name = "salary_dtl__increment_index")})
//@Scope("global-session")
public class SalaryEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SALARY_DTL_RID", length = 10, nullable = false)
	private long rid;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "SALARY_DTL__EMP_TBL_RID", nullable = false, referencedColumnName = "EMP_TBL_RID")
	private EmployeeEntity empEntity;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "SALARY_DTL__INCREMENT_TYPE_RID", nullable = false, referencedColumnName = "INCREMENT_TYPE_RID")
	private IncrementTypeEntity incrementTypeEntity;
	
	@Column(name = "SALARY_DTL_DATE", nullable = false)
	private LocalDate date;
	
	@Column(name = "SALARY_DTL_BASIC_AMT", nullable = false, precision = 10, scale = 2)
	private BigDecimal basicAmt = new BigDecimal("0.00");
	
	@Column(name = "SALARY_DTL_INCREMENT_PERCENTAGE", nullable = false, length=3)
	private int incrementPer;
	
	@Column(name = "SALARY_DTL_INCREMENT_AMT", nullable = false, precision = 10, scale = 2)
	private BigDecimal incrementAmt = new BigDecimal("0.00");
	
	@Column(name = "SALARY_DTL_FINAL_AMT", nullable = false, precision = 10, scale = 2)
	private BigDecimal finalAmt = new BigDecimal("0.00");
	
	@Column(name = "SALARY_DTL_REMARK", nullable = true, length = 100)
	private String remark;
	
	@Column(name = "SALARY_DTL_ACTIVE", nullable = false, length = 1)
	private char active='Y';
	
	@Column(name = "SALARY_DTL_CREATED_BY", nullable = true, length = 15)
	private String yCreatedBy;

	@Column(name = "SALARY_DTL_CREATED_TIMESTAMP", nullable = true)
	private LocalDateTime yCreatedDateAndTime;

	@Column(name = "SALARY_DTL_MODIFIED_BY", nullable = true, length = 15)
	private String zModifiedBy;

	@Column(name = "SALARY_DTL_MODIFIED_TIMESTAMP", nullable = true)
	private LocalDateTime zModifiedDateAndTime;

	/**
	 * @return the empEntity
	 */
	public EmployeeEntity getEmpEntity() {
		return empEntity;
	}

	/**
	 * @param empEntity the empEntity to set
	 */
	public void setEmpEntity(EmployeeEntity empEntity) {
		this.empEntity = empEntity;
	}

	/**
	 * @return the incrementTypeEntity
	 */
	public IncrementTypeEntity getIncrementTypeEntity() {
		return incrementTypeEntity;
	}

	/**
	 * @param incrementTypeEntity the incrementTypeEntity to set
	 */
	public void setIncrementTypeEntity(IncrementTypeEntity incrementTypeEntity) {
		this.incrementTypeEntity = incrementTypeEntity;
	}

	/**
	 * @return the date
	 */
	public LocalDate getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}

	/**
	 * @return the basicAmt
	 */
	public BigDecimal getBasicAmt() {
		return basicAmt;
	}

	/**
	 * @param basicAmt the basicAmt to set
	 */
	public void setBasicAmt(BigDecimal basicAmt) {
		this.basicAmt = basicAmt;
	}

	/**
	 * @return the incrementPer
	 */
	public int getIncrementPer() {
		return incrementPer;
	}

	/**
	 * @param incrementPer the incrementPer to set
	 */
	public void setIncrementPer(int incrementPer) {
		this.incrementPer = incrementPer;
	}

	/**
	 * @return the incrementAmt
	 */
	public BigDecimal getIncrementAmt() {
		return incrementAmt;
	}

	/**
	 * @param incrementAmt the incrementAmt to set
	 */
	public void setIncrementAmt(BigDecimal incrementAmt) {
		this.incrementAmt = incrementAmt;
	}

	/**
	 * @return the finalAmt
	 */
	public BigDecimal getFinalAmt() {
		return finalAmt;
	}

	/**
	 * @param finalAmt the finalAmt to set
	 */
	public void setFinalAmt(BigDecimal finalAmt) {
		this.finalAmt = finalAmt;
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
	 * @return the active
	 */
	public char getActive() {
		return active;
	}

	/**
	 * @param active the active to set
	 */
	public void setActive(char active) {
		this.active = active;
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
		return "SalaryEntity [rid=" + rid + ", date=" + date + ", basicAmt=" + basicAmt + ", incrementPer="
				+ incrementPer + ", incrementAmt=" + incrementAmt + ", finalAmt=" + finalAmt + ", remark=" + remark
				+ ", active=" + active + ", yCreatedBy=" + yCreatedBy + ", yCreatedDateAndTime=" + yCreatedDateAndTime
				+ ", zModifiedBy=" + zModifiedBy + ", zModifiedDateAndTime=" + zModifiedDateAndTime + "]";
	}
}
