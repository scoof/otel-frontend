package com.example.otelfrontend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class FrontendController {

  private final RestTemplate restTemplate;

  public FrontendController(final RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  @GetMapping("/")
  public String hello() {
    return "Hello " + restTemplate.getForObject("http://otel-backend:8080/backend", String.class);
  }
}
