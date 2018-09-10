package com.ictti.payroll.presentation.form;

import java.util.List;

import org.apache.struts.validator.ValidatorForm;

import com.ictti.payroll.business.entity.Staff;

public class ManageStaffForm extends ValidatorForm {

	private List<Staff> staffList;
	private int begin;
	private int end;
	private String staffDeleteId;
	private Staff deleteStaff;
	private int formControl;

	public int getFormControl() {
		return formControl;
	}

	public void setFormControl(int formControl) {
		this.formControl = formControl;
	}

	public List<Staff> getStaffList() {
		return staffList;
	}

	public void setStaffList(List<Staff> staffList) {
		this.staffList = staffList;
	}

	public int getBegin() {
		return begin;
	}

	public void setBegin(int begin) {
		this.begin = begin;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public String getStaffDeleteId() {
		return staffDeleteId;
	}

	public void setStaffDeleteId(String staffDeleteId) {
		this.staffDeleteId = staffDeleteId;
	}

	public Staff getDeleteStaff() {
		return deleteStaff;
	}

	public void setDeleteStaff(Staff deleteStaff) {
		this.deleteStaff = deleteStaff;
	}

	
	

}
