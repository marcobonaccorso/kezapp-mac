/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.kezappmac.repository;

import it.sirfin.kezappmac.model.Messaggio;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author marco
 */
public interface MessaggioRepository extends JpaRepository<Messaggio, Long> {

    //query per trovare i messaggi inviati a tutti
    List<Messaggio> findbyAliasDestinatarioIsNull();

    List<Messaggio> findbyAliasDestinatario(String s);

}
