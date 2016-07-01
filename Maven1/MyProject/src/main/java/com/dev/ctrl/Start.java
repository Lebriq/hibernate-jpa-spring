package com.dev.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class Start {

	
	@RequestMapping(value="/AfficherAccueil", method = RequestMethod.GET)
	public String lancerPageAcceuil(final ModelMap pModel){
 		return "acceuil";
	}
}
