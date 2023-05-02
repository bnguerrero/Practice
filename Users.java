package CS5800HW5.Testing;

import java.util.List;

public class Users 
{
    String name; 
    boolean blocked;
    private ChatServer chatServer;
    private Messages message;
    private MessageMemento memento;

    public Users(String name, ChatServer chatServer)
    {
        this.name = name;
        this.chatServer = chatServer;
    }

    public String getName()
    {
        return name;
    }
    public void sendMessage(List<Users> recipients, String content)
    {
        Messages message = new Messages(this,recipients, content);
        chatServer.send(message);
        this.message = message;
        memento = new MessageMemento(message.getContent(), message.getTimeStamp());
    }
    public void recieveMessage(Messages message)
    {
        System.out.println("recieved message" + message.toString());
        
    }
    public void undoLastMessage()
    {
        if(message != null && memento != null)
        {
            message.setContent(memento.getContent());
            message.setTimeStamp(memento.getTimeStamp());
            System.out.println("message '" + message.getContent()+ "' undone.");
        }
        else
        {
            System.out.println("no message to undo");
        }
    }
    public void setBlocked(boolean blocked)
    {
        this.blocked = blocked;
    }

    public boolean isBlocked()
    {
        return blocked;
    }
    
    public Users getUser()
    {
        return new Users(this.name, this.chatServer);
    }

    
}
