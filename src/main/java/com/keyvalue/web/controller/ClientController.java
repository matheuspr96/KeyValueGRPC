package com.keyvalue.web.controller;

import com.keyvalue.web.repository.DelRequest;
import com.keyvalue.web.repository.DelRequestVers;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

// import jdk.javadoc.internal.doclets.toolkit.resources.doclets;

// import jdk.nashorn.internal.runtime.Undefined;

@Controller
public class ClientController {

    ClientService clientService;

    // #region EVENTOS

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }

    @RequestMapping(value = "/keyValue", method = RequestMethod.GET)
    public String GetKeyValueDetails() {
        return "keyValueDetails";
    }

    @RequestMapping(value = "/keyValueNew", method = RequestMethod.GET)
    public String GetKeyValueForm() {
        return "keyValueForm";
    }

    @RequestMapping(value = "/keyValueDelete", method = RequestMethod.GET)
    public String GetKeyValueDelete() {
        return "keyValueDel";
    }

    @RequestMapping(value = "/keyValueDeleteVersion", method = RequestMethod.GET)
    public String GetKeyValueDeleteVer() {
        return "keyValueDelVer";
    }

    @RequestMapping(value = "/keyValueTestSet", method = RequestMethod.GET)
    public String GetKeyValueTestSet() {
        return "keyValueTestSet";
    }

    // #endregion

    // #region OPERAÇÕES

    @RequestMapping(value = "/client/{k}", method = RequestMethod.GET)
    public ModelAndView Get(@PathVariable("k") int k) {

        // clientService.get(k);
        System.out.println("GET METHOD : " + k);

        ModelAndView mv = new ModelAndView("keyValueDetails");
        mv.addObject("K_FIELD_NUMBER", 0);
        mv.addObject("TS_FIELD_NUMBER", 0);
        mv.addObject("D_FIELD_NUMBER", 0);
        return mv;
    }

    @RequestMapping(value = "/client", method = RequestMethod.POST)
    public String Set(@RequestParam("k") int k, @RequestParam("d") String d) {

        // clientService.set(k, 0, d);
        System.out.println("INSERT METHOD : " + k + " - " + d);
        return "redirect:/client/" + k;
    }

    @RequestMapping(value = "/client/delete", method = RequestMethod.DELETE)
    public String Del(@RequestParam("k") int k) {
        System.out.println("DELETE METHOD : " + k);
        // clientService.del(k);
        return "keyValueDel";
    }

    @RequestMapping(value = "/client/delete/version", method = RequestMethod.DELETE)
    public String DelVer(@RequestParam("k") int k, @RequestParam("vers") int vers) {

        //  clientService.delVers(setRequest.K_FIELD_NUMBER, setRequest.TS_FIELD_NUMBER,
        System.out.println("DELETE VER METHOD : " + k + " - " + vers);
        return "keyValueDelVer";
    }

    @RequestMapping(value = "/client/TestSet", method = RequestMethod.PUT)
    public String TestSet(@RequestParam("k") int k, @RequestParam("vers") String d) {

        //   clientService.testAndSet(k);
        System.out.println("TestSet METHOD : " + k + " - " + d);
        return "redirect:/client/" + k;
    }

    // #endregion

}
