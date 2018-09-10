package com.ictti.payroll.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.ictti.payroll.business.service.StaffService;
import com.ictti.payroll.presentation.form.ManageStaffForm;

public class AllStaffAction extends BaseAction {

	private StaffService myStaffService;

	public StaffService getMyStaffService() {
		return myStaffService;
	}

	public void setMyStaffService(StaffService myStaffService) {
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
		ManageStaffForm myForm = (ManageStaffForm) form;
		if(myForm.getFormControl() == 1){
			myStaffService.disableStaffById(myForm);
			myStaffService.loadAllStaff(myForm);
			return "gotoAllStaff";
		}else if(myForm.getFormControl() == 2){
		myStaffService.loadAllStaff(myForm);
		return "gotoAllStaff";
		}
		return "gotoAllStaff";
	}

}
