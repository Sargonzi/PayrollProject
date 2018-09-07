package com.ictti.payroll.business.entity;

import com.ictti.payroll.business.entity.base.BaseSalaryRecord;



public class SalaryRecord extends BaseSalaryRecord {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public SalaryRecord () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public SalaryRecord (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public SalaryRecord (
		java.lang.Integer id,
		com.ictti.payroll.business.entity.Staff staff,
		java.util.Date date,
		java.lang.Double actualPay,
		java.lang.Double fullPay,
		java.lang.Double workingDayRate) {

		super (
			id,
			staff,
			date,
			actualPay,
			fullPay,
			workingDayRate);
	}

/*[CONSTRUCTOR MARKER END]*/


}