package CS5800HW5.Testing;


public class Users 
{
    String name; 
    boolean blocked = false;
    private ChatServer chatServer;

    public Users(String name, ChatServer chatServer)
    {
        this.name = name;
        this.chatServer = chatServer;
    }

    public String getName()
    {
        return name;
    }
    public void sendMessage(Messages message)
    {
        
        chatServer.send(message);
    }
    public void recieveMessage(Messages message)
    {
        System.out.println("recieved message from: " + message.getSender());
    
    }
    public void undoLastMessage()
    {

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
