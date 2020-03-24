package com.wildcards.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

//THIS FILE WILL SEND EMAILS OF DIFFERENT TYPES


@Service("emailService")
public class EmailService {
	
	@Autowired
    private JavaMailSender mailSender;
      
    @Autowired
    private SimpleMailMessage preConfiguredMessage;
    
    /**
     * This method will send compose and send the message 
     * */
    public void sendMail(String to, String subject, String body) 
    {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(body);
        mailSender.send(message);
    }
  
    /**
     * This method will send a pre-configured message
     * */
    
    public void sendPreConfiguredMail(String message) 
    {
        SimpleMailMessage mailMessage = new SimpleMailMessage(preConfiguredMessage);
        mailMessage.setText(message);
        mailSender.send(mailMessage);
    }
        
    public void sendSignUpEmail(String to, String confirmation) {
    	
    	SimpleMailMessage signupMessage = new SimpleMailMessage();
    	signupMessage.setTo(to);
    	signupMessage.setText(confirmation);
    	mailSender.send(signupMessage);
    			
    }

	

}
