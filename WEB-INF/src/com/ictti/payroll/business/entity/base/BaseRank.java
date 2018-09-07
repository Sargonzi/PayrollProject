package com.ictti.payroll.business.entity.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the rank table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="rank"
 */

public abstract class BaseRank  implements Serializable {

	public static String REF = "Rank";
	public static String PROP_ID = "id";
	public static String PROP_RANK_NAME = "rankName";


	// constructors
	public BaseRank () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseRank (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String rankName;

	// collections
	private java.util.Set<com.ictti.payroll.business.entity.Staff> staffs;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="rank_id"
     */
	public java.lang.Integer getId () {
		return id;
	}

	/**
	 * Set the unique identifier of this class
	 * @param id the new ID
	 */
	public void setId (java.lang.Integer id) {
		this.id = id;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: rank_name
	 */
	public java.lang.String getRankName () {
		return rankName;
	}

	/**
	 * Set the value related to the column: rank_name
	 * @param rankName the rank_name value
	 */
	public void setRankName (java.lang.String rankName) {
		this.rankName = rankName;
	}



	/**
	 * Return the value associated with the column: staffs
	 */
	public java.util.Set<com.ictti.payroll.business.entity.Staff> getStaffs () {
		return staffs;
	}

	/**
	 * Set the value related to the column: staffs
	 * @param staffs the staffs value
	 */
	public void setStaffs (java.util.Set<com.ictti.payroll.business.entity.Staff> staffs) {
		this.staffs = staffs;
	}

	public void addTostaffs (com.ictti.payroll.business.entity.Staff staff) {
		if (null == getStaffs()) setStaffs(new java.util.TreeSet<com.ictti.payroll.business.entity.Staff>());
		getStaffs().add(staff);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.ictti.payroll.business.entity.Rank)) return false;
		else {
			com.ictti.payroll.business.entity.Rank rank = (com.ictti.payroll.business.entity.Rank) obj;
			if (null == this.getId() || null == rank.getId()) return false;
			else return (this.getId().equals(rank.getId()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getId()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getId().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}