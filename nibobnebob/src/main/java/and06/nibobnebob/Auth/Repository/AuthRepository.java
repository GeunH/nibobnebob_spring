package and06.nibobnebob.Auth.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import and06.nibobnebob.Auth.Dto.AuthInfoDto;

public interface AuthRepository extends JpaRepository<AuthInfoDto, Long>{
	
}
