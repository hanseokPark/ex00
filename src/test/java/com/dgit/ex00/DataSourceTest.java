package com.dgit.ex00;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/Web-inf/spring/**/*.xml"})
public class DataSourceTest {
	
	@Autowired
	DataSource dataSource;
	
	@Test
	public void testConnection(){
		Connection con = null;
		try{
			con = dataSource.getConnection();
			System.out.println(con);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
