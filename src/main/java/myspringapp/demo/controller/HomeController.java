package myspringapp.demo.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

  // @GetMapping("/")
  // @ResponseBody
  // public String home() throws IOException {
  //     // Read the content of the index.html file and return it as a string
  //     ClassPathResource resource = new
  //     ClassPathResource("templates/index.html"); byte[] bytes =
  //     Files.readAllBytes(Path.of(resource.getURI())); return new
  //     String(bytes);
  // }

  @RequestMapping(value = "/")
  public String index() {
    return "index";
  }
}
