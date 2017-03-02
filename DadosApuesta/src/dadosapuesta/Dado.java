/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dadosapuesta;

/**
 *
 * @author labing506
 */
public class Dado {
    
    int resultado;
    
    int lanzar(){
    
    resultado= (int) (Math.random()*6)+1;
    
    return resultado;
    
    }
    
}
