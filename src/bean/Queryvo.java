package bean;

import java.util.List;

/**
 * Created by pc on 2017/6/9.
 */
public class Queryvo {
    private Message message;
    private List<Integer> ids;
    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
