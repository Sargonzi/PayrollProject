package com.ictti.payroll.business.entity.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the leave_type table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="leave_type"
 */

public abstract class BaseLeaveType  implements Serializable {

	public static String REF = "LeaveType";
	public static String PROP_LEAVE_RANGE = "leaveRange";
	public static String PROP_LEAVE_TYPE_NAME = "leaveTypeName";
	public static String PROP_ID = "id";


	// constructors
	public BaseLeaveType () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseLeaveType (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String leaveTypeName;
	private java.lang.Integer leaveRange;

	// collections
	private java.util.Set<com.ictti.payroll.business.entity.LeaveDetail> leaveDetails;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="leave_type_id"
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
	 * Return the value associated with the column: leave_type_name
	 */
	public java.lang.String getLeaveTypeName () {
		return leaveTypeName;
	}

	/**
	 * Set the value related to the column: leave_type_name
	 * @param leaveTypeName the leave_type_name value
	 */
	public void setLeaveTypeName (java.lang.String leaveTypeName) {
		this.leaveTypeName = leaveTypeName;
	}



	/**
	 * Return the value associated with the column: leave_range
	 */
	public java.lang.Integer getLeaveRange () {
		return leaveRange;
	}

	/**
	 * Set the value related to the column: leave_range
	 * @param leaveRange the leave_range value
	 */
	public void setLeaveRange (java.lang.Integer leaveRange) {
		this.leaveRange = leaveRange;
	}



	/**
	 * Return the value associated with the column: leaveDetails
	 */
	public java.util.Set<com.ictti.payroll.business.entity.LeaveDetail> getLeaveDetails () {
		return leaveDetails;
	}

	/**
	 * Set the value related to the column: leaveDetails
	 * @param leaveDetails the leaveDetails value
	 */
	public void setLeaveDetails (java.util.Set<com.ictti.payroll.business.entity.LeaveDetail> leaveDetails) {
		this.leaveDetails = leaveDetails;
	}

	public void addToleaveDetails (com.ictti.payroll.business.entity.LeaveDetail leaveDetail) {
		if (null == getLeaveDetails()) setLeaveDetails(new java.util.TreeSet<com.ictti.payroll.business.entity.LeaveDetail>());
		getLeaveDetails().add(leaveDetail);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.ictti.payroll.business.entity.LeaveType)) return false;
		else {
			com.ictti.payroll.business.entity.LeaveType leaveType = (com.ictti.payroll.business.entity.LeaveType) obj;
			if (null == this.getId() || null == leaveType.getId()) return false;
			else return (this.getId().equals(leaveType.getId()));
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