package app.jms.consumer;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * @author arellano84
 * @version 20150405
 * 
 * Clase para recibir los mensajes JMS.
 * 
 * Módulo Spring JMS
 */

public class RecibirClienteTexto implements RecibirCliente {

	
	public void onMessage(Message message) {
		if (message instanceof TextMessage) {
			try {
				System.out.println("-Cliente Recibido-->" + ((TextMessage) message).getText());
			} catch (JMSException ex) {
				throw new RuntimeException(ex);
			}
		} else {
			throw new IllegalArgumentException("Mensaje debe ser de tipo TextMessage");
		}
	}
}
