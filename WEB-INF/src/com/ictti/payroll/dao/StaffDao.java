package com.ictti.payroll.dao;

import java.util.List;

import com.ictti.payroll.business.entity.Staff;

public interface StaffDao {

	List<Staff> getAllStaffList();
	
	List<Staff> getAllActiveStaffList();
	
	Staff getStaffById(int id);
	
	void saveOrUpdateStaff(Staff staff);
	
}
