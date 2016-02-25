package app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import app.jms.EnviarClienteTexto;
import app.modelo.Cliente;

/**
 * @author arellano84
 * @version 20150405
 * 
 * Controller de la página del formulario.
 * Inyecta Productor de Mensaje.
 * 
 * Módulo Spring JMS
 */

@Controller
@RequestMapping("/alta")
public class AltaController {
	
	@Autowired
	private EnviarClienteTexto enviadorTexto;
	
	@RequestMapping(method = RequestMethod.GET)
	public String enviarFormulario(Model modelo){
		modelo.addAttribute("cliente", new Cliente());
		return "enviarCliente";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String procesarDatos(Cliente cliente, Model modelo){
		enviadorTexto.enviarMensaje(cliente.toString());
		modelo.addAttribute("msg","Cliente enviado correctamente");
		return "mostrarMensaje";
	}

}
