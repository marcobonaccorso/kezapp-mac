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
import org.springframework.web.bind.annotation.RequestMapping;
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
    public RegistrazioneDto Registrazione(RichiediRegistrazioneDto reqDto) {
        return Registrazione(reqDto);
    }

    @RequestMapping("/invia-uno")
    public RegistrazioneDto invia(InviaMessaggioDto reqDto) {
        return invia(reqDto);
    }

     @RequestMapping("/invia-tutti")
    public RegistrazioneDto inviaTutti(InviaMessaggioDto reqDto) {
        return inviaTutti(reqDto);
    }
    
     @RequestMapping("/aggiorna")
    public RegistrazioneDto aggiorna(RichiediMessaggiDto reqDto) {
        return aggiorna(reqDto);
    }
}
