package com.ictti.payroll.business.entity;

import com.ictti.payroll.business.entity.base.BaseStaff;



public class Staff extends BaseStaff {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Staff () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Staff (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Staff (
		java.lang.Integer id,
		com.ictti.payroll.business.entity.Department dept,
		com.ictti.payroll.business.entity.Rank rank,
		com.ictti.payroll.business.entity.Qualification qualification,
		java.lang.String staffName,
		java.lang.String staffNrc) {

		super (
			id,
			dept,
			rank,
			qualification,
			staffName,
			staffNrc);
	}

/*[CONSTRUCTOR MARKER END]*/


}