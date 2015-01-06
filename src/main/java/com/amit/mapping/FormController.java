package com.amit.mapping;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class FormController {
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/form.html", method = RequestMethod.GET)
	public ModelAndView home( ) {
	
		
		ModelAndView model =new ModelAndView("form");
		
		return model;
	}
	
	@RequestMapping(value = "/success.do", method = RequestMethod.POST)
	public ModelAndView submit(@ModelAttribute("studentobj") Student studentobj) {
		 ModelAndView model=new ModelAndView("success");
		model.addObject("studentobj", studentobj);
		return model;
	}
	

}