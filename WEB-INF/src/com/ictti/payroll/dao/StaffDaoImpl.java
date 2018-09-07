package com.ictti.payroll.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ictti.payroll.business.entity.Staff;

public class StaffDaoImpl extends HibernateDaoSupport implements StaffDao {

	public List<Staff> getAllStaffList() {
		// TODO Auto-generated method stub
		String hql = "from Staff";
		List<Staff> l = getHibernateTemplate().find(hql);
		return l.isEmpty() || l == null ? null : l;
	}

	public Staff getStaffById(int id) {
		String hql = "from Staff where id = ?";
		List<Staff> l = getHibernateTemplate().find(hql, id);
		return l.isEmpty() || l == null ? null : (Staff) l.get(0);
	}
}
