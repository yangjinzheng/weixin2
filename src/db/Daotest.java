package db;

import bean.Message;
import bean.Queryvo;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.annotation.Resources;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pc on 2017/6/3.
 */
public class Daotest {


    private static SqlSessionFactory sqlSessionFactory;
    public void setup()throws Exception{
        String resource = "conf.xml";
        InputStream inputStream = Daotest.class.getClassLoader().getResourceAsStream("conf.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    }
    public static void main(String[] args) throws Exception {
        Daotest Do = new Daotest();
        Do.setup();
        Userdao ud = new Userdao(sqlSessionFactory);
        Queryvo queryvo = new Queryvo();
//        Message mm1 = new Message();
//        mm1.setId(1);
//        queryvo.setMessage(mm1);
        //Message mm2 = ud.getuser(queryvo);
        //System.out.println(mm2.getCommand()+mm2.getContent());
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        queryvo.setIds(ids);
        List<Message> list= ud.getList(queryvo);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).getCommand());
        }
    }
}
