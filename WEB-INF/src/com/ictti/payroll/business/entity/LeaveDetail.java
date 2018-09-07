package com.ictti.payroll.business.entity;

import com.ictti.payroll.business.entity.base.BaseLeaveDetail;



public class LeaveDetail extends BaseLeaveDetail {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public LeaveDetail () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public LeaveDetail (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public LeaveDetail (
		java.lang.Integer id,
		com.ictti.payroll.business.entity.LeaveType leaveType,
		com.ictti.payroll.business.entity.Staff staff) {

		super (
			id,
			leaveType,
			staff);
	}

/*[CONSTRUCTOR MARKER END]*/


}