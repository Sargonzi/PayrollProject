package com.ictti.payroll.business.service;

import java.util.List;

import com.ictti.payroll.business.entity.Staff;
import com.ictti.payroll.dao.StaffDao;
import com.ictti.payroll.presentation.form.ManageStaffForm;

public class StaffService {

	private StaffDao myStaffDao;

	public StaffDao getMyStaffDao() {
		return myStaffDao;
	}

	public void setMyStaffDao(StaffDao myStaffDao) {
		this.myStaffDao = myStaffDao;
	}

	public void loadAllStaff(ManageStaffForm myForm) {
		List<Staff> allStaff = myStaffDao.getAllStaffList();
		myForm.setStaffList(allStaff);
		myForm.setBegin(1);
		myForm.setEnd(allStaff.size());

	}

	public void loadAllActiveStaff(ManageStaffForm myForm) {
		List<Staff> allActiveStaff = myStaffDao.getAllActiveStaffList();
		if (allActiveStaff != null) {
			myForm.setStaffList(allActiveStaff);
			myForm.setBegin(1);
			myForm.setEnd(allActiveStaff.size());
		} else{
		System.out.print("I was here");
				
		}
		
	
	}

	public void disableStaffById(ManageStaffForm myForm) {
		Staff staff = myStaffDao.getStaffById(Integer.parseInt(myForm
				.getStaffDeleteId()));
		staff.setStaffStatus(0);
		myStaffDao.saveOrUpdateStaff(staff);
	}

}
