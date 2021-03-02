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
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RichiediMessaggiDto() {
    }

    public RichiediMessaggiDto(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "RichiediMessaggiDto{" + "id=" + id + '}';
    }

   
    
}
