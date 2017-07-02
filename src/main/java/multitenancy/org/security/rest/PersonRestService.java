package multitenancy.org.security.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonRestService {
	private static final List<Person> persons;

//	@Autowired
//	UserRepository userRepository;
	
	static {
		persons = new ArrayList<>();
		persons.add(new Person("Hello", "World"));
		persons.add(new Person("Foo", "Bar"));
	}

	@CrossOrigin
	@RequestMapping(path = "/persons", method = RequestMethod.GET)
	public static List<Person> getPersons() {
		return persons;
	}
	
//	@CrossOrigin
//	@RequestMapping(path = "/users", method = RequestMethod.GET)
//	public List<User> getUsers() {
//		System.out.println("users list !");
//		userRepository.findAll().forEach(user -> {
//			System.out.println(user.getFirstname());
//		});
//		
//		return userRepository.findAll();
//	}

	@CrossOrigin
	@RequestMapping(path = "/public", method = RequestMethod.GET)
	public static Person getPerson() {
		return new Person("FREE", "RESSOURCE");
	}

	@RequestMapping(path = "/persons/{name}", method = RequestMethod.GET)
	public static Person getPerson(@PathVariable("name") String name) {
		return persons.stream().filter(person -> name.equalsIgnoreCase(person.getName())).findAny().orElse(null);
	}
}
