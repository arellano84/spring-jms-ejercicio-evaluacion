package app.cliente;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author arellano84
 * @version 20150405
 * 
 * Clase principal para recuperar mensajes del cliente y mostrar por consola.
 * 
 * Módulo Spring JMS
 */

public class Main {

	public static void main(String args[]) {
		//Iniciando la factoria de jms spring.
		AbstractApplicationContext factoria = new ClassPathXmlApplicationContext("spring.xml");		
		System.out.println("Recibiendo mensajes...");
		factoria.registerShutdownHook();
	}
}
