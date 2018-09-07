package com.ictti.payroll.business.entity.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the salary_record table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="salary_record"
 */

public abstract class BaseSalaryRecord  implements Serializable {

	public static String REF = "SalaryRecord";
	public static String PROP_STAFF = "staff";
	public static String PROP_DATE = "date";
	public static String PROP_WORKING_DAY_RATE = "workingDayRate";
	public static String PROP_ACTUAL_PAY = "actualPay";
	public static String PROP_FULL_PAY = "fullPay";
	public static String PROP_ID = "id";


	// constructors
	public BaseSalaryRecord () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseSalaryRecord (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseSalaryRecord (
		java.lang.Integer id,
		com.ictti.payroll.business.entity.Staff staff,
		java.util.Date date,
		java.lang.Double actualPay,
		java.lang.Double fullPay,
		java.lang.Double workingDayRate) {

		this.setId(id);
		this.setStaff(staff);
		this.setDate(date);
		this.setActualPay(actualPay);
		this.setFullPay(fullPay);
		this.setWorkingDayRate(workingDayRate);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.util.Date date;
	private java.lang.Double actualPay;
	private java.lang.Double fullPay;
	private java.lang.Double workingDayRate;

	// many to one
	private com.ictti.payroll.business.entity.Staff staff;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="salary_record_id"
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
	 * Return the value associated with the column: date
	 */
	public java.util.Date getDate () {
		return date;
	}

	/**
	 * Set the value related to the column: date
	 * @param date the date value
	 */
	public void setDate (java.util.Date date) {
		this.date = date;
	}



	/**
	 * Return the value associated with the column: actual_pay
	 */
	public java.lang.Double getActualPay () {
		return actualPay;
	}

	/**
	 * Set the value related to the column: actual_pay
	 * @param actualPay the actual_pay value
	 */
	public void setActualPay (java.lang.Double actualPay) {
		this.actualPay = actualPay;
	}



	/**
	 * Return the value associated with the column: full_pay
	 */
	public java.lang.Double getFullPay () {
		return fullPay;
	}

	/**
	 * Set the value related to the column: full_pay
	 * @param fullPay the full_pay value
	 */
	public void setFullPay (java.lang.Double fullPay) {
		this.fullPay = fullPay;
	}



	/**
	 * Return the value associated with the column: working_day_rate
	 */
	public java.lang.Double getWorkingDayRate () {
		return workingDayRate;
	}

	/**
	 * Set the value related to the column: working_day_rate
	 * @param workingDayRate the working_day_rate value
	 */
	public void setWorkingDayRate (java.lang.Double workingDayRate) {
		this.workingDayRate = workingDayRate;
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
		if (!(obj instanceof com.ictti.payroll.business.entity.SalaryRecord)) return false;
		else {
			com.ictti.payroll.business.entity.SalaryRecord salaryRecord = (com.ictti.payroll.business.entity.SalaryRecord) obj;
			if (null == this.getId() || null == salaryRecord.getId()) return false;
			else return (this.getId().equals(salaryRecord.getId()));
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