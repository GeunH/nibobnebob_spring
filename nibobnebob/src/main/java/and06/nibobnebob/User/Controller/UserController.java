package and06.nibobnebob.User.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import and06.nibobnebob.User.Dto.UserDto;
import and06.nibobnebob.User.Service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {	
	
	private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService; 
    }
	
	@PostMapping("Signup")
	public void createUserInfo(@RequestBody UserDto userDto) {
		
	}	
}
