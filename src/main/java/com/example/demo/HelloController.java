package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
		
	@RequestMapping(value="/hello", method = RequestMethod.GET)
	public String helloIndex(@RequestParam(name = "name", defaultValue = "World") String name) {
		return "restful api hello with sboot " + name; 
	}
	
	@GetMapping("/getproduct")
	// method that returns all items
	public Product getProduct() {
		return new Product(1, "iphone", 999.99f);
	}
		
	@GetMapping(
			value = "/getproductjson", 
			produces = {MediaType.APPLICATION_JSON_VALUE}
			)
	public Product getProductjson() {
		return new Product(3, "iphone 11", 900.09f);
	}
	
	@GetMapping(
			value = "/getproductxml", 
			produces = {MediaType.TEXT_XML_VALUE}
			)
	// method that returns all items
	public String getProductxml() {
		return "<product></product>";
	}
	
	@GetMapping(
			value = "/getproducthtml", 
			produces = {MediaType.TEXT_HTML_VALUE}
			)
	public String getProducthtml() {
		return "<html><title>sboot</title><body><h1>sboot rest test</h1></body></html>";
	}
	
	@GetMapping("/getproducts")
	// method that returns all items
	public List<Product> getProducts() {
		
		List<Product> products = new ArrayList<Product>();
		products.add(new Product(1,"Kindle Fire", 98.02f));
		products.add(new Product(2,"Kindle Fire 22", 90.02f));
		return products;
	}

	@GetMapping("/resources/{id}")
	// method that returns a specific item
	public String getid(long id) {
		return null;
	}

	@PostMapping("/addproduct")
	// method that creates a new item
    public void addProduct(@RequestBody Product product) {
		System.out.println(product);
	}

	@PutMapping("/resources/{id}")
	// method that updates an item
    public void update(long id) {
		
	}

	@DeleteMapping("/resources/{id}")
	// method that deletes an item
	public void delete(long id) {
		
	}

}
