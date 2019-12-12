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
            comprobarNumero(notaSegundoExamen);
        float notaTercerExamen =Float.parseFloat(JOptionPane.showInputDialog("Nota Examen practico"));
            comprobarNumero(notaTercerExamen);
            
        return (notaPrimerExamen+notaSegundoExamen)/2;
    
    }
    
    public float comprobarNumero(float p_nota){
    
    while ((p_nota >10)||(0<p_nota)){            
        float nota =Float.parseFloat(JOptionPane.showInputDialog("Nota incorrecta,intenta de nuevo"));    
    }
             return p_nota;    
    }
    
    public float boletinesEntregados(){
    
     int Boletines =Integer.parseInt(JOptionPane.showInputDialog(null,"Nota primer examen"));
     while (Boletines<0||Boletines>18){
            JOptionPane.showMessageDialog(null, "Dato erroneo intentelo de nuevo");
            Boletines=Integer.parseInt(JOptionPane.showInputDialog(null,"Valor incorrecto, intenta de nuevo"));
        }
            if ((Boletines*100/19)>=90) {
                
                return 2;
            }
            else if ((Boletines*100/19)>=70&&(Boletines*100/19)<90){
                return 1;
            }
            else
                return 0;          
    }
}
