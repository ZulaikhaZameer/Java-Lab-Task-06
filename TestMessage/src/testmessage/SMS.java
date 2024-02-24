/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testmessage;

/**
 *
 * @author Zulaikha
 */
public class SMS extends Message{
    private String recipientContactNo;

    public SMS(String text, String recipientContactNo) {
        super(text);
        this.recipientContactNo = recipientContactNo;
    }
    public String getRecipientContactNo() {
        return recipientContactNo;
    }
    public void setRecipientContactNo(String recipientContactNo) {
        this.recipientContactNo = recipientContactNo;
    }

    @Override
    public String toString() {
        return "SMS{text = '" + getText() + "'"+ ", recipientContactNo = '"+ recipientContactNo + "'" + "} \n -----------------------------------";
    }
    
}
