package dio.my_first_web_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.my_first_web_api.model.Usuario;
import dio.my_first_web_api.repository.UsuarioRepository;

@RestController
@RequestMapping("/users")
public class UsuarioController {

	@Autowired
	public UsuarioRepository userRepository;

	@GetMapping()
	public List<Usuario> getUsers() {
		return userRepository.findAll();
	}

	@GetMapping("/{username}")
	public Usuario getOne(@PathVariable("username") String username) {
		return userRepository.findByUserName(username);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer id) {
		userRepository.deleteById(id);
	}

	@PostMapping()
	public void postUser(@RequestBody Usuario usuario) {
		userRepository.save(usuario);
	}

}
