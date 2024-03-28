package and06.nibobnebob.Auth.Service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;

import and06.nibobnebob.Auth.Dto.AuthInfoDto;
import and06.nibobnebob.User.Repository.UserRepository;

public class AuthServiceImpl implements AuthService{
	private final UserRepository userRepo;
	
	@Autowired
	AuthServiceImpl(UserRepository userRepo){
		this.userRepo = userRepo;
	}
	
	@Override
	public void userLogin(AuthInfoDto authInfoDto) throws SQLException {
		
	}

}
