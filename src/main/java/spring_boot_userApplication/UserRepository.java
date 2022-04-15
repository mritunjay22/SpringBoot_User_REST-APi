package spring_boot_userApplication;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <UserEntity,Integer>{
	//For CRUD Operations
    //Generic type
	public List<UserEntity> findByuserName(String userName);
	public List<UserEntity> findByuserEmail(String userEmail);
}
