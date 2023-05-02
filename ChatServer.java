package CS5800HW5.Testing;

import java.util.ArrayList;
import java.util.List;


//mediator
public class ChatServer 
{
    private List<Users> registeredUsers;
    Messages message;

    public ChatServer()
    {
        registeredUsers = new ArrayList<>();
    }

    public void createMessage()
    {
        message = new Messages(null, null, null);
    }
    public void registerUser(Users user)
    {
        registeredUsers.add(user);
    }

    public void unRegisterUser(Users user)
    {
        registeredUsers.remove(user);
    }

    public void send(Messages message)
    {
        for(Users users: registeredUsers)
        {
            if(!users.isBlocked())
            {
                System.out.println( "message: " + message.getContent() +  message.toString() + " To: " + users.getName() + " " + message.getTimeStamp());  
            }
            else
            {
                System.out.println("recipient blocked. ");
            }
        }
    }

    public List<Users> getRecipients()
    {
        List<Users> validUsers = new ArrayList<>();
        
        for (Users user : registeredUsers)
        {
            if( !user.isBlocked())
            {
                validUsers.add(user);
            }
        }
        return validUsers;
    }

    public void getRecipientsName()
    {
        for (Users user : registeredUsers)
        {
            System.out.println(user.getName());
        }
    }

    public List<Users> getRegisteredUsers()
    {
        return registeredUsers;
    }

}
