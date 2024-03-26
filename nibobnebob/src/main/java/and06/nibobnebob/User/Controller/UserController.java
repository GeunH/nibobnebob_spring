package and06.nibobnebob.User.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import and06.nibobnebob.User.Model.Dto.UserDto;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	
	
	@PostMapping("/Signup")
	public void userSignup(@RequestBody UserDto userDto) {
				
	}
}
