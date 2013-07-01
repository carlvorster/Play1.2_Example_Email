package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import notifiers.Notifier;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }

    
    public static void sendEmailText() {
    	Logger.info("sendEmailText");
    	
    	Notifier.sendEmailText("carl.vorster@vine.co.za", "hallo");
    	index();
    }
    
    
    public static void sendEmailHtml() {
    	Logger.info("sendEmailHtml");
    	
    	Notifier.sendEmailHtml("carl.vorster@vine.co.za", "hallo");
    	index();
    }
    
    
    public static void sendEmailBoth() {
    	Logger.info("sendEmailBoth");
    	
    	Notifier.sendEmailBoth("carl.vorster@vine.co.za", "hallo");
    	index();
    }
    
    
    public static void sendEmailTextAttachment() {
    	Logger.info("sendEmailTextAttachment");
    	
    	Notifier.sendEmailTextAttachment("carl.vorster@vine.co.za", "hallo");
    	index();
    }
    
    
    public static void sendEmailHtmlAttachment() {
    	Logger.info("sendEmailHtmlAttachment");
    	
    	Notifier.sendEmailHtmlAttachment("carl.vorster@vine.co.za", "hallo");
    	index();
    }
    
    
    public static void sendEmailBothAttachment() {
    	Logger.info("sendEmailBothAttachment");
    	
    	Notifier.sendEmailBothAttachment("carl.vorster@vine.co.za", "hallo");
    	index();
    }
    
}