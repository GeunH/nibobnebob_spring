package and06.nibobnebob.Auth.Controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import and06.nibobnebob.Auth.Dto.AuthInfoDto;
import and06.nibobnebob.Auth.Service.AuthService;

@RestController
public class AuthController {
	
	private final AuthService authService;
	
	@Autowired
	AuthController(AuthService authService){
		this.authService = authService;
	}
	
	@PostMapping("login")
	public void userLogin(@RequestBody AuthInfoDto authInfoDto) {
		try {
			authService.userLogin(authInfoDto);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
