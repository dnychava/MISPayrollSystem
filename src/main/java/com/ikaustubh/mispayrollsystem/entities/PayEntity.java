package com.ikaustubh.mispayrollsystem.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
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
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * This entity is represent the <B> PAYMENT </B> details for every month of employee
 * And also storing the record status of the payment. <BR>
 * 
 * @author Dnyaneshwar Chavan
 * @since 06-June-2021
 */

@Entity
@Table(name = "PAY_DTL", indexes = {
		@Index(columnList = " PAY_DTL_FROM_DATE, PAY_DTL_TO_DATE", 
				name = "pay_dtl_index"),
		@Index(columnList = " PAY_DTL__EMP_TBL_RID", 
				name = "pay_dtl__emp_index"),
		@Index(columnList = " PAY_DTL__SALARY_DTL_RID", 
				name = "pay_dtl__salary_dtl_index")})
//@Scope("global-session")
public class PayEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PAY_DTL_RID", length = 10, nullable = false)
	private long rid;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "PAY_DTL__EMP_TBL_RID", nullable = false, referencedColumnName = "EMP_TBL_RID")
	private EmployeeEntity empEntity;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "PAY_DTL__SALARY_DTL_RID", nullable = false, referencedColumnName = "SALARY_DTL_RID")
	private SalaryEntity salaryEntity;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "payEntity", cascade = CascadeType.ALL)
	private Set<PayStatusEntity> payStatusEntities = new HashSet<PayStatusEntity>();
	
	@Column(name = "PAY_DTL_FROM_DATE", nullable = false)
	private LocalDate fromDate;
	
	@Column(name = "PAY_DTL_TO_DATE", nullable = false)
	private LocalDate toDate;
	
	@Column(name = "PAY_DTL_ATTENDENCE", nullable = false, length=2)
	private int attendence;
	
	@Column(name = "PAY_DTL_ACTUAL_AMT", nullable = false, precision = 10, scale = 2)
	private BigDecimal actualAmt = new BigDecimal("0.00");
		
	@Column(name = "PAY_DTL_FIX_PTA_ALLOW", nullable = false, precision = 8, scale = 2)
	private BigDecimal fixPTAAmt = new BigDecimal("0.00");

	@Column(name = "PAY_DTL_TRIBALE_ALLOW", nullable = false, precision = 8, scale = 2)
	private BigDecimal tribaleAllow = new BigDecimal("0.00");
	
	@Column(name = "PAY_DTL_ADD_CHARGE_ALLOW", nullable = false, precision = 8, scale = 2)
	private BigDecimal addChareAllow = new BigDecimal("0.00");
	
	@Column(name = "PAY_DTL_MOBILE_ALLOW", nullable = false, precision = 8, scale = 2)
	private BigDecimal mobileAllow = new BigDecimal("0.00");
	
	@Column(name = "PAY_DTL_ADD_ARREARS", nullable = false, precision = 8, scale = 2)
	private BigDecimal addArrears = new BigDecimal("0.00");
	
	@Column(name = "PAY_DTL_TOT_GP", nullable = false, precision = 10, scale = 2)
	private BigDecimal totGP = new BigDecimal("0.00");
	
	@Column(name = "PAY_DTL_PF_AMT", nullable = false, precision = 8, scale = 2)
	private BigDecimal pfAmt = new BigDecimal("0.00");
	
	@Column(name = "PAY_DTL_TDS_AMT", nullable = false, precision = 8, scale = 2)
	private BigDecimal tdsAmt = new BigDecimal("0.00");
	
	@Column(name = "PAY_DTL_PROF_TAX_AMT", nullable = false, precision = 8, scale = 2)
	private BigDecimal profTaxAmt = new BigDecimal("0.00");
	
	@Column(name = "PAY_DTL_NET_PAY", nullable = false, precision = 10, scale = 2)
	private BigDecimal netPay = new BigDecimal("0.00");
	
	@Column(name = "PAY_DTL_REMARK", nullable = true, length = 200)
	private String remark;
	
	@Column(name = "PAY_DTL_CREATED_BY", nullable = true, length = 15)
	private String yCreatedBy;

	@Column(name = "PAY_DTL_CREATED_TIMESTAMP", nullable = true)
	private LocalDateTime yCreatedDateAndTime;

	@Column(name = "PAY_DTL_MODIFIED_BY", nullable = true, length = 15)
	private String zModifiedBy;

	@Column(name = "PAY_DTL_MODIFIED_TIMESTAMP", nullable = true)
	private LocalDateTime zModifiedDateAndTime;

	/**
	 * @return the rid
	 */
	public long getRid() {
		return rid;
	}

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
	 * @return the salaryEntity
	 */
	public SalaryEntity getSalaryEntity() {
		return salaryEntity;
	}

	/**
	 * @param salaryEntity the salaryEntity to set
	 */
	public void setSalaryEntity(SalaryEntity salaryEntity) {
		this.salaryEntity = salaryEntity;
	}

	/**
	 * @return the payStatusEntities
	 */
	public Set<PayStatusEntity> getPayStatusEntities() {
		return payStatusEntities;
	}

	/**
	 * @param payStatusEntities the payStatusEntities to set
	 */
	public void setPayStatusEntities(Set<PayStatusEntity> payStatusEntities) {
		this.payStatusEntities = payStatusEntities;
	}

	/**
	 * @return the fromDate
	 */
	public LocalDate getFromDate() {
		return fromDate;
	}

	/**
	 * @param fromDate the fromDate to set
	 */
	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}

	/**
	 * @return the toDate
	 */
	public LocalDate getToDate() {
		return toDate;
	}

	/**
	 * @param toDate the toDate to set
	 */
	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}

	/**
	 * @return the attendence
	 */
	public int getAttendence() {
		return attendence;
	}

	/**
	 * @param attendence the attendence to set
	 */
	public void setAttendence(int attendence) {
		this.attendence = attendence;
	}

	/**
	 * @return the actualAmt
	 */
	public BigDecimal getActualAmt() {
		return actualAmt;
	}

	/**
	 * @param actualAmt the actualAmt to set
	 */
	public void setActualAmt(BigDecimal actualAmt) {
		this.actualAmt = actualAmt;
	}

	/**
	 * @return the fixPTAAmt
	 */
	public BigDecimal getFixPTAAmt() {
		return fixPTAAmt;
	}

	/**
	 * @param fixPTAAmt the fixPTAAmt to set
	 */
	public void setFixPTAAmt(BigDecimal fixPTAAmt) {
		this.fixPTAAmt = fixPTAAmt;
	}

	/**
	 * @return the tribaleAllow
	 */
	public BigDecimal getTribaleAllow() {
		return tribaleAllow;
	}

	/**
	 * @param tribaleAllow the tribaleAllow to set
	 */
	public void setTribaleAllow(BigDecimal tribaleAllow) {
		this.tribaleAllow = tribaleAllow;
	}

	/**
	 * @return the addChareAllow
	 */
	public BigDecimal getAddChareAllow() {
		return addChareAllow;
	}

	/**
	 * @param addChareAllow the addChareAllow to set
	 */
	public void setAddChareAllow(BigDecimal addChareAllow) {
		this.addChareAllow = addChareAllow;
	}

	/**
	 * @return the mobileAllow
	 */
	public BigDecimal getMobileAllow() {
		return mobileAllow;
	}

	/**
	 * @param mobileAllow the mobileAllow to set
	 */
	public void setMobileAllow(BigDecimal mobileAllow) {
		this.mobileAllow = mobileAllow;
	}

	/**
	 * @return the addArrears
	 */
	public BigDecimal getAddArrears() {
		return addArrears;
	}

	/**
	 * @param addArrears the addArrears to set
	 */
	public void setAddArrears(BigDecimal addArrears) {
		this.addArrears = addArrears;
	}

	/**
	 * @return the totGP
	 */
	public BigDecimal getTotGP() {
		return totGP;
	}

	/**
	 * @param totGP the totGP to set
	 */
	public void setTotGP(BigDecimal totGP) {
		this.totGP = totGP;
	}

	/**
	 * @return the pfAmt
	 */
	public BigDecimal getPfAmt() {
		return pfAmt;
	}

	/**
	 * @param pfAmt the pfAmt to set
	 */
	public void setPfAmt(BigDecimal pfAmt) {
		this.pfAmt = pfAmt;
	}

	/**
	 * @return the tdsAmt
	 */
	public BigDecimal getTdsAmt() {
		return tdsAmt;
	}

	/**
	 * @param tdsAmt the tdsAmt to set
	 */
	public void setTdsAmt(BigDecimal tdsAmt) {
		this.tdsAmt = tdsAmt;
	}

	/**
	 * @return the profTaxAmt
	 */
	public BigDecimal getProfTaxAmt() {
		return profTaxAmt;
	}

	/**
	 * @param profTaxAmt the profTaxAmt to set
	 */
	public void setProfTaxAmt(BigDecimal profTaxAmt) {
		this.profTaxAmt = profTaxAmt;
	}

	/**
	 * @return the netPay
	 */
	public BigDecimal getNetPay() {
		return netPay;
	}

	/**
	 * @param netPay the netPay to set
	 */
	public void setNetPay(BigDecimal netPay) {
		this.netPay = netPay;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PayEntity [rid=" + rid + ", fromDate=" + fromDate + ", toDate=" + toDate + ", attendence=" + attendence
				+ ", actualAmt=" + actualAmt + ", fixPTAAmt=" + fixPTAAmt + ", tribaleAllow=" + tribaleAllow
				+ ", addChareAllow=" + addChareAllow + ", mobileAllow=" + mobileAllow + ", addArrears=" + addArrears
				+ ", totGP=" + totGP + ", pfAmt=" + pfAmt + ", tdsAmt=" + tdsAmt + ", profTaxAmt=" + profTaxAmt
				+ ", netPay=" + netPay + ", remark=" + remark + ", yCreatedBy=" + yCreatedBy + ", yCreatedDateAndTime="
				+ yCreatedDateAndTime + ", zModifiedBy=" + zModifiedBy + ", zModifiedDateAndTime="
				+ zModifiedDateAndTime + "]";
	}

}
