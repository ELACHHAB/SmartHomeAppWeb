package com.example.demo.Entities;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IUser extends JpaRepository<Personne, Integer> ,JpaSpecificationExecutor{
	@Query("from Personne where email= :email and password= :password ")
	public Personne verifiacation(@Param("email") String us,@Param("password") String ps );

}
