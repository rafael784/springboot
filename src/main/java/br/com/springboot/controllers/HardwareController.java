package br.com.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import br.com.springboot.model.Hardware;
import br.com.springboot.repository.HardwareRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/hardware")
public class HardwareController {

	@Autowired
	private HardwareRepository hardwareRepository;
	@PostMapping("/")
	public void create(@RequestBody Hardware hardware) {
		System.out.println(hardware.getMarca());
		this.hardwareRepository.save(hardware);
	}
	
	@GetMapping("/")
	public List<Hardware> list() {
		return this.hardwareRepository.findAll();
	}
	
	@GetMapping("/remove/{id}")
	public void remove(@PathVariable("id") long id)
	{
		System.out.println(id);
		
		this.hardwareRepository.deleteById(id);
	}
	
	@PostMapping("/edit/{id}")
	public void edit(@RequestBody Hardware hardware, @PathVariable("id") long id)
	{
		System.out.println(id);
		
		this.hardwareRepository.deleteById(id);
		this.hardwareRepository.save(hardware);
	}
	
}
