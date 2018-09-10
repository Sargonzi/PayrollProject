<%@ include file="inc/common.jsp"%>
<!doctype html>
<html lang="">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="description"
	content="Blank Page | Propeller - Admin Dashboard">
<meta content="width=device-width, initial-scale=1, user-scalable=no"
	name="viewport">
<title>Staff Detail | Payroll</title>
<%@ include file="inc/common_css.jsp"%>
</head>

<body>
	<!-- Header Starts -->
	<!--Start Nav bar -->
	<%@ include file="inc/nav_bar.jsp"%>
	<!--End Nav bar -->
	<!-- Header Ends -->

	<!-- Left sidebar -->
	<%@ include file="inc/left_sidebar.jsp"%>
	<!-- Sidebar Ends -->

	<!--content area start-->
	<div id="content" class="pmd-content inner-page">
		<!--tab start-->
		<div class="container-fluid full-width-container blank">
			<!-- Title -->
			<h1 class="section-title" id="services">
				<span>Staff</span>
			</h1>
			<!-- End Title -->

			<!--breadcrum start-->
			<ol class="breadcrumb text-left">
				<li><a href="#" class="active">Manage Staff</a></li>
				<li>Calculate All Staff</li>
				<li>Salary Detail</li>
			</ol>
			<!--breadcrum end-->

			
			<!-- insert here  -->
			
			  <div class="row">
            <div class="col-lg-12">
                <div class="page-content profile-edit section-custom">
                    <div class="pmd-card pmd-z-depth">
                        <div class="pmd-card-body">
                            <div class="row">
                                <div data-provides="fileinput" class="fileinput fileinput-new col-lg-3">
                                    <div data-trigger="fileinput"
                                         class="fileinput-preview thumbnail img-circle img-responsive">
                                        <img src="dist/images/me.jpg">
                                    </div>
                                    <div class="action-button">
                                                    <span class="btn btn-default btn-raised btn-file ripple-effect">
                                                        <span class="fileinput-new"><i
                                                                class="material-icons md-light pmd-xs">add</i></span>
                                                        <span class="fileinput-exists"><i
                                                                class="material-icons md-light pmd-xs">mode_edit</i></span>
                                                        <input type="file" name="...">
                                                    </span>
                                        <a data-dismiss="fileinput"
                                           class="btn btn-default btn-raised btn-file ripple-effect fileinput-exists"
                                           href="javascript:void(0);"><i
                                                class="material-icons md-light pmd-xs">close</i></a>
                                    </div>
                                </div>
                                <div class="col-lg-9">
                                    <span class="media-left media-middle">Personal Information</span>
                                    <i class="media-left media-middle">
                                        <svg xmlns="http://www.w3.org/2000/svg" width="20" height="20"
                                             viewBox="0 0 48 48">
                                            <path d="M24 24c4.42 0 8-3.59 8-8 0-4.42-3.58-8-8-8s-8 3.58-8 8c0 4.41 3.58 8 8 8zm0 4c-5.33 0-16 2.67-16 8v4h32v-4c0-5.33-10.67-8-16-8z"/>
                                        </svg>
                                    </i>
                                    <hr>
                                    <div class="row">
                                        <form class="form-horizontal">
                                            <fieldset>
                                                <div class="form-group pmd-textfield">
                                                    <label for="staffName" class="col-lg-4 control-label">Full
                                                        Name</label>
                                                    <div class="col-lg-8">
                                                        <input type="text" id="staffName" class="form-control"
                                                               value="${PersonalDetailFormBean.detailStaff.staffName }" disabled>
                                                               
                                                    </div>
                                                </div>
                                                <div class="form-group pmd-textfield">
                                                    <label for="nrc" class="col-lg-4 control-label">NRC</label>
                                                    <div class="col-lg-8">
                                                        <input type="text" id="nrc" class="form-control"
                                                               value="${PersonalDetailFormBean.detailStaff.staffNrc }" disabled>
                                                    </div>
                                                </div>
                                                <div class="form-group pmd-textfield">
                                                    <label for="email" class="col-lg-4 control-label">Email</label>
                                                    <div class="col-lg-8">
                                                        <input type="email" id="email" class="form-control" name="email"
                                                               value="${PersonalDetailFormBean.detailStaff.email}" disabled>
                                                    </div>
                                                </div>
                                                <div class="form-group pmd-textfield">
                                                    <label class="control-label col-lg-4"
                                                           for="password">Password</label>
                                                    <div class="col-lg-8">
                                                        <input type="password" class="form-control empty" id="password"
                                                               value="${PersonalDetailFormBean.detailStaff.password }" disabled>
                                                    </div>
                                                </div>
                                                <div class="form-group pmd-textfield">
                                                    <label class="control-label col-lg-4" for="confirmPassword">Confirm
                                                        Password</label>
                                                    <div class="col-lg-8">
                                                        <input type="password" class="form-control empty"
                                                               id="confirmPassword" value="${PersonalDetailFormBean.detailStaff.password }" disabled>
                                                    </div>
                                                </div>
                                                <div class="form-group pmd-textfield">
                                                    <label for="birthDate" class="col-lg-4 control-label">Date of
                                                        Birth</label>
                                                    <div class="col-lg-8">
                                                        <input type="text" id="birthDate" class="form-control"
                                                               value="${PersonalDetailFormBean.detailStaff.staffDob }" disabled>
                                                    </div>
                                                </div>
                                                <div class="form-group pmd-textfield">
                                                    <label for="religion"
                                                           class="col-lg-4 control-label">Religion</label>
                                                    <div class="col-lg-8">
                                                        <input type="text" id="religion" class="form-control"
                                                               value="${PersonalDetailFormBean.detailStaff.religion }" disabled>
                                                    </div>
                                                </div>
                                                <div class="form-group pmd-textfield">
                                                    <label for="race" class="col-lg-4 control-label">Race</label>
                                                    <div class="col-lg-8">
                                                        <input type="text" id="race" class="form-control"
                                                               value="${PersonalDetailFormBean.detailStaff.race }" disabled>
                                                    </div>
                                                </div>
                                                <div class="form-group pmd-textfield">
                                                    <label for="phoneNumber" class="col-lg-4 control-label">Phone
                                                        Number</label>
                                                    <div class="col-lg-8">
                                                        <input type="phoneNumber" id="phoneNumber" class="form-control"
                                                               value="${PersonalDetailFormBean.detailStaff.phoneNo }" disabled>
                                                    </div>
                                                </div>
                                                <div class="form-group pmd-textfield">
                                                    <label for="empStartDate" class="col-lg-4 control-label">Employment
                                                        Start Date</label>
                                                    <div class="col-lg-8">
                                                        <input type="text" id="empStartDate" class="form-control"
                                                               value="${PersonalDetailFormBean.detailStaff.employmentStartDate }" disabled>
                                                    </div>
                                                </div>
                                                <div class="form-group pmd-textfield">
                                                    <label for="currentAdr" class="col-lg-4 control-label">Current
                                                        Address </label>
                                                    <div class="col-lg-8">
                                                        <input type="text" id="currentAdr" class="form-control"
                                                               value="${PersonalDetailFormBean.detailStaff.currentAddress}" disabled>
                                                    </div>
                                                </div>
                                                <div class="form-group pmd-textfield">
                                                    <label for="parmenentAdr" class="col-lg-4 control-label">Parmenent
                                                        Address </label>
                                                    <div class="col-lg-8">
                                                        <input type="text" id="parmenentAdr" class="form-control"
                                                               value="${PersonalDetailFormBean.detailStaff.permanentAddress}" disabled>
                                                    </div>
                                                </div>
                                                <div class="form-group pmd-textfield">
                                                    <label for="roleStatus" class="col-lg-4 control-label">Role
                                                        Status</label>
                                                    <div class="col-lg-8">
                                                        <input type="text" id="roleStatus" class="form-control"
                                                               value="${(PersonalDetailFormBean.detailStaff.roleStatus) == 0 ? 'Staff' : (PersonalDetailFormBean.detailStaff.roleStatus) == 1 ? 'Treasurer' : 'Persident' }" disabled>
                                                    </div>
                                                </div>
                                                <div class="form-group pmd-textfield">
                                                    <label for="staffStatus" class="col-lg-4 control-label">Staff
                                                        Status</label>
                                                    <div class="col-lg-8">
                                                        <input type="text" id="staffStatus" class="form-control"
                                                               value="${(PersonalDetailFormBean.detailStaff.staffStatus) == 1? 'Active' : 'Disable' }"  disabled>
                                                    </div>
                                                </div>
                                                <div class="form-group pmd-textfield">
                                                    <label for="deparment"
                                                           class="col-lg-4 control-label">Department</label>
                                                    <div class="col-lg-8">
                                                        <input type="text" id="deparment" class="form-control"
                                                               value="${PersonalDetailFormBean.detailStaff.dept.deptName }" disabled>
                                                    </div>
                                                </div>
                                                <div class="form-group pmd-textfield">
                                                    <label for="qualification" class="col-lg-4 control-label">Qualification</label>
                                                    <div class="col-lg-8">
                                                        <input type="text" id="qualification" class="form-control"
                                                               value="${PersonalDetailFormBean.detailStaff.qualification.qualificationName }" disabled>
                                                    </div>
                                                </div>
                                                <div class="form-group pmd-textfield">
                                                    <label for="rank" class="col-lg-4 control-label">Rank</label>
                                                    <div class="col-lg-8">
                                                        <input type="text" id="rank" class="form-control"
                                                               value="${PersonalDetailFormBean.detailStaff.rank.rankName }" disabled>
                                                    </div>
                                                </div>
                                            </fieldset>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div><!-- Personal Info Card End -->
            </div>
        </div>
				
		</div>
		<!-- tab end -->

	</div>
	<!-- content area end -->

	<!-- Footer Starts -->
	<%@ include file="inc/footer.jsp"%>
	<!-- Footer Ends -->

	<!-- Scripts Starts -->
	<%@ include file="inc/common_js.jsp"%>



</body>
</html>