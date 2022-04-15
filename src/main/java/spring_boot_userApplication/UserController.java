package spring_boot_userApplication;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;

	@RequestMapping(method=RequestMethod.GET,value="/hello")
	public String test() {
		return "Mritunjay";
	}
	
	//to create a new user
	//@RequestMapping(method=RequestMethod.POST,value="/createuser")
	@PostMapping(value="/createuser")
	public void createUser(@RequestBody UserEntity newUSer) {
		service.createUser(newUSer);
	}
	//delete user
	@RequestMapping(method=RequestMethod.DELETE,value="/deleteuser/{id}")
	public void deleteUser(@PathVariable int id) {
		service.deleteUserById(id);
	}
	
	//edit a user or update
	@RequestMapping(method=RequestMethod.PUT,value="/updateuser")
	public void updateUser(@RequestBody UserEntity obj) {
		service.updateUser(obj);
	}
	
	//add multiple user
	@RequestMapping(method=RequestMethod.POST,value="/createuser/multiple")
	public void addMultipleUser(@RequestBody List<UserEntity> multipleUser) {
		service.addMultipleUser(multipleUser);
	}
	
	//fetch all user
	@RequestMapping(method=RequestMethod.GET, value ="/getuser")
	public List<UserEntity> getAllUser(){
		 return service.getAllUser();
	}
	
//	fetch user by id
	@RequestMapping(method=RequestMethod.GET,value="getuser/{id}")
	public Optional<UserEntity> getUserById(@PathVariable int id) {
		 return service.getUserById(id);
	}
	
	//count total user
	@RequestMapping(method = RequestMethod.GET,value="/countuser")
	public long countTotalUser() {
		return service.countTotalUser();
	}
	
	//get by name
	@RequestMapping(method = RequestMethod.GET,value="/getuser/name/{name}")
	public List<UserEntity> getByName(@PathVariable String name){
		return service.findByUserName(name);
	}
	
	//get by email
	@RequestMapping(method = RequestMethod.GET,value="/getuser/email/{email}")
	public List<UserEntity> getByEmail(String email){
	return	service.findByUserEmail(email);
	}
	
	
	
	
	
}
