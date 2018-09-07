package com.ictti.payroll.presentation.form;

import java.util.List;

import org.apache.struts.validator.ValidatorForm;

import com.ictti.payroll.business.entity.Department;
import com.ictti.payroll.business.entity.Rank;
import com.ictti.payroll.business.entity.Staff;

public class ManageSalaryForm extends ValidatorForm {

	// Calculate All Staff
	private List<Staff> frmStaffList;
	// private Rank staffRank;
	// private Department staffDept;
	private String end; // first record no
	private String begin; // last record no
	private int actualPage; // page no
	private int iMaxShow; // number of records shown per page
	private int iMaxData; // total records extracted from database

	public List<Staff> getFrmStaffList() {
		return frmStaffList;
	}

	public void setFrmStaffList(List<Staff> frmStaffList) {
		this.frmStaffList = frmStaffList;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getBegin() {
		return begin;
	}

	public void setBegin(String begin) {
		this.begin = begin;
	}

	public int getActualPage() {
		return actualPage;
	}

	public void setActualPage(int actualPage) {
		this.actualPage = actualPage;
	}

	public int getiMaxShow() {
		return iMaxShow;
	}

	public void setiMaxShow(int iMaxShow) {
		this.iMaxShow = iMaxShow;
	}

	public int getiMaxData() {
		return iMaxData;
	}

	public void setiMaxData(int iMaxData) {
		this.iMaxData = iMaxData;
	}

	/*
	 * public Rank getStaffRank() { return staffRank; }
	 * 
	 * public void setStaffRank(Rank staffRank) { this.staffRank = staffRank; }
	 * 
	 * public Department getStaffDept() { return staffDept; }
	 * 
	 * public void setStaffDept(Department staffDept) { this.staffDept =
	 * staffDept; }
	 */
	// FormControl for Detail
	/*
	 * private IcttiBooks frmIcttiBooksDetail; //to control the detail book info
	 * private String frmDetailBookId; // to store the selected detail book Id
	 * private String frmControl;
	 */

	// Salary Detail

	// Staff Detail
	private String staffDetailId;
	private Staff detailStaff;
	private String rankName;
	private String qualificationName;
	private String departmentName;

	public String getStaffDetailId() {
		return staffDetailId;
	}

	public void setStaffDetailId(String staffDetailId) {
		this.staffDetailId = staffDetailId;
	}

	public Staff getDetailStaff() {
		return detailStaff;
	}

	public void setDetailStaff(Staff detailStaff) {
		this.detailStaff = detailStaff;
	}

	public String getRankName() {
		return rankName;
	}

	public void setRankName(String rankName) {
		this.rankName = rankName;
	}

	public String getQualificationName() {
		return qualificationName;
	}

	public void setQualificationName(String qualificationName) {
		this.qualificationName = qualificationName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

}
