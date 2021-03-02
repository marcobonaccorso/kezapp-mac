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
    private int id;
    private int idDestinatario;

    public InviaMessaggioDto() {
    }

    public InviaMessaggioDto(String messaggio, int id, int idDestinatario) {
        this.messaggio = messaggio;
        this.id = id;
        this.idDestinatario = idDestinatario;
    }

    public String getMessaggio() {
        return messaggio;
    }

    public void setMessaggio(String messaggio) {
        this.messaggio = messaggio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdDestinatario() {
        return idDestinatario;
    }

    public void setIdDestinatario(int idDestinatario) {
        this.idDestinatario = idDestinatario;
    }

    @Override
    public String toString() {
        return "InviaMessaggioDto{" + "messaggio=" + messaggio + ", id=" + id + ", idDestinatario=" + idDestinatario + '}';
    }

}
