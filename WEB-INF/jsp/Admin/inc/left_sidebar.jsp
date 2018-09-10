<!-- Sidebar Starts -->
<div class="pmd-sidebar-overlay"></div>

<!-- Left sidebar -->
<aside id="basicSidebar"
       class="pmd-sidebar  sidebar-default pmd-sidebar-slide-push pmd-sidebar-left pmd-sidebar-open bg-fill-darkblue sidebar-with-icons"
       role="navigation">
    <ul class="nav pmd-sidebar-nav">

        <!-- User info -->
        <li class="dropdown pmd-dropdown pmd-user-info visible-xs visible-md visible-sm visible-lg">
            <a aria-expanded="false" data-toggle="dropdown" class="btn-user dropdown-toggle media" data-sidebar="true"
               aria-expandedhref="javascript:void(0);">
                <div class="media-left">
                    <img src="images/Admin/user-icon.png" alt="New User">
                </div>
                <div class="media-body media-middle">Admin</div>
                <div class="media-right media-middle"><i class="dic-more-vert dic"></i></div>
            </a>
            <ul class="dropdown-menu">
                <li><a href="login.html">Logout</a></li>
            </ul>
        </li><!-- End user info -->

        <li>
            <a href="index.html" class="pmd-ripple-effect">
                <i class="media-left media-middle">
                    <svg xmlns="http://www.w3.org/2000/svg" width="30" height="30" viewBox="0 0 48 48">
                        <path d="M6 26h16V6H6v20zm0 16h16V30H6v12zm20 0h16V22H26v20zm0-36v12h16V6H26z"/>
                    </svg>
                </i>
                <span class="media-body">Dashboard</span></a>
            </a>
        </li>
        <li class="dropdown pmd-dropdown">
            <a aria-expanded="false" data-toggle="dropdown" class="btn-user dropdown-toggle media" data-sidebar="true"
               href="javascript:void(0);">
                <i class="media-left media-middle">
                    <svg xmlns="http://www.w3.org/2000/svg" width="30" height="30" viewBox="0 0 48 48">
                        <path d="M24 24c4.42 0 8-3.59 8-8 0-4.42-3.58-8-8-8s-8 3.58-8 8c0 4.41 3.58 8 8 8zm0 4c-5.33 0-16 2.67-16 8v4h32v-4c0-5.33-10.67-8-16-8z"/>
                    </svg>
                </i>
                <span class="media-body">Manage Staff</span>
                <div class="media-right media-bottom"><i class="dic-more-vert dic"></i></div>
            </a>
            <ul class="dropdown-menu">
                <li><a href="staffManagePathFirst.do?formControl=2">All Staff</a></li>
                <li><a href="staffNew.html">Add New</a></li>
            </ul>
        </li>
        <li class="dropdown pmd-dropdown">
            <a aria-expanded="false" data-toggle="dropdown" class="btn-user dropdown-toggle media" data-sidebar="true"
               href="javascript:void(0);">
                <i class="media-left media-middle">
                    <svg xmlns="http://www.w3.org/2000/svg" width="30" height="30" viewBox="0 0 48 48">
                        <path d="M23.6 21.8c-4.54-1.18-6-2.39-6-4.29 0-2.18 2.01-3.71 5.4-3.71 3.56 0 4.88 1.7 5 4.2h4.42c-.13-3.45-2.24-6.59-6.42-7.62V6h-6v4.32c-3.88.85-7 3.35-7 7.22 0 4.62 3.83 6.92 9.4 8.26 5.01 1.2 6 2.95 6 4.83 0 1.37-.97 3.57-5.4 3.57-4.12 0-5.75-1.85-5.96-4.2h-4.41c.25 4.38 3.52 6.83 7.37 7.66V42h6v-4.3c3.89-.75 7-3 7-7.11 0-5.66-4.86-7.6-9.4-8.79z"/>
                    </svg>
                </i>
                <span class="media-body">Manage Salary</span></a>
            <ul class="dropdown-menu">
                <li><a href="salaryManagePathFirst.do">Calculate All Staff</a></li>
            </ul>

        </li>
        <li>
            <a href="report.html" class="pmd-ripple-effect">
                <i class="media-left media-middle">
                    <svg xmlns="http://www.w3.org/2000/svg" width="30" height="30" viewBox="0 0 48 48">
                        <path d="M32 12l4.59 4.59-9.76 9.75-8-8L4 33.17 6.83 36l12-12 8 8 12.58-12.59L44 24V12z"/>
                    </svg>
                </i>
                <span class="media-body">View Report</span>
            </a>
        </li>   
    </ul>
</aside><!-- End Left sidebar -->
<!-- Sidebar Ends -->