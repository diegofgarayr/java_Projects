
import java.util.Scanner;


public class ACirculo {
    private double r; 
    public ACirculo(){
    }
    
    public void setR(double r){
        this.r=r;
    }
    public double getR(){
        return this.r;
    }
    public double pedirdato(String x){
     System.out.println("Digite un valor"+x); 
    Scanner s= new Scanner(System.in);
     return s.nextDouble();
        }
    public double calculaArea(){
        r=pedirdato("para el radio");
        return Math.PI*Math.pow(r,2);
    }
    public void Mostrar (double v, String z){
        System.out.println(z+v);
    }
}
        
    
    

