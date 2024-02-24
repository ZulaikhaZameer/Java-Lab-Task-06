/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testmessage;

/**
 *
 * @author Zulaikha
 */
public class Message {
    private String text;

    public Message(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    @Override
    public String toString() {
        return text;
    }
    public void encodeMessage() {
    char[] encodedText = new char[text.length()];
    
    for (int i = 0; i < text.length(); i++) {
        char c = text.charAt(i);
        
        if ((c >= 'A' && c < 'Z') || (c >= 'a' && c < 'z')) {
            encodedText[i] = (char) (c + 1);
        } else if (c == 'Z') {
            encodedText[i] = 'A';
        } else if (c == 'z') {
            encodedText[i] = 'a';
        } else {
            encodedText[i] = c;
        }
    }
    text = new String(encodedText);
    }
}
