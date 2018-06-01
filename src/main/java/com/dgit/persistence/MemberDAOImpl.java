package com.dgit.persistence;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dgit.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO{
	
	@Autowired
	SqlSession session;
	
	private static final String namespace = "com.dgit.mapper.MemberMapper";

	@Override
	public String readTime() throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne(namespace + ".readTime");
	}

	@Override
	public void createMember(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub
		session.insert(namespace + ".createMember",vo);
		
	}

	@Override
	public MemberVO readMember(String userid) throws Exception {
		// TODO Auto-generated method stub
		
		return session.selectOne(namespace + ".selectId",userid);
	}

	@Override
	public MemberVO readWithPW(String userid, String userpw) throws Exception {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		map.put("userid", userid);
		map.put("userpw", userpw);
		
		return session.selectOne(namespace + ".readWithPW",map);
	}

}
