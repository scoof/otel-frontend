package com.example.otelfrontend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.trace.http.HttpTraceRepository;
import org.springframework.boot.actuate.trace.http.InMemoryHttpTraceRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class OtelFrontendApplication {

  public static void main(String[] args) {
    SpringApplication.run(OtelFrontendApplication.class, args);
  }

  @Bean
  public RestTemplate restTemplate() {
    return new RestTemplate();
  }

  @Bean
  public HttpTraceRepository httpTraceRepository() {
    return new InMemoryHttpTraceRepository();
  }
}
