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
import it.sirfin.kezappmac.model.Messaggio;
import it.sirfin.kezappmac.service.KezappService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.sirfin.kezappmac.repository.ChatRepository;
import it.sirfin.kezappmac.repository.MessaggioRepository;
import java.util.List;

/**
 *
 * @author aleur
 */
@Service
public class KezappServiceImpl implements KezappService {

    @Autowired
    ChatRepository chatRepository;
    @Autowired
    MessaggioRepository messaggioRepository;

    @Override
    public RegistrazioneDto registrazione(RichiediRegistrazioneDto reqDto) {
        //creare una chat con i dati ricevuti dal controller
        Chat c1 = new Chat(reqDto.getNickname());
        //salvarla su db e recuperarne il valore con l'id aggiornato
        c1 = chatRepository.save(c1);
        //convertire l'id in stringa e metterlo nella sessione
        String s2 = c1.getId().toString();
        c1.setSessione(s2);
        //aggiornare sul db la chat
        c1 = chatRepository.save(c1);
        //ritornare il dto richiesto dal controller
        //RegistrazioneDto reg = new RegistrazioneDto();
        // impostare nel dto la lista contatti,messaggi e sessione
       return new RegistrazioneDto(recuperaTutteChat(), recuperaTuttiMessaggi(c1.getNickname()), c1.getSessione());
    }

    @Override
    public RegistrazioneDto inviaTutti(InviaMessaggioDto reqDto) {
        //con la sessione del dto cerco la chat corrispondente
        Chat k = chatRepository.findBySessione(reqDto.getSessione());
        //se non la trovo, ritorno un dto vuoto
        if (k.getNickname() == null || k.getNickname().isEmpty()) {
            return new RegistrazioneDto();
        }
        //creo un messaggio che contiene il testo, il destinatario a null e l'alias mittente preso dalla chat
        Messaggio m = new Messaggio(reqDto.getMessaggio(), null, k.getNickname());
        //salvo il messaggio sul db
        messaggioRepository.save(m);
        //calcolo il nuovo registrazionedto da ritornare e lo ritorno
        return new RegistrazioneDto(recuperaTutteChat(), recuperaTuttiMessaggi(k.getNickname()), reqDto.getSessione());
    }

    @Override
    public RegistrazioneDto aggiorna(RichiediMessaggiDto reqDto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RegistrazioneDto invia(InviaMessaggioDto reqDto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Chat> recuperaTutteChat() {
        return chatRepository.findAll();
    }

    @Override
    public RegistrazioneDto recuperaUno(InviaMessaggioDto reqDto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Messaggio> recuperaTuttiMessaggi(String s) {
        List<Messaggio> pubbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbblici = messaggioRepository.findbyAliasDestinatarioIsNull();
        List<Messaggio> privati = messaggioRepository.findbyAliasDestinatario(s);
        privati.addAll(pubbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbblici);
        return privati;
    }

}
