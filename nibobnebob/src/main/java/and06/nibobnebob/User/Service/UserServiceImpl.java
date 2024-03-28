package and06.nibobnebob.User.Service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import and06.nibobnebob.User.Dto.UserDto;
import and06.nibobnebob.User.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository; 

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
	
	@Override
	public void createUserInfo(UserDto userDto) throws SQLException {
		
	}

	@Override
	public void loginToApp(UserDto userDto) throws SQLException {
		
	}
}
