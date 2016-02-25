package app.jms;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

/**
 * @author arellano84
 * @version 20150405
 * 
 * Clase para enviar los mensajes JMS.
 * 
 * Módulo Spring JMS
 */

public class EnviarClienteTexto implements EnviarCliente {

	private JmsTemplate jmsTemplate;
	private Destination destination;
	private static int x = 0;
	
	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}
	
	public void setDestination(Destination destination) {
		this.destination = destination;
	}
	
	public void enviarMensaje(Object texto) {
		final String textoMensaje = (String)texto;
		jmsTemplate.send(destination, new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				x++;
				return session.createTextMessage(textoMensaje);
			}
		});
	}
}
