    package ctruser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
/**
 *
 * @author iam-f
 */
public class security {
    
    frmcontrol login = new frmcontrol();
    String res;
    
    public void validarUsuario (String usuarios [], String User, String Password, int intentos ){
        boolean encontrado = false;
        
        for(int i = 0; i < usuarios.length; i++)
        {
            if((usuarios[i].equalsIgnoreCase(User) && usuarios[i+1].equals(Password))){
              res="Bienvenido "  + User;
              encontrado = true;
              JOptionPane.showMessageDialog(null, res, "Inicio de Sesión", JOptionPane.INFORMATION_MESSAGE);
              intentos=0;
              login.setIntentos(intentos);
              new frmPrincipal().setVisible(true);
              
              
              break;
            }
                
        } //fin del for
            
    if (encontrado==false){
                
                res = "clave y/o usuario erroneos va " + intentos + " intento fallido";
                 JOptionPane.showMessageDialog(null, res, "Inicio de Sesión", JOptionPane.ERROR_MESSAGE);
                                      
                        
            }
            if (intentos > 2 ){
                JOptionPane.showMessageDialog(null, "3 intentos erroneos, se bloquea", "Inicio de Sesión", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            
            }
    }
        
}