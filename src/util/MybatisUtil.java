package util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {
	private static SqlSessionFactory factory = null;//�Ự����
	private static String resource = "mybatis.xml";
	private static ThreadLocal<SqlSession> tl = null;
	static {
		InputStream is;
		try {
		    is = Resources.getResourceAsStream(resource);//��ȡ�����ļ�
		    factory = new SqlSessionFactoryBuilder().build(is);//�����Ự
		    //��ʼ����
		    tl = new ThreadLocal<>();
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}
	//��ȡsession
	public static SqlSession getSessoon() {
		SqlSession sqlsession= tl.get();
		if(sqlsession == null) {
			sqlsession = factory.openSession();
			tl.set(sqlsession);
		}
		return sqlsession;
		
	}
	//�ر�session
	public static void closeSession() {
		SqlSession sqlsession= tl.get();
		if(sqlsession!=null) {
			sqlsession.close();
			tl.remove();
		}
	}
}
