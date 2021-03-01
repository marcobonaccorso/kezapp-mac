/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.kezappmac.service.impl;

import it.sirfin.kezappmac.service.KezappService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.sirfin.kezappmac.repository.ChatRepository;

/**
 *
 * @author aleur
 */
@Service
public class KezappServiceImpl implements KezappService {

    @Autowired
    ChatRepository kezappRepository;

    @Override
    public void aggiorna() {
    }

    @Override
    public void invia() {
    }

    @Override
    public void Registrazione() {
    }

    @Override
    public void inviaTutti() {
    }

    
}
