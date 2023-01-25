package controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {

    @GetMapping("/")
	public String welcome() {
		return "Welcome to Blood Bank App";
	}   
}
