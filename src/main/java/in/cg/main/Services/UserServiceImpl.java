package in.cg.main.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.cg.main.entities.User;
import in.cg.main.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepo; 

	@Override
	public User createUser(User u) {
		
		return userRepo.save(u);
	}

	@Override
	public List<User> getAllUsers() {
	
		return userRepo.findAll();
	}

	@Override
	public Optional<User> getUserDetails(int id) {
		
		return userRepo.findById(id);
	}

}
