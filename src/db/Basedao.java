package db;

import bean.Message;
import bean.Queryvo;

/**
 * Created by pc on 2017/6/3.
 */
public interface Basedao {
    public Message getuser(Queryvo queryvo)throws Exception;
    public void insertuser(Message mm)throws Exception;
    public void deleteuser(int id)throws Exception;
}
