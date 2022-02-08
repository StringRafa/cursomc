package com.panambystudio.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.panambystudio.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
