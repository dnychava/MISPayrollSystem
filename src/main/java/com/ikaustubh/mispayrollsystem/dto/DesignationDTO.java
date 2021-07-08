/**
 * 
 */
package com.ikaustubh.mispayrollsystem.dto;

/**
 * This class hold the Designation information.
 * 
 * @author Dnyaneshwar
 * @since 29-June-2021
 *
 */
public class DesignationDTO {
	
	private long id;		
	
	private String name;
	
	public DesignationDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DesignationDTO [id=" + id + ", name=" + name + "]";
	}
	
	
}
