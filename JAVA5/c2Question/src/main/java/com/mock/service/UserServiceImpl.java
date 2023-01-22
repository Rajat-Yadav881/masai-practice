import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mock.exception.EmailException;
import com.mock.exception.UserException;
import com.mock.model.Email;
import com.mock.model.User;
import com.mock.reposatory.EmailRepo;
import com.mock.reposatory.UserRepo;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepo userRepository;
	
	@Autowired
	private EmailRepo emailRepository;
	@Override
	public List<User> getAllUser() throws UserException {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User createUser(User user) throws UserException {
		
            return userRepository.save(user);
        
	}

	@Override
	public User GetUser(long id) throws UserException {
		Optional<User> optionalUser = userRepository.findById((int) id);
        if (optionalUser.isPresent()) {
            return optionalUser.get();
        } else {
            throw new UserException("User with id " + id + " not found");
        }
	}



	@Override
	public Email userEmail(User user) throws UserException, EmailException {
		// TODO Auto-generated method stub
		return user.getEmail();
	}

	@Override
	public Email createEmail(Email email) throws EmailException, UserException {
		User user = userRepository.findById(email.getUser().getId()).orElse(null);
        if (user == null) {
            throw new UserException("User not found");
        }
        email.setUser(user);
        return emailRepository.save(email);
	}

	@Override
	public User deleteUser(long id) throws UserException {
		return userRepository.findById((int) id).orElse(null);

	}
	
	
}