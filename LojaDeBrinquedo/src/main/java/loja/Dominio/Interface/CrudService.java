/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package loja.Dominio.Interface;

import java.util.List;

/**
 *
 * @author Gustavo Nascimento
 */
public interface CrudService<T> {

    List<T> findAll(T entity);

    T save(T entity);

    void delete(int id);

    T findId(int id);

    boolean update(T entity);
    
    boolean finishValidity(T entity);

}
