package com.sist.erp.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sist.erp.vo.TempVO;

@Repository
public class TempDAOImpl implements TempDAO
{
	@Autowired
	SqlSession session;

	@Override
	public List<TempVO> searchClient(String key)
	{
		String realKey = "%"+key+"%";
		
		return session.getMapper(TempDAO.class).searchClient(realKey);
	}

}
