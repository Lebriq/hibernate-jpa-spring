package com.dev.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dev.beans.User;
import com.dev.factories.MainFact;


@Controller
public class Start {

	@RequestMapping(value="acceuil" , method = RequestMethod.GET)
	public String lancerPageAcceuil(final ModelMap pModel){
		if(pModel.get("user") == null){
			pModel.addAttribute("user",new User());
		}
		return "acceuil";
	}
	
	@RequestMapping(value="results" , method = RequestMethod.POST)
	public String afficherLesresultats(@ModelAttribute("inscriptionForm") @Validated User user , BindingResult result , ModelMap pModel ){
		
		if(result.hasErrors()){
			return lancerPageAcceuil(pModel);
		}else{
			MainFact mainFact= new MainFact();
			String resultat =  mainFact.inscrirUtilisateur(user);
			pModel.addAttribute("resultat",resultat);
			return "results";	
		}
		
	}
}
