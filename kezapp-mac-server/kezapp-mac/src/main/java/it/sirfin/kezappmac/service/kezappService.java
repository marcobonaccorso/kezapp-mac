/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.kezappmac.service;

import it.sirfin.kezappmac.dto.InviaMessaggioDto;
import it.sirfin.kezappmac.dto.RegistrazioneDto;
import it.sirfin.kezappmac.dto.RichiediMessaggiDto;
import it.sirfin.kezappmac.dto.RichiediRegistrazioneDto;
import it.sirfin.kezappmac.model.Chat;
import it.sirfin.kezappmac.model.Messaggio;
import java.util.List;

/**
 *
 * @author aleur
 */
public interface KezappService {

    RegistrazioneDto registrazione(RichiediRegistrazioneDto reqDto);

    RegistrazioneDto inviaTutti(InviaMessaggioDto reqDto);

    RegistrazioneDto aggiorna(RichiediMessaggiDto reqDto);

    RegistrazioneDto invia(InviaMessaggioDto reqDto);

    List<Chat> recuperaTutteChat();

    List<Messaggio> recuperaTuttiMessaggi();

    RegistrazioneDto recuperaUno(InviaMessaggioDto reqDto);

}
