package and06.nibobnebob.User.Service;

import java.sql.SQLException;

import and06.nibobnebob.User.Dto.UserDto;

public interface UserService {
	void createUserInfo(UserDto userDto) throws SQLException;
	
	void loginToApp(UserDto userDto) throws SQLException;
}
