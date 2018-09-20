package com.example.demo;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.Entities.IUser;
import com.example.demo.Entities.Personne;

@SpringBootApplication
public class PfaApplication {

	public static void main(String[] args) {
	ApplicationContext ctx=	SpringApplication.run(PfaApplication.class, args);
	IUser u=ctx.getBean(IUser.class);
	//u.save(new Personne("Abdellah","kk"));
Personne U=u.verifiacation("@jdj", "sjkl");


if(U!=null)
System.out.println(U);
else
	System.out.println("Not Found");

	


			
	}
}
