package com.example.walterGuerrero_Pfinal_TLab;

import com.example.walterGuerrero_Pfinal_TLab.model.Usuario;
import com.example.walterGuerrero_Pfinal_TLab.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Optional;

@SpringBootApplication
public class WalterGuerreroPfinalTLabApplication {

	public static void main(String[] args) {
		SpringApplication.run(WalterGuerreroPfinalTLabApplication.class, args);
	}
	/* despues de llave
	* */
	// Inyecta el servicio de usuario aquí
	@Autowired
	private UsuarioService usuarioService;

	// Define un bean de CommandLineRunner para ejecutar código al inicio
	@Bean
	public CommandLineRunner run() {
		return args -> {


			// Crea una instancia del usuario
			Usuario aux = new Usuario();
			aux.setNombre("walter");
			aux.setApellido("guerrero");
			aux.setDni("25521576");
			aux.setUsuario("walter");
			aux.setClave("admin");
			aux.setRol(1);

			Optional<Usuario> existe = usuarioService.VerificarUser(aux.getDni());

			if(existe.isEmpty()){
				// Guarda el usuario usando el servicio
				usuarioService.crearUsuario(aux);
			}

		};
	}

}
