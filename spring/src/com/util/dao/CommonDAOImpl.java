package com.util.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.orm.ibatis.SqlMapClientTemplate;


import com.ibatis.sqlmap.client.SqlMapClient;



// �������̽��� ������ Ŭ����
public class CommonDAOImpl implements CommonDAO {
	
	
	// Autowired : applicationContext���� sqlMapClientTemplate �� setter ����  applicationContext�� �� �� �ּ��� �������
	// Autowired : Ÿ���� ��ġ�ϴ� ���� ã�Ƽ� ������ �ڵ����� ���� 
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
		// �Է¼������� �Ҷ��� Ʈ����ǽ�����
		
		
		try {
			return sqlMapClientTemplate.queryForObject(id); // ������ id�� selecte�Ѱ�� Object
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return null; // �����;����� null 
	}

	@Override
	public Object getReadData(String id, Object value) {
		
		try {
			return sqlMapClientTemplate.queryForObject(id, value); // ������ id�� selecte�Ѱ�� Object
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return null; // �����;����� null 
	}

	@Override
	public Object getReadData(String id, Map<String, Object> map) {
		try {
			return sqlMapClientTemplate.queryForObject(id, map); // ������ id�� selecte�Ѱ�� Object
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return null; // �����;����� null 
	}

	@Override
	public int getIntValue(String id) {
		
		try {
			return ((Integer)sqlMapClientTemplate.queryForObject(id)).intValue(); // int������ ��ȯ���ش�.
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return 0; // �ȵǸ� 0
	}

	@Override
	public int getIntValue(String id, Object value) {
		
		try {
			return ((Integer)sqlMapClientTemplate.queryForObject(id, value)).intValue(); // int������ ��ȯ���ش�.
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return 0;
	}

	@Override
	public int getIntValue(String id, Map<String, Object> map) {
		
		try {
			return ((Integer)sqlMapClientTemplate.queryForObject(id,map)).intValue(); // int������ ��ȯ���ش�.
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return 0;
	}

	@SuppressWarnings("unchecked") // ���â������������
	@Override
	public List<Object> getListData(String id) {
		
		try {
			return (List<Object>)sqlMapClientTemplate.queryForList(id);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return null;
	}
	
	@SuppressWarnings("unchecked") // ���â������������
	@Override
	public List<Object> getListData(String id, Object value) {
		
		try {
			return (List<Object>)sqlMapClientTemplate.queryForList(id,value);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return null;
	}
	
	@SuppressWarnings("unchecked") // ���â������������
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
