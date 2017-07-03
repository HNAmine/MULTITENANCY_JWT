package multitenancy.org.security.repository;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import multitenancy.org.security.model.User;

@RestController
@RequestMapping("/users")
@CrossOrigin
public class UserController {

	@Autowired
	UserRepository userRepository;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<User> getUsers() {
		
		
		List<User> users = userRepository.findAll();
		System.out.println("users list !");
		userRepository.findAll().forEach(user -> {
			System.out.println(user.getFirstname());
		});

		return users;
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public User addUser(@RequestBody User user) {
		
		System.out.println("Inside !");

		user.setLastPasswordResetDate(new Date());
		
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		
		return userRepository.save(user);
	}
}
