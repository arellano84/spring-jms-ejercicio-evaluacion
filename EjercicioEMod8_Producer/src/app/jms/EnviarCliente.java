package app.jms;

import javax.jms.Destination;

import org.springframework.jms.core.JmsTemplate;

/**
 * @author arellano84
 * @version 20150405
 * 
 * Interfaz para el envio de datos del cliente.
 * 
 * Módulo Spring JMS
 */

public interface EnviarCliente {

	public abstract void setJmsTemplate(JmsTemplate jmsTemplate);

	public abstract void setDestination(Destination destination);
	
	/** Cliente en formato de texto a Enviar.
	  * @param mensaje a enviar.
	  */
	public abstract void enviarMensaje(Object objeto);

}
