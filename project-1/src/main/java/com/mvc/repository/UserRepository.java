package com.mvc.repository;

import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mvc.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByUserName(String userName);

	@Query("select u.id as id, u.userName as userName, u.password as password, u.phoneNo as phoneNo from User u"
			+ " where u.userName=:userName and u.password=:password")
	Map<String, Object> findByUserNameByPassword(@Param("userName") String userName,
			@Param("password") String password);

	User findByPhoneNo(String phoneNo);

}
