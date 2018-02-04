package db;

import bean.Message;
import bean.Queryvo;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import javax.management.Query;
import java.util.List;

/**
 * Created by pc on 2017/6/3.
 */
public class Userdao implements Basedao {

    private SqlSessionFactory sqlSessionFactory;
    public Userdao(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory = sqlSessionFactory;
    }
    @Override
    public Message getuser(Queryvo vo) throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Message mm = sqlSession.selectOne("SQL.getUser",vo);
        sqlSession.close();
        return mm;
    }
    public List<Message> getList(Queryvo vo) throws Exception{
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Message> mm = sqlSession.selectList("SQL.getUser",vo);
        sqlSession.close();
        return mm;
    }

    @Override
    public void insertuser(Message mm) throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.insert("SQL.insertuser",mm);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void deleteuser(int id) throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.delete("SQL.deleteuser",id);
        sqlSession.commit();
        sqlSession.close();
    }
}
