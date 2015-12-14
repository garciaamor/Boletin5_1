package boletin5_1;

import javax.swing.JOptionPane;

public class Boletin5_1 {

    public static void main(String[] args) {
     Clase5_1 coche1=new Clase5_1();
    
      
      JOptionPane.showMessageDialog(null, "La velocidad inicial es de: "+coche1.getVelocidade());
      coche1.Setacelerar(40);
      JOptionPane.showMessageDialog(null,"La velocidad en aceleración es de: "+coche1.getVelocidade());
      coche1.Setfrenar(10);
      JOptionPane.showMessageDialog(null,"La velocidad en frenada es de: "+coche1.getVelocidade());
    } 
    
}
    
    

