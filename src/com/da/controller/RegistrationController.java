package com.da.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.da.beans.AppointmentBean;
import com.da.beans.LoginBean;
import com.da.beans.PatientBean;
import com.da.service.BookAppointmentService;
import com.da.service.LoginService;
import com.da.service.LoginServiceImplementation;
import com.da.service.RegistrationService;
import com.da.service.RegistrationServiceImplementation;
import com.da.service.ViewPatientService;

@Controller
public class RegistrationController {
		@Autowired
	    private RegistrationService regService;
		@Autowired
		private LoginService loginService;
	    @Autowired
		private BookAppointmentService bookAppointmentService;
	    @Autowired
		private ViewPatientService viewPatientService;
		
		
		
		@RequestMapping(value="/appointment.controller", method = RequestMethod.POST)
	    public ModelAndView bookAppointment(ModelMap model,@ModelAttribute("cmdPatient") AppointmentBean appointment) 
	    {
	    	System.out.println("In Controller.....Before");
	    	
	    	String output=bookAppointmentService.bookAppointment(appointment);
	    	String result="Your Coupon is: "+output;
	    	model.addAttribute("output",output);
	        System.out.println("In Controller.....After");
	        if(output==null){
	        	 return new ModelAndView("couponNotGenerated");
	        }
	        else{
	        	return new ModelAndView("couponSuccess");
	        }
	        
	    }
		@RequestMapping(value="/patient.controller", method = RequestMethod.POST)
	    public ModelAndView insert(@ModelAttribute("cmdCus") PatientBean pat) 
	    {
	    	System.out.println("In Controller.....Before");
	    	
	        regService.insertPatient(pat);
	        
	        System.out.println("In Controller.....After");
	        
	        return new ModelAndView("patientOutput");
	    }
		@RequestMapping(value="/login.controller", method = RequestMethod.POST)
		public ModelAndView validate(@ModelAttribute("cmdCus") LoginBean login) 
		{
			System.out.println("In Controller.....Before");
			
			String id=loginService.validateCustomer(login);
			System.out.println("In Controller.....After");
			if(id.equals("RECEPTIONIST")){
				return new ModelAndView("receptionist");
			}
			else if(id.equals("DOCTOR_3")){
				return new ModelAndView("doctor3");
			}
			else if(id.equals("DOCTOR_2")){
				return new ModelAndView("doctor2");
			}
			else if(id.equals("DOCTOR_1")){
				return new ModelAndView("doctor1");
			}
			else {
				return new ModelAndView("invalidPage");
			}
			
		}

	    //if you want to print any Collection use this annotation
	    /*@ModelAttribute("myList")
	    private List getEmployees() {
	        List l = new ArrayList();
	        l.add("abc");
	        l.add("xyz");
	        return l;
	    }*/
	    public void setRegistrationService(RegistrationServiceImplementation regService) {
	        System.out.println("Setting EmpService to controller....");
	        this.regService =(RegistrationService)regService;
	    }
	    public void setLoginService(LoginServiceImplementation loginService) {
	        System.out.println("Setting EmpService to controller....");
	        this.loginService =(LoginService)loginService;
	    }
	    public void setBookappointmentservice(
				BookAppointmentService bookAppointmentService) {
	    	 System.out.println("Setting EmpService to controller....");
			this.bookAppointmentService =(BookAppointmentService)bookAppointmentService;
		}
	    public void setViewPatientService(ViewPatientService viewPatientService) {
			this.viewPatientService =(ViewPatientService)viewPatientService;
		}
	    @RequestMapping(value="/loginpage",method=RequestMethod.GET)
		public String loginPage(ModelMap model){
			
			return "Login";
		}
	    @RequestMapping(value="/page",method=RequestMethod.GET)
		public String  goToPatientDetails(ModelMap model){
				return "patientDetails";
		}
	    
   @RequestMapping(value="/ViewPatientDetails.controller", method=RequestMethod.POST)
		
		public ModelAndView viewEmployee(ModelMap model,@ModelAttribute("cmdView") AppointmentBean appointment){
			System.out.println("c");
			List list=viewPatientService.viewPatientDetails(appointment);
			model.addAttribute("list",list);
			System.out.println("ds");
			return new ModelAndView("viewPatient");
}
   
   @RequestMapping(value="/postpone.controller", method = RequestMethod.POST)
   public ModelAndView postponeAppointment(ModelMap model,@ModelAttribute("cmdPatient") AppointmentBean appointment) 
   {
   	System.out.println("In Controller.....Before");
   	
   	String output=bookAppointmentService.postponeAppointment(appointment);
   	String result="Your Coupon is: "+output;
   	model.addAttribute("output",output);
       System.out.println("In Controller.....After");
       if(output==null){
       	 return new ModelAndView("couponNotGenerated");
       }
       else{
       	return new ModelAndView("couponSuccess");
       }
       
   }
   
	}


