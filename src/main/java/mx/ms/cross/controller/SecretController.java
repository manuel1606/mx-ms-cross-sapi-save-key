package mx.ms.cross.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.ms.cross.model.SaveCommonSecret;
import mx.ms.cross.service.SecretService;

@RestController
@RequestMapping("Api")
public class SecretController {

	@Autowired
	private SecretService secretService;
	
	@RequestMapping(value="/secret", method = RequestMethod.POST)
	private SaveCommonSecret saveSecret(@RequestBody SaveCommonSecret s) {
		
		return secretService.saveSecret(s);
	}
	
	@RequestMapping(value="/secret/{id}", method = RequestMethod.GET)
	private SaveCommonSecret getSecret(@PathVariable String id) {
		
		return secretService.getSecretById(id);
	}
}
