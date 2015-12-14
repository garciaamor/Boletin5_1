package boletin5_1;

public class Clase5_1 {
 
    private int velocidade;
  
    
    public Clase5_1(){
        velocidade = 0;
    
    }
    
    
     public int getVelocidade(){
        return velocidade;  
    } 
    public void Setacelerar (int valor){
        velocidade=velocidade+valor;
    }

    public void Setfrenar (int menos){
        velocidade=velocidade-menos;
        
    }
}
