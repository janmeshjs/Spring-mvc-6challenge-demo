package myspringapp.demo.controller;


import org.springframework.core.env.PropertySource.StubPropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

  @RequestMapping(value = "/")
  public String index() {
    return "index";
  }
}

