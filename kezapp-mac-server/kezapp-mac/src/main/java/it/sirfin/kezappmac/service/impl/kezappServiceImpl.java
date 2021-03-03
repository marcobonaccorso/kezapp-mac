/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.kezappmac.service.impl;

import it.sirfin.kezappmac.dto.InviaMessaggioDto;
import it.sirfin.kezappmac.dto.RegistrazioneDto;
import it.sirfin.kezappmac.dto.RichiediMessaggiDto;
import it.sirfin.kezappmac.dto.RichiediRegistrazioneDto;
import it.sirfin.kezappmac.model.Chat;
import it.sirfin.kezappmac.service.KezappService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.sirfin.kezappmac.repository.ChatRepository;
import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

/**
 *
 * @author aleur
 */
@Service
public class KezappServiceImpl implements KezappService {

    @Autowired
    ChatRepository kezappRepository;
    //creare una chat con i dati ricevuti dal controller
    //salvarla su db e recuperarne il valore con l'id aggiornato
    //convertire l id in stringa e metterlo nella sessione
    //aggiornare sul db la chat
    //ritornare il dto richiesto dal controller

    @Override
    public RegistrazioneDto registrazione(RichiediRegistrazioneDto reqDto) {
        Chat c1 = new Chat(1l, "giorgio", "sessioneUno");
        RegistrazioneDto.save();
        String s2 = id.toString();
        c1.save();
        return registrazione(reqDto);
    }

    @Override
    public RegistrazioneDto inviaTutti(InviaMessaggioDto reqDto) {

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RegistrazioneDto aggiorna(RichiediMessaggiDto reqDto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RegistrazioneDto invia(InviaMessaggioDto reqDto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
