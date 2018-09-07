package com.ictti.payroll.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.ictti.payroll.business.service.SalaryService;
import com.ictti.payroll.presentation.form.ManageSalaryForm;

public class CalculateAllSalaryAction extends BaseAction {

	private SalaryService myStaffService;

	public SalaryService getMyStaffService() {
		return myStaffService;
	}

	public void setMyStaffService(SalaryService myStaffService) {
		this.myStaffService = myStaffService;
	}

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		// TODO Auto-generated method stub
		ManageSalaryForm myForm = (ManageSalaryForm) form;
		myStaffService.firstLoadSearch(myForm);
		return "gotoCalculateAllStaff";
	}

}
