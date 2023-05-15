package in.suraj.repo;


import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.suraj.entity.UserDtlsEntity;

public interface UserDtlsRepo extends JpaRepository<UserDtlsEntity, Serializable> {
	
	public UserDtlsEntity findByEmail(String email);
	
}
