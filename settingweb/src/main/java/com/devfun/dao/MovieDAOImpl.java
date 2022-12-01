package com.devfun.dao;
import java.util.List;
import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.devfun.vo.MovieVO;

@Repository
public class MovieDAOImpl implements MovieDAO{

	@Inject
	private SqlSession sqlSession;
	private static final String Namespace = "com.devfun.mybatis.sql.test";
	// 상수로 값을 불변으로 만들고, 매번 dao에서 경로 넣기보다 변수선언 하나로 간편,코드간결성을 위해 Injection한 듯
	
	@Override
	public List<MovieVO> selectMovie() throws Exception {
		return sqlSession.selectList(Namespace+".selectMovie");
	}

	
}
