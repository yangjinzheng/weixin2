package db;


import bean.Message;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by pc on 2017/5/18.
 */
public class DBAcess {
    public static void main(String[] args) throws IOException{
        //通过配置文件获取数据库连接信息

            InputStream reader = DBAcess.class.getClassLoader().getResourceAsStream("conf.xml");
            //通过配置信息构建一个SqlSessionFactory
            SqlSessionFactory sqlsessionfactory = new SqlSessionFactoryBuilder().build(reader);
            //通过sqlsessionfactory打开一个数据库会话
            SqlSession sqlSesion = sqlsessionfactory.openSession();
            String statement = "User.getUser";
            Message mm = new Message();
            mm.setId(2);
            mm.setDescription("eee");
            mm.setContent("fff");
            mm.setCommand("ggg");
            //sqlSesion.update("SQL.updateuser",mm);//sql语句中的对象是对象类型的
            sqlSesion.delete("SQL.deleteuser",2);
            sqlSesion.commit();
            sqlSesion.close();

    }
}
