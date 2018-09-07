package com.ictti.payroll.business.entity.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the staff table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="staff"
 */

public abstract class BaseStaff  implements Serializable {

	public static String REF = "Staff";
	public static String PROP_QUALIFICATION = "qualification";
	public static String PROP_RANK = "rank";
	public static String PROP_DEPT = "dept";
	public static String PROP_PASSWORD = "password";
	public static String PROP_RELIGION = "religion";
	public static String PROP_STAFF_NRC = "staffNrc";
	public static String PROP_RACE = "race";
	public static String PROP_PERMANENT_ADDRESS = "permanentAddress";
	public static String PROP_CURRENT_ADDRESS = "currentAddress";
	public static String PROP_STAFF_NAME = "staffName";
	public static String PROP_PHONE_NO = "phoneNo";
	public static String PROP_STAFF_DOB = "staffDob";
	public static String PROP_STAFF_STATUS = "staffStatus";
	public static String PROP_EMAIL = "email";
	public static String PROP_ROLE_STATUS = "roleStatus";
	public static String PROP_CURRENT_RANK_DATE = "currentRankDate";
	public static String PROP_STAFF_PHOTO = "staffPhoto";
	public static String PROP_ID = "id";
	public static String PROP_EMPLOYMENT_START_DATE = "employmentStartDate";


