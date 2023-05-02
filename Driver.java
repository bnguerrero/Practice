package CS5800HW5.Testing;



public class Driver 
{
    public static void main(String[] args) 
    {
        ChatServer chat1 = new ChatServer();

       Users bri = new Users("bri", chat1 );
       Users jj = new Users("jj", chat1);
       Users yourMom = new Users("your mom", chat1);
       
       chat1.registerUser(bri);
       chat1.registerUser(jj);
       chat1.registerUser(yourMom);

       
       Messages message1 = new Messages(bri, chat1.getRecipients(), "wassup");

       //chat1.getRecipientsName();

       //message1.getRecipientsName();

       

       
    
       //System.out.println(message1.toString());
       chat1.send(message1);

    }

    
}
