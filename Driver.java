package CS5800HW5.Testing;



public class Driver 
{
    public static void main(String[] args) 
    {
        ChatServer chat1 = new ChatServer();

       Users bri = new Users("bri", chat1 );
       Users jj = new Users("jj", chat1);
       Users yourMom = new Users("your mom", chat1);
       Users spam = new Users("spam", chat1);

       
       chat1.registerUser(bri);
       chat1.registerUser(jj);
       chat1.registerUser(yourMom);
       chat1.registerUser(spam);
       
       spam.setBlocked(true); 



       //bri.sendMessage(chat1.getRecipients(), "what are you guys doing?");
       bri.sendMessage(chat1.getRecipients(), "what???");
       spam.sendMessage(chat1.getRecipients(), "hddjkldjdklj");
       bri.sendMessage(chat1.getRecipients(), "hello???");
       bri.undoLastMessage();
       

    }

    
}
