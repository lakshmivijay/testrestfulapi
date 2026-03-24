package in.cg.main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.cg.main.Services.UserService;
import in.cg.main.entities.User;

@RestController
public class MyController {
	
	@Autowired
	private UserService userser;
	
	@PostMapping("/User")
	public User addUserDetails(@RequestBody User u)
	{
	
		return userser.createUser(u);
	}

	@GetMapping("/User")
	public List getAllUserDetails()
	{
		return userser.getAllUsers();
	}
	
	@GetMapping("/User/{id}")
	public ResponseEntity<User>getUserDetail(@PathVariable int id)
	{
	    User u=userser.getUserDetails(id).orElse(null);
		
	    if(u!=null)
	    {
	    	return ResponseEntity.ok().body(u);
	    }
	    else
	    {
		    return ResponseEntity.notFound().build(); 
	    
	     }
    }
}
