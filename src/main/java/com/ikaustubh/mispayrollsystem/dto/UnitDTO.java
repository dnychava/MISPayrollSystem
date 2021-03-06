/**
 * 
 */
package com.ikaustubh.mispayrollsystem.dto;

/**
 * This class hold the Unit information.
 * 
 * @author Dnyaneshwar
 * @since 29-June-2021
 *
 */
public class UnitDTO {
	
	private long id;		
	
	private String name;
	
	public UnitDTO() {
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
	
}
