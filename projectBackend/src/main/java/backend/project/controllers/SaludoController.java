package backend.project.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/saludo")
public class SaludoController {
	@GetMapping
	public String Saludo() {
		return "Hola desde el servidor WEB";
	}

}
