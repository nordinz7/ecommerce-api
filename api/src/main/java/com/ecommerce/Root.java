package com.ecommerce;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class Root {
  @GetMapping("/")
  public Map<String, String> index() {
    Map<String, String> response = new HashMap<>();
    response.put("message", "Welcome to the E-commerce API");
    return response;
  }
}