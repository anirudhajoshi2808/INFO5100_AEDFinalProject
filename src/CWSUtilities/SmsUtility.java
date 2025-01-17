/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CWSUtilities;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;


/**
 *
 * @author nitan
 */
public class SmsUtility {
    public static final String ACCOUNT_SID = "ACad1b6a685dd70e0e33087fc46e8201c6";
    public static final String AUTH_TOKEN = "0a32f51c4548a297413d202c934787bb";

    public static void sendSMS(String to, String smsMessage) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber(to),
                new com.twilio.type.PhoneNumber("+18654843955"), //fromphone
                smsMessage)
            .create();

        System.out.println(message.getSid());
    }
    
    public static void main(String[] args) {
        SmsUtility.sendSMS("+18576750869", "Hello From Twilio");
    }
}
