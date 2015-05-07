package common.data;

public class ReceivedMessage extends Message{
    
    private Integer x;
    private Integer y;
    private Integer speedInProzent;
    private Integer directionInGrad;
    private String status;

    public ReceivedMessage(Integer id, String info) {
        super(id, info);
    }

    public ReceivedMessage(Integer x, Integer y, Integer speedInProzent, Integer directionInGrad, String status, Integer id, String info) {
        super(id, info);
        this.x = x;
        this.y = y;
        this.speedInProzent = speedInProzent;
        this.directionInGrad = directionInGrad;
        this.status = status;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public Integer getSpeedInProzent() {
        return speedInProzent;
    }

    public Integer getDirectionInGrad() {
        return directionInGrad;
    }

    public String getStatus() {
        return status;
    }

    
    
    
}
