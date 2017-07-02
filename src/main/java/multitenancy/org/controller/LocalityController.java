package multitenancy.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import multitenancy.org.model.Locality;
import multitenancy.org.repository.LocalityRepository;

@RestController
@RequestMapping("/{tenantId}/points")
public class LocalityController {

	@Autowired
	private LocalityRepository pointRepository;

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Locality> invoices() {
		return pointRepository.findAll();
	}
	
}
