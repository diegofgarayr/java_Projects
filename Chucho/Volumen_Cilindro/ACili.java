package acilindro;


import java.util.Scanner;


public class ACili {
    private double r; 
    private double h;
    public ACili(){
    }
    
    public void setR(double r){
        this.r=r;
    }
     public void setH(double h){
        this.h=h;
    }
    public double getR(){
        return this.r;
    }
    public double getH(){
        return this.h;
    }
    public double pedirdato(String x){
     System.out.println("Digite un valor"+x); 
    Scanner s= new Scanner(System.in);
     return s.nextDouble();
        }
    public double calcularVolumen(){
        r=pedirdato("para el radio");
        h=pedirdato("para la altura");
        return Math.PI*Math.pow(r,2)*h;
        
    }
 
    
    public void Mostrar (double v, String z){
        System.out.println(z+v);
    }
}
        
    
    

