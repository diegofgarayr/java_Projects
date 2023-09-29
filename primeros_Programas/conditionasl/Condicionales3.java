
package condicionales3;


public class Condicionales3 {

   
    public static void main(String[] args) {
            int marks=65;  

        if(marks<50){  
            System.out.println("Perdio");  
        }  
        else if(marks>=50 && marks<60){  
            System.out.println("D nota");  
        }  
        else if(marks>=60 && marks<70){  
            System.out.println("C nota");  
        }  
        else if(marks>=70 && marks<80){  
            System.out.println("B nota");  
        }  
        else if(marks>=80 && marks<90){  
            System.out.println("A nota");  
        }else if(marks>=90 && marks<100){  
            System.out.println("A+ nota");  
        }else{  
            System.out.println("no esta registrado!");  
    }   
    }
    
}
