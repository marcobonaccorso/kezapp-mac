/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.kezappmac.dto;

/**
 *
 * @author 39392
 */
public class InviaMessaggioDto {

    private String messaggio;
    private int idDestinatario;
    private String sessione;

    public InviaMessaggioDto(String messaggio, int idDestinatario, String sessione) {
        this.messaggio = messaggio;
        this.idDestinatario = idDestinatario;
        this.sessione = sessione;
    }

    public InviaMessaggioDto() {
    }

    public String getMessaggio() {
        return messaggio;
    }

    public int getIdDestinatario() {
        return idDestinatario;
    }

    public String getSessione() {
        return sessione;
    }

    public void setMessaggio(String messaggio) {
        this.messaggio = messaggio;
    }

    public void setIdDestinatario(int idDestinatario) {
        this.idDestinatario = idDestinatario;
    }

    public void setSessione(String sessione) {
        this.sessione = sessione;
    }

    @Override
    public String toString() {
        return "InviaMessaggioDto{" + "messaggio=" + messaggio + ", idDestinatario=" + idDestinatario + ", sessione=" + sessione + '}';
    }
    
    

}
