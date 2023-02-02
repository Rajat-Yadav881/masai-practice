package com.masai.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.masai.Model.Email;
import com.masai.Model.User;
import com.masai.exception.UserException;


@Repository
public interface UserDAO extends JpaRepository<User, Integer>  {
	
	@Query("select email from User where ID=?1")
	public Email getEmailByUserID(Integer Id)throws UserException;

}
