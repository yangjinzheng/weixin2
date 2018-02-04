package bean;

/**
 * Created by pc on 2017/5/13.
 */
public class Message {
    public int id;

    @Override
    public String toString() {
        return super.toString();
    }

    public String command;
    public String description;
    public String content;
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCommand() {

        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



}
