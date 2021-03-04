/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.kezappmac.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author marco
 */
@Entity
public class Messaggio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    @Column
    private String testo;
    @Column
    private String aliasDestinatario;
    @Column
    private String aliasMittente;

    public Messaggio() {
    }

    public Messaggio(String testo, String aliasDestinatario, String aliasMittente) {

        this.testo = testo;
        this.aliasDestinatario = aliasDestinatario;
        this.aliasMittente = aliasMittente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    public String getAliasDestinatario() {
        return aliasDestinatario;
    }

    public void setAliasDestinatario(String aliasDestinatario) {
        this.aliasDestinatario = aliasDestinatario;
    }

    public String getAliasMittente() {
        return aliasMittente;
    }

    public void setAliasMittente(String aliasMittente) {
        this.aliasMittente = aliasMittente;
    }

    @Override
    public String toString() {
        return "Messaggio{" + "id=" + id + ", testo=" + testo + ", aliasDestinatario=" + aliasDestinatario + ", aliasMittente=" + aliasMittente + '}';
    }

}
