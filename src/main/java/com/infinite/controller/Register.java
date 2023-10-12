package com.infinite.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.infinite.db.Hikari1;


/**
 * @author arunkumark
 *
 */
@Controller
public class Register{
	
	private static final Logger logger
    = Logger.getLogger(Register.class);
	
	
	@RequestMapping("/register")
	public String display()
	{
		return "register";
	}
		
		Connection con = null;
		PreparedStatement ps=null;
		@RequestMapping(value="/registervalues",method=RequestMethod.POST)
		public String register(HttpServletRequest request,HttpServletResponse response){
			String name=request.getParameter("name");
			String email=request.getParameter("email");
			String pass=request.getParameter("password");
			String date=request.getParameter("date");
			String gender=request.getParameter("gender");
			String profession=request.getParameter("profession");
			String marry=request.getParameter("married");
			String note=request.getParameter("note");
			
			try{
				DataSource datasource=Hikari1.getDataSource();        //hikari connection from db package.
				con=datasource.getConnection();
				ps=con.prepareStatement("insert into register1 values(?,?,?,?,?,?,?,?);");
				ps.setString(1,name);
				ps.setString(2,email);
				ps.setString(3,pass);
				ps.setString(4,date);
				ps.setString(5,gender);
				ps.setString(6,profession);
				ps.setString(7,marry);
				ps.setString(8,note);
				logger.info("it is here");
				ps.executeUpdate();
				return "index1";
				}
			
	
		catch (SQLException e)
		{
		e.printStackTrace();
		}
		
		    return "invalid";
		

		}
		
		
		}

