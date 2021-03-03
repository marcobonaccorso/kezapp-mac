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

    public static void save() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private List<Chat> listaContatti;
    private List<Messaggio> listaMessaggi;
    private int id;

    public RegistrazioneDto() {
    }

    public RegistrazioneDto(List<Chat> listaContatti, List<Messaggio> listaMessaggi, int id) {
        this.listaContatti = listaContatti;
        this.listaMessaggi = listaMessaggi;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "RegistrazioneDto{" + "listaContatti=" + listaContatti + ", listaMessaggi=" + listaMessaggi + ", id=" + id + '}';
    }

    
}
