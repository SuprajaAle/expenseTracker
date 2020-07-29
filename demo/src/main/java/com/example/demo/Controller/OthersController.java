package com.example.demo.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.dao.OthersRepo;
import com.example.demo.user.Others;

@Controller
@SessionAttributes("user")
public class OthersController {

	@InitBinder
	public void InitBinder(WebDataBinder binder) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

		binder.registerCustomEditor(Date.class, new CustomDateEditor(simpleDateFormat, false));

	}
	
	
//	Others others =new Others();
	@Autowired
	OthersRepo othersRepo;

	@GetMapping("/others")
	public String oString(ModelMap map) {
		map.put("others", new Others(1,1,"one","one",new Date()));
		

		return "addOthers";
	}

	@PostMapping("/getOther")
	public String saveed(@ModelAttribute("others") @Valid Others others,ModelMap map) {
		map.put("otherslist",othersRepo.findAll());
		
		othersRepo.save(others);
		return "newWelcome";
	}

}
