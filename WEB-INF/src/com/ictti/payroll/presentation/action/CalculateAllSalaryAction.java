package com.ictti.payroll.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.ictti.payroll.business.service.SalaryService;
import com.ictti.payroll.presentation.form.ManageSalaryForm;

public class CalculateAllSalaryAction extends BaseAction {

	private SalaryService mySalaryService;

	public SalaryService getMySalaryService() {
		return mySalaryService;
	}

	public void setMySalaryService(SalaryService mySalaryService) {
		this.mySalaryService = mySalaryService;
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
		mySalaryService.firstLoadSearch(myForm);
		return "gotoCalculateAllStaff";
	}

}
