/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sets;

import java.util.Comparator;

/**
 *
 * @author Asus-Pc
 */

//Esta clase me brinda una serie de metodos que me permiten realizar comparaciones
//Se vconoce como una funcion objeto

class CaseInsensitiveCompare implements Comparator<String>{
    public int compare(String lhs, String rhs){
        return lhs.compareToIgnoreCase(rhs);
    }
}
