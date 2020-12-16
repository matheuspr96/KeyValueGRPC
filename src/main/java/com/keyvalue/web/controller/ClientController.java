package com.keyvalue.web.controller;

import com.keyvalue.web.model.*;
import com.keyvalue.web.model.Comunicacao.VTripla;
import com.keyvalue.web.services.ClientService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Objects;


// import jdk.javadoc.internal.doclets.toolkit.resources.doclets;

// import jdk.nashorn.internal.runtime.Undefined;

@Controller
public class ClientController {

    ClientService clientService;

    public ClientController() {
        String target = "localhost:8980";

        ManagedChannel channel = ManagedChannelBuilder.forTarget(target).usePlaintext().build();

        clientService = new ClientService(channel);
    }

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
    public ModelAndView GetKeyValueForm() {
        long timestamp = System.currentTimeMillis() / 1000;
        ModelAndView mv = new ModelAndView("keyValueForm");
        mv.addObject("TS", timestamp);
        return mv;
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
    public ModelAndView GetKeyValueTestSet() {
        long timestamp = System.currentTimeMillis() / 1000;
        ModelAndView mv = new ModelAndView("keyValueTestSet");
        mv.addObject("TS", timestamp);
        return mv;
    }

    // #endregion

    // #region OPERAÇÕES

    @RequestMapping(value = "/client/{k}", method = RequestMethod.GET)
    public ModelAndView Get(@PathVariable("k") String k) {
        // Declarations
        long version = 0;
        long timestamp = 0;
        String dados = null;
        int error = -1;

        // Calls
        System.out.println("GET METHOD : " + k);
        Comunicacao.Reply replyServer = clientService.get(k.getBytes());
        String replyError = replyServer.getError();

        // Return
        if (Objects.equals(replyError, "SUCCESS")) {
            VTripla reply = replyServer.getValue();
            version = reply.getVersion();
            timestamp = reply.getTimestamp();
            dados = new String(reply.getData().toStringUtf8());
        } else {
            // GetError
            error = 0;
        }

        // ViewModel
        ModelAndView mv = new ModelAndView("keyValueDetails");
        mv.addObject("ErrorNumber", error);
        mv.addObject("K_FIELD_NUMBER", version);
        mv.addObject("TS_FIELD_NUMBER", timestamp);
        mv.addObject("D_FIELD_NUMBER", dados);
        return mv;
    }

    @RequestMapping(value = "/client/insert", method = RequestMethod.POST)
    @ResponseBody
    public String Set(@RequestParam("k") String k, @RequestParam("ts") long ts, @RequestParam("d") String d) {

        System.out.println("INSERT METHOD : " + k + " - " + ts + " - " + d);
        // Declarations
        long version = 0;
        long timestamp = 0;
        String dados = null;
        int erro = -1;
        int success = -1;

        // Calls
        Comunicacao.Reply replyServer = clientService.set(k.getBytes(), ts, d.getBytes());
        String replyError = replyServer.getError();
        // Return
        if (Objects.equals(replyError, "SUCCESS")) {
            success = 0;
            return "SUCCESS";
        } else if (Objects.equals(replyError, "ERROR")) {
            VTripla reply = replyServer.getValue();
            version = reply.getVersion();
            timestamp = reply.getTimestamp();
            dados = new String(reply.getData().toStringUtf8());
            String message = "Chave já inserida!.<span style='text-align: left'> <br> Versão: " + version
                    + "<br>Timestamp: " + timestamp + "<br>Dados: " + dados + "</span>";
            return message;
        } else {
            return "Erro desconhecido";
        }
    }

    @RequestMapping(value = "/client/delete", method = RequestMethod.DELETE)
    @ResponseBody
    public String Del(@RequestParam("k") String k) {
        System.out.println("DELETE METHOD : " + k);

        // Declarations
        long version = 0;
        long timestamp = 0;
        String dados = null;

        // Calls
        Comunicacao.Reply replyServer = clientService.del(k.getBytes());
        String replyError = replyServer.getError();

        // Return
        if (Objects.equals(replyError, "SUCCESS")) {
            VTripla reply = replyServer.getValue();
            version = reply.getVersion();
            timestamp = reply.getTimestamp();
            dados = new String(reply.getData().toStringUtf8());
            return "Chave removida com sucesso!.<span style='text-align: left'> <br> Versão: " + version
                    + "<br>Timestamp: " + timestamp + "<br>Dados: " + dados + "</span>";
        } else {
            return "ERROR";
        }
    }

    @RequestMapping(value = "/client/delete/version", method = RequestMethod.DELETE)
    @ResponseBody
    public String DelVer(@RequestParam("k") String k, @RequestParam("vers") long vers) {

        System.out.println("DELETE VER METHOD : " + k + " - " + vers);

        // Declarations
        long version = 0;
        long timestamp = 0;
        String dados = null;

        // Calls
        Comunicacao.Reply replyServer = clientService.delVers(k.getBytes(), vers);
        String replyError = replyServer.getError();

        // Return
        String message = "";
        if (Objects.equals(replyError, "SUCCESS")) {
            VTripla reply = replyServer.getValue();
            version = reply.getVersion();
            timestamp = reply.getTimestamp();
            dados = new String(reply.getData().toStringUtf8());
            message = "SUCCESS|Chave vers removida com sucesso!.<span style='text-align: left'> <br> Versão: " + version
                    + "<br>Timestamp: " + timestamp + "<br>Dados: " + dados + "</span>";
        } else if (Objects.equals(replyError, "ERROR_NE")) {
            message = "ERROR|Não foi encontrado entrada com a chave e versão informada";
        } else if (Objects.equals(replyError, "ERROR_WV")) {
            message = "ERROR| Não foi encontrado entrada com a chave e versao informada, porém existe uma chave com outra versão"
                    + "<span style='text-align: left'> <br> Versão: " + version + "<br>Timestamp: " + timestamp
                    + "<br>Dados: " + dados + "</span>";
        }
        return message;
    }

    @RequestMapping(value = "/client/TestSet", method = RequestMethod.PUT)
    @ResponseBody
    public String TestSet(@RequestParam("k") String k, @RequestParam("vers") long v, @RequestParam("ts") long ts,
            @RequestParam("data") String data,  @RequestParam("versN") long versN) {

        // clientService.testAndSet(k);
        // System.out.println("TestSet METHOD : " + k + " - " + d);

        // Declarations
        long version = 0;
        long timestamp = 0;
        String dados = null;
        long timestampInput = System.currentTimeMillis() / 1000;
        // Calls

        Comunicacao.Reply replyServer = clientService.testAndSet(k.getBytes(), versN, ts, data.getBytes(), v);

        String replyError = replyServer.getError();
        String message = "";
        // Return

        if (Objects.equals(replyError, "SUCCESS")) {
            VTripla reply = replyServer.getValue();
            version = reply.getVersion();
            timestamp = reply.getTimestamp();
            dados = new String(reply.getData().toStringUtf8());
            message = "SUCCESS|Chave Atualizada com sucesso!<br> Dados da chave anterior.<span style='text-align: left'> <br> Versão: " + version
            + "<br>Timestamp: " + timestamp + "<br>Dados: " + dados + "</span>";
        }
        else if(Objects.equals(replyError, "ERROR_NE")){
            message = "ERROR|Não foi encontrado entrada com a chave informada";
        }
        else if(Objects.equals(replyError, "ERROR_WV")){
            VTripla reply = replyServer.getValue();
            version = reply.getVersion();
            timestamp = reply.getTimestamp();
            dados = new String(reply.getData().toStringUtf8());
            message = "ERROR|Chave encontrada, porém, não foi encontrada a versão informada!.<span style='text-align: left'> <br> Versão: " + version
            + "<br>Timestamp: " + timestamp + "<br>Dados: " + dados + "</span>";
        }
        return message;
    }

    // #endregion

}
