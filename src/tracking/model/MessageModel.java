package tracking.model;

import common.data.Message;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.swing.AbstractListModel;

public class MessageModel extends AbstractListModel implements Iterable<Message>{
    private List<Message> messages = new LinkedList<>();
    public void add(Message msg){
        messages.add(msg);
        super.fireIntervalAdded(this, messages.size()-1, messages.size()-1);
    }
    
    public int getSize(){
        return messages.size();
  
    }

    @Override
    public Message getElementAt(int i) {
        return messages.get(i);
    }
    
    public Message getLastMessage() {
        return messages.get(messages.size()-1);
    }

    @Override
    public Iterator<Message> iterator() {
        return messages.iterator();
    }

    public List<Message> getMessages() {
        return messages;
    }
    
    
    
    
}
