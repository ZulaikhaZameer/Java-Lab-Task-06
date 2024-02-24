/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testmessage;

/**
 *
 * @author Zulaikha
 */
public class TestMessage {
    public static boolean containsKeyword(Message messageObject, String keyword) {
        if(messageObject.toString().indexOf(keyword,0) >= 0)
        return true; //if keywords is present in text    
        return false;  //if keyword is not present in the text
    }

    public static void main(String[] args) {
        SMS sms = new SMS("Hello, how are you doing?", "123456789");
        Email email = new Email("What's the delivery status?", "ali@abc.com", "bilal@xyz.com", "delivery status");
        
        System.out.println("SMS details: \n" + sms);
        System.out.println("Email details: \n" + email);
        
        System.out.println("Contains 'are' in SMS: " + containsKeyword(sms, "are"));
        System.out.println("Contains 'delivery' in Email: " + containsKeyword(email, "delivery"));
        
        Message finalMessage = new Message("This is Java");
        System.out.println("Original Message: " + finalMessage);
        finalMessage.encodeMessage();
        System.out.println("Encoded Message: " + finalMessage);
    }
}
