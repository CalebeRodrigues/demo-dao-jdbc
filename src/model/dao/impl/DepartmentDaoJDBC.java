package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentDaoJDBC implements DepartmentDao{

	private Connection conn;
	
	public DepartmentDaoJDBC (Connection conn) {
		this.conn = conn;
	}
	
	private Department instantiateDepartment(ResultSet rs) throws SQLException {
		Department dep = new Department();
		dep.setId(rs.getInt("DepartmentId"));
		dep.setName(rs.getString("DepName"));
		return dep;
	}
	
	@Override
	public void insert(Department obj) {
		
	}

	@Override
	public void update(Department obj) {
		
	}

	@Override
	public void deleteById(Integer id) {
		
	}

	@Override
	public Department findById(Integer id) {
		
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			
			st = conn.prepareStatement( "Select * from department " +
										"Where Id = ?");
			
			st.setInt(1, id);
			
			rs = st.executeQuery();
			
			if(rs.next()) {
				
			}
			
		}
		
		return null;
	}

	@Override
	public List<Department> findAll() {
		
		return null;
	}

}
