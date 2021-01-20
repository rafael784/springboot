package br.com.springboot.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.springboot.model.User;

@RestController
@RequestMapping("/users")
public class UserController {
	
  // GET
  // POST
  // PUT
  // DELETE
  // PATCH
	
private List<User> users = new ArrayList<>();

  @GetMapping("/{id}")
  public  User user(@PathVariable("id") long id) {
	  User user = new User();
	  System.out.println("o id é  " + id);	  
	  user.setId(id);
	  user.setName("Dani");
	  user.setUsername("Dani Leao");
	  
	  return user;
  }
  
  @PostMapping("/")
  public User user(@ModelAttribute User user) {
	
	
    return user;
  }

}