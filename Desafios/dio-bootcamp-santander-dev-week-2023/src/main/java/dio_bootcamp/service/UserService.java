package dio_bootcamp.service;

import dio_bootcamp.domain.model.User;

public interface UserService {

	User findById(Long id);

	User create(User userToCreate);
}
