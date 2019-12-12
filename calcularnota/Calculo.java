/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularnota;

import javax.swing.JOptionPane;

/**
 *
 * @author Jose
 */
public class Calculo {
 
    
    
    
    public void pedirDatos(){
    float c;
    float notaPrimerExamen =Float.parseFloat(JOptionPane.showInputDialog(null,"Nota primer examen"));
    comprobarNumero(notaPrimerExamen);
    float notaSegundoExamen =Float.parseFloat(JOptionPane.showInputDialog("Nota segundo examen"));
    float notaTercerExamen =Float.parseFloat(JOptionPane.showInputDialog("Nota Examen practico"));
    
    
    
    }
    
    public float comprobarNumero(float p_nota){
    
    while ((p_nota >10)||(0<p_nota)){
            
        float nota =Float.parseFloat(JOptionPane.showInputDialog("Nota primer examen"));
    
    }
             return p_nota;
    
    }
}
