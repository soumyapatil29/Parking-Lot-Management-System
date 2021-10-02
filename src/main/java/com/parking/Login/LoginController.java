package com.parking.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	private LoginRepository loginRepository;
	
	@Autowired
    public LoginController(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }
	
	@PostMapping("/loginCheck")
    public ResponseEntity<Void> loginMethod(@RequestBody Login login) {
		Login log=loginRepository.findAllByloginId(login.getLoginId());
		if(log==null) {
			return new ResponseEntity<>(HttpStatus.FORBIDDEN);
		}
		else if(login.getPassword().equals(log.getPassword())) {
			return new ResponseEntity<>(HttpStatus.OK);
		}
		else {
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
    }
}
