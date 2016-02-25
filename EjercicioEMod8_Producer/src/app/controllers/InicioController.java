package app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author arellano84
 * @version 20150405
 * 
 * Controller de index.jsp.
 * 
 * Módulo Spring JMS
 */

@Controller
@RequestMapping("/")
public class InicioController {
	
	@RequestMapping(method=RequestMethod.GET, value="")
	public String inicio(){
		return "index";
	}

}
