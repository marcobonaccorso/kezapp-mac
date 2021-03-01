/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.kezappmac.model;

/**
 *
 * @author marco
 */
public class Chat {
    
    private Long id;
    private String nickname;
    private String sessione;

    public Chat() {
    }

    public Chat(Long id, String nickname, String sessione) {
        this.id = id;
        this.nickname = nickname;
        this.sessione = sessione;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSessione() {
        return sessione;
    }

    public void setSessione(String sessione) {
        this.sessione = sessione;
    }

    @Override
    public String toString() {
        return "Chat{" + "id=" + id + ", nickname=" + nickname + ", sessione=" + sessione + '}';
    }
    
    
    
}
