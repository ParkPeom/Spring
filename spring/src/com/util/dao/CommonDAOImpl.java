package com.util.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.orm.ibatis.SqlMapClientTemplate;


import com.ibatis.sqlmap.client.SqlMapClient;



// 인터페이스를 구현한 클래스
public class CommonDAOImpl implements CommonDAO {
	
	
	// Autowired : applicationContext에서 sqlMapClientTemplate 가 setter 가됨  applicationContext에 맨 밑 주석을 안적어도됨
	// Autowired : 타입이 일치하는 빈을 찾아서 주입을 자동으로 해줌 
	@Autowired
	private SqlMapClientTemplate sqlMapClientTemplate;
	

	public CommonDAOImpl(SqlMapClientTemplate sqlMapClientTemplate) {

		this.sqlMapClientTemplate = sqlMapClientTemplate;
	}
	

	@Override
	public void insertData(String id, Object value) {
	
		try {
			
			sqlMapClientTemplate.insert(id,value);
					
		} catch (Exception e) {
			System.out.println(e.toString());
		
		}
	}

	@Override
	public int updateData(String id, Object value) {
		
		int result = 0;
		try {		
			
			result = sqlMapClientTemplate.update(id, value);
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return result;
	}
	
	
	@Override
	public int updateData(String id, Map<String, Object> map) {
		
		int result = 0;
		
		try {	
			result = sqlMapClientTemplate.update(id,map);
			
		} catch (Exception e) {
			
			System.out.println(e.toString());
		
		}
		return result;
	}

	@Override
	public int deleteData(String id, Object value) {
		
		int result = 0;
		
		try {
			
			result = sqlMapClientTemplate.delete(id, value);
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return result;
	}

	@Override
	public int deleteData(String id, Map<String, Object> map) {
		
		int result = 0;
		
		try {
			
			result = sqlMapClientTemplate.delete(id,map);
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return result;
	}

	@Override
	public int deleteAllData(String id) {
		
		int result = 0;
		
		try {
			
			result = sqlMapClientTemplate.delete(id);
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return result;
	}

	@Override
	public Object getReadData(String id) {
		// 입력수정삭제 할때만 트랜잭션실행함
		
		
		try {
			return sqlMapClientTemplate.queryForObject(id); // 있을때 id를 selecte한결과 Object
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return null; // 데이터없을때 null 
	}

	@Override
	public Object getReadData(String id, Object value) {
		
		try {
			return sqlMapClientTemplate.queryForObject(id, value); // 있을때 id를 selecte한결과 Object
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return null; // 데이터없을때 null 
	}

	@Override
	public Object getReadData(String id, Map<String, Object> map) {
		try {
			return sqlMapClientTemplate.queryForObject(id, map); // 있을때 id를 selecte한결과 Object
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return null; // 데이터없을때 null 
	}

	@Override
	public int getIntValue(String id) {
		
		try {
			return ((Integer)sqlMapClientTemplate.queryForObject(id)).intValue(); // int값으로 반환해준다.
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return 0; // 안되면 0
	}

	@Override
	public int getIntValue(String id, Object value) {
		
		try {
			return ((Integer)sqlMapClientTemplate.queryForObject(id, value)).intValue(); // int값으로 반환해준다.
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return 0;
	}

	@Override
	public int getIntValue(String id, Map<String, Object> map) {
		
		try {
			return ((Integer)sqlMapClientTemplate.queryForObject(id,map)).intValue(); // int값으로 반환해준다.
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return 0;
	}

	@SuppressWarnings("unchecked") // 경고창보여주지말라
	@Override
	public List<Object> getListData(String id) {
		
		try {
			return (List<Object>)sqlMapClientTemplate.queryForList(id);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return null;
	}
	
	@SuppressWarnings("unchecked") // 경고창보여주지말라
	@Override
	public List<Object> getListData(String id, Object value) {
		
		try {
			return (List<Object>)sqlMapClientTemplate.queryForList(id,value);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return null;
	}
	
	@SuppressWarnings("unchecked") // 경고창보여주지말라
	@Override
	public List<Object> getListData(String id, Map<String, Object> map) {
		
		try {
			return (List<Object>)sqlMapClientTemplate.queryForList(id,map);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return null;
	}
	
}
