package com.example.ejercicioUnoaMuchoUni;

import com.example.ejercicioUnoaMuchoUni.entidades.Domicilio;
import com.example.ejercicioUnoaMuchoUni.entidades.Persona;
import com.example.ejercicioUnoaMuchoUni.repositorios.DomicilioRepository;
import com.example.ejercicioUnoaMuchoUni.repositorios.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EjercicioUnoaMuchoUniApplication {
	@Autowired
	PersonaRepository personaRepository;

	public static void main(String[] args) {
		SpringApplication.run(EjercicioUnoaMuchoUniApplication.class, args);
		System.out.println("Funciona OnetoMany Unidireccional");


	}

	@Bean
	CommandLineRunner init(PersonaRepository personaRepository) {
		return args -> {
			System.out.println("-----------------ESTOY FUNCIONANDO---------");

/*El método builder() se genera automáticamente por Lombok
y te permite crear una instancia de Persona.Builder.
Luego, puedes encadenar llamadas a los métodos
setters generados automáticamente para establecer los
valores de los atributos de la clase.
Finalmente, build() crea la instancia
 de la clase Persona con los valores proporcionados.

 */
			Domicilio domicilio1 = Domicilio.builder()
					.calle("Calle 1")
					.numero(123)
					.build();

			Domicilio domicilio2 = Domicilio.builder()
					.calle("Calle 2")
					.numero(456)
					.build();

			// Crear instancia de Persona y agregar domicilios
			Persona persona = Persona.builder()
					.nombre("Juan")
					.apellido("Pérez")
					.edad(30)
					.build();

			persona.agregarDomicilio(domicilio1);
			persona.agregarDomicilio(domicilio2);



			// Guardar el objeto Persona en la base de datos

			personaRepository.save(persona);




			// Recuperar el objeto Persona desde la base de datos

			Persona personaRecuperada = personaRepository.findById(persona.getId()).orElse(null);


			if (personaRecuperada != null) {
				System.out.println("Nombre: " + personaRecuperada.getNombre());
				System.out.println("Apellido: " + personaRecuperada.getApellido());
				System.out.println("Edad: " + personaRecuperada.getEdad());
				personaRecuperada.mostrarDomicilios();


			}





		};

	}



}
