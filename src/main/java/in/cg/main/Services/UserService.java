package in.cg.main.Services;

import java.util.List;
import java.util.Optional;

import in.cg.main.entities.User;

public interface UserService {

	public User createUser(User u);
	public List<User> getAllUsers();
	public Optional<User> getUserDetails(int id);
}
