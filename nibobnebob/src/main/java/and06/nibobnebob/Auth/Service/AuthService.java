package and06.nibobnebob.Auth.Service;

import java.sql.SQLException;

import and06.nibobnebob.Auth.Dto.AuthInfoDto;

public interface AuthService {

	void userLogin(AuthInfoDto authInfoDto) throws SQLException;

}
