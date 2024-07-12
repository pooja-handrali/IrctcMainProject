package com.example.controler;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Coustomer;

@RestController
public class CoustomerControler {
	@DeleteMapping(value="/dele/{id}", produces="plne/txt  ")
	public String CoustomerDeleted(@PathVariable Integer id) {
		String s="Deletd";
		return s;
		
	}
	@PutMapping(value="/putMap",produces="application/json")
	public  String CoustomerUpdated(@RequestBody Coustomer c) {
		String s="coustomerUpdated";
		return s;
	}
	@PostMapping("/postmap")
	public String coustomerAdded(@RequestBody Coustomer c) {
		System.out.println(c);
		String s="coustomer added";
		return s;
	}
	@GetMapping("/Coustomers")
	public Coustomer getmsg() {
		Coustomer c= new Coustomer(12,"pooa","pooja@gmail.com");
		return c;
	}
	@GetMapping("/coustomers")
	public List<Coustomer>  getMessages() {
		Coustomer c= new Coustomer(1,"pooa","pooja@gmail.com");
		Coustomer c1= new Coustomer(2,"mani","mani@gmail.com");
		Coustomer c2= new Coustomer(3,"hani","hani@gmail.com");
		Coustomer c3= new Coustomer(4,"manali",",manali@gmail.com");
		Coustomer c4= new Coustomer(5,"buddy","buddy@gmail.com");
		List<Coustomer> cou=Arrays.asList(c,c1,c2,c3,c4);
		return cou;
	}

}
