package com.ictti.payroll.business.entity.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the leave_detail table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="leave_detail"
 */

public abstract class BaseLeaveDetail  implements Serializable {

	public static String REF = "LeaveDetail";
	public static String PROP_STAFF = "staff";
	public static String PROP_END_DATE = "endDate";
	public static String PROP_START_DATE = "startDate";
	public static String PROP_LEAVE_PHOTO = "leavePhoto";
	public static String PROP_LEAVE_TYPE = "leaveType";
	public static String PROP_LEAVED_DAYS = "leavedDays";
	public static String PROP_ID = "id";
	public static String PROP_LEAVE_APPLY_DATE = "leaveApplyDate";
	public static String PROP_LEAVE_STATUS = "leaveStatus";
	public static String PROP_REASON = "reason";


	// constructors
	public BaseLeaveDetail () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseLeaveDetail (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseLeaveDetail (
		java.lang.Integer id,
		com.ictti.payroll.business.entity.LeaveType leaveType,
		com.ictti.payroll.business.entity.Staff staff) {

		this.setId(id);
		this.setLeaveType(leaveType);
		this.setStaff(staff);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.util.Date startDate;
	private java.util.Date endDate;
	private java.lang.String reason;
	private java.util.Date leaveApplyDate;
	private java.lang.Integer leavedDays;
	private java.lang.Integer leaveStatus;
	private byte[] leavePhoto;

	// many to one
	private com.ictti.payroll.business.entity.LeaveType leaveType;
	private com.ictti.payroll.business.entity.Staff staff;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="leave_detail_id"
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
	 * Return the value associated with the column: start_date
	 */
	public java.util.Date getStartDate () {
		return startDate;
	}

	/**
	 * Set the value related to the column: start_date
	 * @param startDate the start_date value
	 */
	public void setStartDate (java.util.Date startDate) {
		this.startDate = startDate;
	}



	/**
	 * Return the value associated with the column: end_date
	 */
	public java.util.Date getEndDate () {
		return endDate;
	}

	/**
	 * Set the value related to the column: end_date
	 * @param endDate the end_date value
	 */
	public void setEndDate (java.util.Date endDate) {
		this.endDate = endDate;
	}



	/**
	 * Return the value associated with the column: reason
	 */
	public java.lang.String getReason () {
		return reason;
	}

	/**
	 * Set the value related to the column: reason
	 * @param reason the reason value
	 */
	public void setReason (java.lang.String reason) {
		this.reason = reason;
	}



	/**
	 * Return the value associated with the column: leave_apply_date
	 */
	public java.util.Date getLeaveApplyDate () {
		return leaveApplyDate;
	}

	/**
	 * Set the value related to the column: leave_apply_date
	 * @param leaveApplyDate the leave_apply_date value
	 */
	public void setLeaveApplyDate (java.util.Date leaveApplyDate) {
		this.leaveApplyDate = leaveApplyDate;
	}



	/**
	 * Return the value associated with the column: leaved_days
	 */
	public java.lang.Integer getLeavedDays () {
		return leavedDays;
	}

	/**
	 * Set the value related to the column: leaved_days
	 * @param leavedDays the leaved_days value
	 */
	public void setLeavedDays (java.lang.Integer leavedDays) {
		this.leavedDays = leavedDays;
	}



	/**
	 * Return the value associated with the column: leave_status
	 */
	public java.lang.Integer getLeaveStatus () {
		return leaveStatus;
	}

	/**
	 * Set the value related to the column: leave_status
	 * @param leaveStatus the leave_status value
	 */
	public void setLeaveStatus (java.lang.Integer leaveStatus) {
		this.leaveStatus = leaveStatus;
	}



	/**
	 * Return the value associated with the column: leave_photo
	 */
	public byte[] getLeavePhoto () {
		return leavePhoto;
	}

	/**
	 * Set the value related to the column: leave_photo
	 * @param leavePhoto the leave_photo value
	 */
	public void setLeavePhoto (byte[] leavePhoto) {
		this.leavePhoto = leavePhoto;
	}



	/**
	 * Return the value associated with the column: leave_type_id
	 */
	public com.ictti.payroll.business.entity.LeaveType getLeaveType () {
		return leaveType;
	}

	/**
	 * Set the value related to the column: leave_type_id
	 * @param leaveType the leave_type_id value
	 */
	public void setLeaveType (com.ictti.payroll.business.entity.LeaveType leaveType) {
		this.leaveType = leaveType;
	}



	/**
	 * Return the value associated with the column: staff_id
	 */
	public com.ictti.payroll.business.entity.Staff getStaff () {
		return staff;
	}

	/**
	 * Set the value related to the column: staff_id
	 * @param staff the staff_id value
	 */
	public void setStaff (com.ictti.payroll.business.entity.Staff staff) {
		this.staff = staff;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.ictti.payroll.business.entity.LeaveDetail)) return false;
		else {
			com.ictti.payroll.business.entity.LeaveDetail leaveDetail = (com.ictti.payroll.business.entity.LeaveDetail) obj;
			if (null == this.getId() || null == leaveDetail.getId()) return false;
			else return (this.getId().equals(leaveDetail.getId()));
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