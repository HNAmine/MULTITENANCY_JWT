package multitenancy.org.security.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import multitenancy.org.security.model.User;

@RestController
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	@CrossOrigin
	@RequestMapping(path = "/users", method = RequestMethod.GET)
	public List<User> getUsers() {
		System.out.println("users list !");
		userRepository.findAll().forEach(user -> {
			System.out.println(user.getFirstname());
		});
		
		return userRepository.findAll();
	}
}