	// constructors
	public BaseStaff () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseStaff (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseStaff (
		java.lang.Integer id,
		com.ictti.payroll.business.entity.Department dept,
		com.ictti.payroll.business.entity.Rank rank,
		com.ictti.payroll.business.entity.Qualification qualification,
		java.lang.String staffName,
		java.lang.String staffNrc) {

		this.setId(id);
		this.setDept(dept);
		this.setRank(rank);
		this.setQualification(qualification);
		this.setStaffName(staffName);
		this.setStaffNrc(staffNrc);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String staffName;
	private java.lang.String staffPhoto;
	private java.lang.String staffNrc;
	private java.lang.String email;
	private java.lang.String password;
	private java.util.Date staffDob;
	private java.lang.String religion;
	private java.lang.String race;
	private java.lang.String phoneNo;
	private java.util.Date employmentStartDate;
	private java.lang.String currentAddress;
	private java.lang.String permanentAddress;
	private java.util.Date currentRankDate;
	private java.lang.Integer roleStatus;
	private java.lang.Integer staffStatus;

	// many to one
	private com.ictti.payroll.business.entity.Department dept;
	private com.ictti.payroll.business.entity.Rank rank;
	private com.ictti.payroll.business.entity.Qualification qualification;

	// collections
	private java.util.Set<com.ictti.payroll.business.entity.SalaryRecord> salaryRecords;
	private java.util.Set<com.ictti.payroll.business.entity.LeaveDetail> leaveDetails;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="staff_id"
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
	 * Return the value associated with the column: staff_name
	 */
	public java.lang.String getStaffName () {
		return staffName;
	}

	/**
	 * Set the value related to the column: staff_name
	 * @param staffName the staff_name value
	 */
	public void setStaffName (java.lang.String staffName) {
		this.staffName = staffName;
	}



	/**
	 * Return the value associated with the column: staff_photo
	 */
	public java.lang.String getStaffPhoto () {
		return staffPhoto;
	}

	/**
	 * Set the value related to the column: staff_photo
	 * @param staffPhoto the staff_photo value
	 */
	public void setStaffPhoto (java.lang.String staffPhoto) {
		this.staffPhoto = staffPhoto;
	}



	/**
	 * Return the value associated with the column: staff_nrc
	 */
	public java.lang.String getStaffNrc () {
		return staffNrc;
	}

	/**
	 * Set the value related to the column: staff_nrc
	 * @param staffNrc the staff_nrc value
	 */
	public void setStaffNrc (java.lang.String staffNrc) {
		this.staffNrc = staffNrc;
	}



	/**
	 * Return the value associated with the column: email
	 */
	public java.lang.String getEmail () {
		return email;
	}

	/**
	 * Set the value related to the column: email
	 * @param email the email value
	 */
	public void setEmail (java.lang.String email) {
		this.email = email;
	}



	/**
	 * Return the value associated with the column: password
	 */
	public java.lang.String getPassword () {
		return password;
	}

	/**
	 * Set the value related to the column: password
	 * @param password the password value
	 */
	public void setPassword (java.lang.String password) {
		this.password = password;
	}



	/**
	 * Return the value associated with the column: staff_dob
	 */
	public java.util.Date getStaffDob () {
		return staffDob;
	}

	/**
	 * Set the value related to the column: staff_dob
	 * @param staffDob the staff_dob value
	 */
	public void setStaffDob (java.util.Date staffDob) {
		this.staffDob = staffDob;
	}



	/**
	 * Return the value associated with the column: religion
	 */
	public java.lang.String getReligion () {
		return religion;
	}

	/**
	 * Set the value related to the column: religion
	 * @param religion the religion value
	 */
	public void setReligion (java.lang.String religion) {
		this.religion = religion;
	}



	/**
	 * Return the value associated with the column: race
	 */
	public java.lang.String getRace () {
		return race;
	}

	/**
	 * Set the value related to the column: race
	 * @param race the race value
	 */
	public void setRace (java.lang.String race) {
		this.race = race;
	}



	/**
	 * Return the value associated with the column: phone_no
	 */
	public java.lang.String getPhoneNo () {
		return phoneNo;
	}

	/**
	 * Set the value related to the column: phone_no
	 * @param phoneNo the phone_no value
	 */
	public void setPhoneNo (java.lang.String phoneNo) {
		this.phoneNo = phoneNo;
	}



	/**
	 * Return the value associated with the column: employment_start_date
	 */
	public java.util.Date getEmploymentStartDate () {
		return employmentStartDate;
	}

	/**
	 * Set the value related to the column: employment_start_date
	 * @param employmentStartDate the employment_start_date value
	 */
	public void setEmploymentStartDate (java.util.Date employmentStartDate) {
		this.employmentStartDate = employmentStartDate;
	}



	/**
	 * Return the value associated with the column: current_address
	 */
	public java.lang.String getCurrentAddress () {
		return currentAddress;
	}

	/**
	 * Set the value related to the column: current_address
	 * @param currentAddress the current_address value
	 */
	public void setCurrentAddress (java.lang.String currentAddress) {
		this.currentAddress = currentAddress;
	}



	/**
	 * Return the value associated with the column: permanent_address
	 */
	public java.lang.String getPermanentAddress () {
		return permanentAddress;
	}

	/**
	 * Set the value related to the column: permanent_address
	 * @param permanentAddress the permanent_address value
	 */
	public void setPermanentAddress (java.lang.String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}



	/**
	 * Return the value associated with the column: current_rank_date
	 */
	public java.util.Date getCurrentRankDate () {
		return currentRankDate;
	}

	/**
	 * Set the value related to the column: current_rank_date
	 * @param currentRankDate the current_rank_date value
	 */
	public void setCurrentRankDate (java.util.Date currentRankDate) {
		this.currentRankDate = currentRankDate;
	}



	/**
	 * Return the value associated with the column: role_status
	 */
	public java.lang.Integer getRoleStatus () {
		return roleStatus;
	}

	/**
	 * Set the value related to the column: role_status
	 * @param roleStatus the role_status value
	 */
	public void setRoleStatus (java.lang.Integer roleStatus) {
		this.roleStatus = roleStatus;
	}



	/**
	 * Return the value associated with the column: staff_status
	 */
	public java.lang.Integer getStaffStatus () {
		return staffStatus;
	}

	/**
	 * Set the value related to the column: staff_status
	 * @param staffStatus the staff_status value
	 */
	public void setStaffStatus (java.lang.Integer staffStatus) {
		this.staffStatus = staffStatus;
	}



	/**
	 * Return the value associated with the column: dept_id
	 */
	public com.ictti.payroll.business.entity.Department getDept () {
		return dept;
	}

	/**
	 * Set the value related to the column: dept_id
	 * @param dept the dept_id value
	 */
	public void setDept (com.ictti.payroll.business.entity.Department dept) {
		this.dept = dept;
	}



	/**
	 * Return the value associated with the column: rank_id
	 */
	public com.ictti.payroll.business.entity.Rank getRank () {
		return rank;
	}

	/**
	 * Set the value related to the column: rank_id
	 * @param rank the rank_id value
	 */
	public void setRank (com.ictti.payroll.business.entity.Rank rank) {
		this.rank = rank;
	}



	/**
	 * Return the value associated with the column: qualification_id
	 */
	public com.ictti.payroll.business.entity.Qualification getQualification () {
		return qualification;
	}

	/**
	 * Set the value related to the column: qualification_id
	 * @param qualification the qualification_id value
	 */
	public void setQualification (com.ictti.payroll.business.entity.Qualification qualification) {
		this.qualification = qualification;
	}



	/**
	 * Return the value associated with the column: salaryRecords
	 */
	public java.util.Set<com.ictti.payroll.business.entity.SalaryRecord> getSalaryRecords () {
		return salaryRecords;
	}

	/**
	 * Set the value related to the column: salaryRecords
	 * @param salaryRecords the salaryRecords value
	 */
	public void setSalaryRecords (java.util.Set<com.ictti.payroll.business.entity.SalaryRecord> salaryRecords) {
		this.salaryRecords = salaryRecords;
	}

	public void addTosalaryRecords (com.ictti.payroll.business.entity.SalaryRecord salaryRecord) {
		if (null == getSalaryRecords()) setSalaryRecords(new java.util.TreeSet<com.ictti.payroll.business.entity.SalaryRecord>());
		getSalaryRecords().add(salaryRecord);
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
		if (!(obj instanceof com.ictti.payroll.business.entity.Staff)) return false;
		else {
			com.ictti.payroll.business.entity.Staff staff = (com.ictti.payroll.business.entity.Staff) obj;
			if (null == this.getId() || null == staff.getId()) return false;
			else return (this.getId().equals(staff.getId()));
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