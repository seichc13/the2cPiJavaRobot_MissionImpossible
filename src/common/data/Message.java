package common.data;

public class Message {
    private Integer id;
    private String info;

    public Message(Integer id, String info) {
        this.id = id;
        this.info = info;
    }

    public Integer getId() {
        return id;
    }

    public String getInfo() {
        return info;
    }
    
    
}
