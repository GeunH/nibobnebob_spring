package and06.nibobnebob.User.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import and06.nibobnebob.User.Dto.UserDto;

public interface UserRepository extends JpaRepository<UserDto, Long> {
   
}

