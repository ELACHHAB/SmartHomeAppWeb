package com.example.demo.control;

import java.io.IOException;
import java.util.List;

import javax.print.attribute.standard.PagesPerMinute;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Entities.IMetier;
import com.example.demo.Entities.IUser;
import com.example.demo.Entities.Personne;
import com.example.demo.Entities.test;

@Controller
public class UserControl{
@Autowired
private IUser iuser;
@Autowired
private IMetier u;
@RequestMapping(value="/affiche")
public String affiche(Model model,@RequestParam (name="page",defaultValue="0")int p,@RequestParam (name="size",defaultValue="5")int s) {
	Page<test> d=u.findAll(new PageRequest(p, s));
	model.addAttribute("list",d.getContent());
	int []pages=new int[d.getTotalPages()];
	model.addAttribute("pages", pages);
	return "affiche";
}
@RequestMapping(value="/delete",method=RequestMethod.GET)
public String delete(Long id) {
	u.deleteById(id);
	return "redirect:/affiche";
	
}
@RequestMapping(value="/index")
public String User() {
	return "Authentification";
}
@RequestMapping(value="/compte")
public String compte() {
	return "Compte";
}
@RequestMapping(value = "/ajout", method = RequestMethod.POST)
public String ajout(@RequestParam("Username") String username,@RequestParam("type") String type,@RequestParam("password") String password,@RequestParam("email") String email ,@RequestParam("telephone") String tel,@RequestParam("CIN") String CIN) {
Personne post=new Personne(username, email, tel, CIN, password, type);
	  iuser.save(post);
	  
	return "Compte";
	  
}

@RequestMapping(value="/User")
public String Ys() {
	return "User";
}
@RequestMapping(value="/index1")
public String Index() {
	return "index";
}
@RequestMapping(value="/index",method= RequestMethod.POST)
public String VerifyLogin(@RequestParam String email,@RequestParam String password,HttpSession session) {
Personne us=iuser.verifiacation(email, password);

	if(us!=null) {
		session.setAttribute("type", us.getType());
		return "redirect:/index1";
	}
	else
		{
	session.setAttribute("type",null);
		return "Authentification";}
	
}



}

