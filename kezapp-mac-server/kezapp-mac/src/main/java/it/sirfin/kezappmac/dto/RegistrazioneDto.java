/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.kezappmac.dto;

import it.sirfin.kezappmac.model.Chat;
import it.sirfin.kezappmac.model.Messaggio;
import java.util.List;

/**
 *
 * @author 39392
 */
public class RegistrazioneDto {
    private List<Chat> listaContatti;
    private List<Messaggio> listaMessaggi;
    private String sessione;

    public RegistrazioneDto() {
    }

    public List<Chat> getListaContatti() {
        return listaContatti;
    }

    public void setListaContatti(List<Chat> listaContatti) {
        this.listaContatti = listaContatti;
    }

    public List<Messaggio> getListaMessaggi() {
        return listaMessaggi;
    }

    public void setListaMessaggi(List<Messaggio> listaMessaggi) {
        this.listaMessaggi = listaMessaggi;
    }

    public String getSessione() {
        return sessione;
    }

    public void setSessione(String sessione) {
        this.sessione = sessione;
    }

    @Override
    public String toString() {
        return "RegistrazioneDto{" + "listaContatti=" + listaContatti + ", listaMessaggi=" + listaMessaggi + ", sessione=" + sessione + '}';
    }

    
    
}
