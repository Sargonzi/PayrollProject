package com.ictti.payroll.business.service;

import java.util.List;

import com.ictti.payroll.business.entity.Staff;
import com.ictti.payroll.dao.DepartmentDao;
import com.ictti.payroll.dao.QualificationDao;
import com.ictti.payroll.dao.RankDao;
import com.ictti.payroll.dao.StaffDao;
import com.ictti.payroll.presentation.form.ManageSalaryForm;

public class SalaryService {

	private StaffDao myStaffDao;
	private RankDao myRankDao;
	private QualificationDao myQualificationDao;
	private DepartmentDao myDepartmentDao;

	public RankDao getMyRankDao() {
		return myRankDao;
	}

	public void setMyRankDao(RankDao myRankDao) {
		this.myRankDao = myRankDao;
	}

	public QualificationDao getMyQualificationDao() {
		return myQualificationDao;
	}

	public void setMyQualificationDao(QualificationDao myQualificationDao) {
		this.myQualificationDao = myQualificationDao;
	}

	public DepartmentDao getMyDepartmentDao() {
		return myDepartmentDao;
	}

	public void setMyDepartmentDao(DepartmentDao myDepartmentDao) {
		this.myDepartmentDao = myDepartmentDao;
	}

	public StaffDao getMyStaffDao() {
		return myStaffDao;
	}

	public void setMyStaffDao(StaffDao myStaffDao) {
		this.myStaffDao = myStaffDao;
	}

	public void firstLoadSearch(ManageSalaryForm myForm) {
		// TODO Auto-generated method stub
		List<Staff> l=myStaffDao.getAllStaffList();
		myForm.setFrmStaffList(l);
		myForm.setBegin("1");
		myForm.setEnd(Integer.valueOf(l.size()).toString());
	}

	public void loadStaffById(ManageSalaryForm myForm) {
		//get staff by id from dao
		Staff staff = myStaffDao.getStaffById(Integer.parseInt(myForm.getStaffDetailId()));
		//set staff to formbean
		myForm.setDetailStaff(staff);
	}

}
