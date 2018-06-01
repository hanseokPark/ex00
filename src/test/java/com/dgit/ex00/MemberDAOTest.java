package com.dgit.ex00;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dgit.domain.MemberVO;
import com.dgit.persistence.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/Web-inf/spring/**/*.xml"})
public class MemberDAOTest {
	
	@Autowired
	MemberDAO dao;
	
	//@Test
	public void testTime() throws Exception{
		System.out.println(dao.readTime());
	}
	
	//@Test
	public void testCreateTime() throws Exception{
		MemberVO vo = new MemberVO();
		vo.setUserid("user00");
		vo.setUserpw("user00");
		vo.setEmail("user00@aaa.com");
		vo.setUsername("user00");
		
		dao.createMember(vo);
	}
	
	//@Test
	public void testSelectId() throws Exception{	
		
		MemberVO memberVO = dao.readMember("user00");
		
		System.out.println(memberVO);
	}
	@Test
	public void testreadWithPW() throws Exception{			
		
		MemberVO memberVO = dao.readWithPW("user00","user00");
		
		System.out.println(memberVO);
	}
}












