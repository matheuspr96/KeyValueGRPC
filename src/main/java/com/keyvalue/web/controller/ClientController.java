package com.keyvalue.web.controller;

import com.keyvalue.web.repository.Reply;
import com.keyvalue.web.repository.SetRequest;
import com.keyvalue.web.services.ClientService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ClientController {

    ClientService clientService;
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(){
        ModelAndView mv  = new ModelAndView("index");
        return mv;
    }


    @RequestMapping(value = "/client/{k}", method = RequestMethod.GET)
    public ModelAndView Get(@PathVariable("k") int k)
    {
        ModelAndView mv = new ModelAndView("keyvalueDetails");  

        // clientService.get(k);
        String message = "Consultar log de saída" + k;
        mv.addObject("message", message);
        System.out.println("--------------------------------------------->" + message);
        return mv;
    }

    @RequestMapping(value = "/keyValueNew", method = RequestMethod.GET)
    public String GetKeyValueForm(){
        return "keyValueForm";
    }

    @RequestMapping(value = "/keyValueNew", method = RequestMethod.POST)
    public String Set(SetRequest setRequest){

        //  clientService.set(setRequest.K_FIELD_NUMBER, setRequest.TS_FIELD_NUMBER, setRequest.D_FIELD_NUMBER);
         return "redirect:/keyValueNew";
    }

    @RequestMapping(value = "/keyValueDelete", method = RequestMethod.GET)
    public String GetKeyValueDelete(){
        return "keyValueDel";
    }

}
