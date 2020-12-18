package com.example.democrud;


import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.democrud.model.Usuario;
import com.example.democrud.service.api.UsuarioServiceAPI;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoCrudApplicationTests {

	@Autowired
	private UsuarioServiceAPI userServiceAPI;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Test
	public void usuarioTest() {
		Usuario user = new Usuario();
		user.setId(0);
		user.setNombre("arturo");
		user.setContrasenia(encoder.encode("12345"));
		
		Usuario retorno = userServiceAPI.save(user);
		
		assertTrue(retorno.getContrasenia().equalsIgnoreCase(user.getContrasenia()));
	}

}




