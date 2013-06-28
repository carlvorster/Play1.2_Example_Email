package notifiers;

import org.apache.commons.mail.EmailAttachment;

import play.Logger;
import play.Play;
import play.mvc.*;
import models.*;

public class Notifier extends Mailer {

	public static void sendEmailText(String emailAddr, String message) {
		Logger.info("Notifier.sendEmailText() emailAddr:"+emailAddr+" message:"+message);
		
		setFrom("webmaster@vine.co.za");
        setSubject("Text Email");
        addRecipient(emailAddr);
        send(message);
	}
	
	public static void sendEmailHtml(String emailAddr, String message) {
		Logger.info("Notifier.sendEmailHtml() emailAddr:"+emailAddr+" message:"+message);
		
		setFrom("webmaster@vine.co.za");
        setSubject("HTML Email");
        addRecipient(emailAddr);
        send(message);
	}
	
	public static void sendEmailBoth(String emailAddr, String message) {
		Logger.info("Notifier.sendEmailBoth() emailAddr:"+emailAddr+" message:"+message);
		
		setFrom("webmaster@vine.co.za");
        setSubject("Both Email");
        addRecipient(emailAddr);
        send(message);
	}
	
	
	public static void sendEmailTextAttachment(String emailAddr, String message) {
		Logger.info("Notifier.sendEmailTextAttachment() emailAddr:"+emailAddr+" message:"+message);
		
		setFrom("webmaster@vine.co.za");
        setSubject("Text Email and Attachment");
        addRecipient(emailAddr);
        
		EmailAttachment attachment = new EmailAttachment();
		attachment.setDescription("A pdf document");
		
		attachment.setPath(Play.getFile("attachments/example.pdf").getPath());
		addAttachment(attachment);
		send(message);
	}

	public static void sendEmailHtmlAttachment(String emailAddr, String message) {
		Logger.info("Notifier.sendEmailHtmlAttachment() emailAddr:"+emailAddr+" message:"+message);
		
		setFrom("webmaster@vine.co.za");
        setSubject("Html Email and Attachment");
        addRecipient(emailAddr);
        
		EmailAttachment attachment = new EmailAttachment();
		attachment.setDescription("A pdf document");
		attachment.setPath(Play.getFile("attachments/example.pdf").getPath());
		addAttachment(attachment);
		send(message);
	}

	public static void sendEmailBothAttachment(String emailAddr, String message) {
		Logger.info("Notifier.sendEmailBothAttachment() emailAddr:"+emailAddr+" message:"+message);
		
		setFrom("webmaster@vine.co.za");
        setSubject("Both Email and Attachment");
        addRecipient(emailAddr);
        
		EmailAttachment attachment = new EmailAttachment();
		attachment.setDescription("A pdf document");
		attachment.setPath(Play.getFile("attachments/example.pdf").getPath());
		addAttachment(attachment);
		send(message);
	}
	
}