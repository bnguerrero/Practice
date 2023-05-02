package CS5800HW5.Testing;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class Messages 
{
    private Users sender;
    private List<Users> recipients = new ArrayList<>();
    private Date timeStamp;
    private String content;
    
    public Messages(Users sender, List<Users> recipients, String content)
    {
        this.sender = sender;
        this.recipients = recipients;
        this.content = content;
        timeStamp = new Date();
    }

    public Users getSender()
    {
        return sender;
    }


    public Users getRecipients()
    {
        for (Users user : recipients)
        {
            return user;
        }
        return null;
        
    }

    public void getRecipientsName()
    {
        for (Users user : recipients)
        {
            System.out.println(user.getName());                           
        }
    }

    public String getContent()
    {
        return content;
    }
    public Date getTimeStamp()
    {
        return timeStamp;
    }

    
    
    public String toString()
    {
        return " From: " + sender.name + " ";
    }
    

}
