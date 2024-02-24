/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testmessage;

/**
 *
 * @author Zulaikha
 */
public class Email extends Message{
    private String sender;
    private String receiver;
    private String subject;

    public Email( String text, String sender, String receiver, String subject) {
        super(text);
        this.sender = sender;
        this.receiver = receiver;
        this.subject = subject;
    }
    public String getSender() {
        return sender;
    }
    public String getReceiver() {
        return receiver;
    }
    public String getSubject() {
        return subject;
    }
    public void setSender(String sender) {
        this.sender = sender;
    }
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    @Override
    public String toString() {
        return "Email{text = '"+ getText() + "'"+ ", sender = '"+ sender + "'"+ ", receiver = '"+ receiver + "'"+ ", subject = '"+ subject + "'"+ "} \n -----------------------------------";
    }
    
}
