package com.marketing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
//import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

//import com.marketing.dto.LeadData;
import com.marketing.entities.Lead;
import com.marketing.services.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;
	
	@RequestMapping("/viewCreateLeadPage")
	public  String viewCreateLeadPage() {
		return "create_lead";
	}
	
	@RequestMapping("/saveLead")
	public String saveOneLead(@ModelAttribute("lead")Lead lead, ModelMap model) {
		leadService.saveLead(lead);
		model.addAttribute("msg","Lead is saved!");
	return "create_lead";
	}
	
	@RequestMapping("listall")
	public String getAllLeads(ModelMap model) {
		List<Lead> leads=leadService.getLeads();
      model.addAttribute("leads", leads);
		return "lead_search_result";
	}
	

	
//@RequestMapping("/saveLead")
//public String saveOneLead(@RequestParam("firstName") String firstName,@RequestParam("lastName") String lastName, @RequestParam("email") String email, @RequestParam("mobile") String mobile) {
//	Lead l=new Lead();
//	l.setFirstName(firstName);
//	l.setLastName(lastName);
//	l.setEmail(email);
//	l.setMobile(mobile); 
//	
//	leadService.saveLead(l);
//	return "create_lead";
//}
//	@RequestMapping("/saveLead")
//	public String saveOneLead(LeadData data , ModelMap model) {
//	  Lead l =new Lead();
//	  l.setFirstName(data.getFirstName());
//	  l.setLastName(data.getLastName());
//	  l.setEmail(data.getEmail());
//	  l.setMobile(data.getMobile());
//	   model.addAttribute("msg" , "Lead is Saved!!");
//	  leadService.saveLead(l);
//	    return "create_lead";
//		
//	}
}
