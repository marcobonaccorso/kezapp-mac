/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.kezappmac.repository;

import it.sirfin.kezappmac.model.Chat;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author aleur
 */
public interface ChatRepository extends JpaRepository<Chat,Long>{

   
    
}
