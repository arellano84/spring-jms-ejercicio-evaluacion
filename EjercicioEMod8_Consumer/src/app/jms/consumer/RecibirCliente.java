package app.jms.consumer;

import javax.jms.Message;
import javax.jms.MessageListener;

/**
 * @author arellano84
 * @version 20150405
 * 
 * Interfaz para recibir los datos del cliente.
 * 
 * Módulo Spring JMS
 */

public interface RecibirCliente extends MessageListener {
	
	/** Cliente en formato de texto a recibir.
	  * @param mensaje recibido.
	  */
	public void onMessage(Message message);

}
