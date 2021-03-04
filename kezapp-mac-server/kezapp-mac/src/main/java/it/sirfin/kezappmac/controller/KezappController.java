/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.kezappmac.controller;

import it.sirfin.kezappmac.dto.InviaMessaggioDto;
import it.sirfin.kezappmac.dto.RegistrazioneDto;
import it.sirfin.kezappmac.dto.RichiediMessaggiDto;
import it.sirfin.kezappmac.dto.RichiediRegistrazioneDto;
import it.sirfin.kezappmac.service.KezappService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 39392
 */
@CrossOrigin("*")
@RestController
public class KezappController {

    @Autowired
    KezappService kezappService;

    @RequestMapping("/registrazione")
    @ResponseBody
    public RegistrazioneDto registrazione(@RequestBody RichiediRegistrazioneDto reqDto) {
        System.out.println(reqDto); //visualizza i dati che arrivano dal client
        RegistrazioneDto r = kezappService.registrazione(reqDto);
        System.out.println(r); 
        return r;
    }

    @RequestMapping("/invia-uno")
    public RegistrazioneDto invia(InviaMessaggioDto reqDto) {
        throw new UnsupportedOperationException();
    }

    @RequestMapping("/invia-tutti")
    public RegistrazioneDto inviaTutti(InviaMessaggioDto reqDto) {
        throw new UnsupportedOperationException();
    }

    @RequestMapping("/aggiorna")
    public RegistrazioneDto aggiorna(RichiediMessaggiDto reqDto) {
        throw new UnsupportedOperationException();
    }
}
