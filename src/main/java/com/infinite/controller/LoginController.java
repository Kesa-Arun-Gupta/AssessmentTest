package com.infinite.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
public class LoginController {
	private static final Logger logger
    = Logger.getLogger(LoginController.class);

	Connection con = null;
	PreparedStatement ps = null;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(HttpServletRequest request, HttpServletResponse response) {
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		try {
			DataSource datasource = Hikari1.getDataSource();
			con = datasource.getConnection();
			ps = con.prepareStatement("select *from register1 where name=? and password=?;");
			ps.setString(1, user);
			ps.setString(2, pass);
			ResultSet rs = ps.executeQuery();
			logger.info("Result set");
			while(rs.next())
			{															//login validation
				if(rs.getString(1).equals(user))
				{
					if (rs.getString(3).equals(pass))
					{
						return "Home";
					} 
					else 
					{
						return "invalid";
					}
				} else
				{
					return "invalid";
				}
		   }

		}

		catch (SQLException e) {
			logger.warn(e);
		} catch (Exception e1) {
			logger.warn(e1);
		}
		return "invalid";

	}
}
