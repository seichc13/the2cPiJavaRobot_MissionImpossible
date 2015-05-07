package common.data;

public class SendedCommand extends Message{

    private String cmd;
    private Integer directionInDegree;
    private Integer speedInProzent;
    private static final String FILE_TOKEN_DELIMITER = ";";
    
    public SendedCommand(Integer id, String info) {
        super(id, info);
    }

    public SendedCommand(String cmd, Integer directionInDegree, Integer speedInProzent, Integer id, String info) {
        super(id, info);
        this.cmd = cmd;
        this.directionInDegree = directionInDegree;
        this.speedInProzent = speedInProzent;
    }

    public String getCmd() {
        return cmd;
    }

    public Integer getDirectionInDegree() {
        return directionInDegree;
    }

    public Integer getSpeedInProzent() {
        return speedInProzent;
    }

    public static String getFILE_TOKEN_DELIMITER() {
        return FILE_TOKEN_DELIMITER;
    }
    
    
    
}
