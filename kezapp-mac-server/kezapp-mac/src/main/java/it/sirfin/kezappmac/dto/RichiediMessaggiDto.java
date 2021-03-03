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
public class RichiediMessaggiDto {
    private String sessione;

    public String getSessione() {
        return sessione;
    }

    public void setSessione(String sessione) {
        this.sessione = sessione;
    }

    public RichiediMessaggiDto(String sessione) {
        this.sessione = sessione;
    }

    public RichiediMessaggiDto() {
    }

    @Override
    public String toString() {
        return "RichiediMessaggiDto{" + "sessione=" + sessione + '}';
    }
}
