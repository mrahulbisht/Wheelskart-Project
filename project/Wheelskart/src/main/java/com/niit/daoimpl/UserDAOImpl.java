package com.niit.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.UserDAO;
import com.niit.domain.User;


@Repository("userDAO")
public class UserDAOImpl implements UserDAO {

	@Autowired
	
	private SessionFactory sessionFactory;
	public boolean save(User user) {
		// TODO Auto-generated method stub
		try
		{
		sessionFactory.getCurrentSession().save(user);
		}catch (Exception e) {
			//if any excpetion comes during execute of try block, catch will excute
			e.printStackTrace();
			return false;
		}
		return true;
		
	}

	public boolean update(User user) {
		// TODO Auto-generated method stub
		try
		{
		sessionFactory.getCurrentSession().update(user);
		}catch (Exception e) {
			//if any excpetion comes during execute of try block, catch will excute
			e.printStackTrace();
			return false;
		}
		return true;
		
	}

	public boolean validate(String id, String password) {
		// TODO Auto-generated method stub
		Query query=	 sessionFactory.getCurrentSession().createQuery(" from User where id = ? and password = ?");
		query.setString(1, id);     //actually the index will start from zero  - will get once exception.
		query.setString(2, password);
		//in the User table with this id and password there will one or zero records will exist
		//i.e., uniqueResult
		//uniqueResult method will return object if a row exist, else it will return null
		 if(  query.uniqueResult()  == null)
		 {
			 //means no row exist i.e., invalid credentials
			 return false;
		 }
		 else
		 {
			 //means row exist i.e., valid credentials
			 return true;
		 }
		


	}

	public List<User> list() {
		// TODO Auto-generated method stub
		return  sessionFactory.getCurrentSession().createQuery("from User").list();
		
	}

	public User get(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
