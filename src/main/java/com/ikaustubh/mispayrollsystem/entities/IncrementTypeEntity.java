package com.ikaustubh.mispayrollsystem.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;


/**
 * This entity is represent the increment type of salary details for the employee <BR>
 * e.g. New Emp, Royalti Bonus and Regullar Imcrement
 * 
 * @author Dnyaneshwar Chavan
 * @since 06-June-2021
 */

@Entity
@Table(name = "INCREMENT_TYPE")
@Scope("global-session")
public class IncrementTypeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "INCREMENT_TYPE_RID", length = 10, nullable = false)
	private long rid;
	
	@Column(name = "INCREMENT_TYPE_NAME", nullable = true, length = 50)
	private String name;
	
	@Column(name = "INCREMENT_TYPE_CREATED_BY", nullable = true, length = 15)
	private String yCreatedBy;

	@Column(name = "INCREMENT_TYPE_CREATED_TIMESTAMP", nullable = true)
	private LocalDateTime yCreatedDateAndTime;

	@Column(name = "INCREMENT_TYPE_MODIFIED_BY", nullable = true, length = 15)
	private String zModifiedBy;

	@Column(name = "INCREMENT_TYPE_MODIFIED_TIMESTAMP", nullable = true)
	private LocalDateTime zModifiedDateAndTime;

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
		return "IncrementTypeEntity [rid=" + rid + ", name=" + name + ", yCreatedBy=" + yCreatedBy
				+ ", yCreatedDateAndTime=" + yCreatedDateAndTime + ", zModifiedBy=" + zModifiedBy
				+ ", zModifiedDateAndTime=" + zModifiedDateAndTime + "]";
	}

	
}
