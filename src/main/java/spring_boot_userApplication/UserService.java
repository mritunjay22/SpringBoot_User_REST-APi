package spring_boot_userApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
	
	@Autowired
	 private UserRepository userRepo;

	//to get all User
	public List<UserEntity> getAllUser(){
		List<UserEntity> userList= new ArrayList<>();
		userRepo.findAll().forEach(userList::add);
		return userList;
	}
	
	
	//to Create User
	public void createUser(UserEntity newUser) {
//	userRepo.save(newUser);
		userRepo.save(newUser);
		
		System.out.println("Successfully Created");
	}
	
	//to delete User
	public void deleteUserById(int id) {
		userRepo.deleteById(id);
	}
	
	//fetch user by id
	public Optional<UserEntity> getUserById(int id) {
		 return userRepo.findById(id);
	}
	
	//adding Multiple user
	public void addMultipleUser(List<UserEntity> multi) {
		userRepo.saveAll(multi);
	}
	
	//to edit or update a user
	public void updateUser(UserEntity updated) {
		userRepo.save(updated);
		}
	
	//to find by username
	public List<UserEntity> findByUserName(String userName){
		return  userRepo.findByuserName(userName);
	}
	
	//to find by UserEmail
	public List<UserEntity> findByUserEmail(String userEmail){
		return userRepo.findByuserEmail(userEmail);
	}
	
	//to count total number of user
	public long countTotalUser() {
		return userRepo.count();
	}
	
	
	
	
}
