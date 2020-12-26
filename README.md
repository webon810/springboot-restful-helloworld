### springboot-restful-helloworld
springboot-restful-helloworld


###

```
curl -X POST -H "Content-Type: application/json" -d "{\"id\":1,\"name\":\"Kindle Fire\",\"price\":199}" http://localhost:8080/addproduct
```

```
	//for post method, need to source -> generate this toString()
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
```

```
    //by default or specify produces as json
	@GetMapping(
			value = "/getproductjson", 
			produces = {MediaType.APPLICATION_JSON_VALUE}
			)
	public Product getProductjson() {
		return new Product(3, "iphone 11", 900.09f);
	}
```

```

    //for xml output
	@GetMapping(
			value = "/getproductxml", 
			produces = {MediaType.TEXT_XML_VALUE}
			)
	// method that returns all items
	public String getProductxml() {
		return "<product></product>";
	}
```