package acilindro;
import java.util.Scanner;


public class Menu {
   VCilin objVEs;

   public Menu(){
       objVEs=new VCilin();
   }
   public void menu(){
       Scanner s=new Scanner(System.in);
            System.out.println("1. Area cilindro");
            System.out.println("2. Volumen cilindro");
            System.out.println("Cualquier numero salir");
            int opcion=s.nextInt();
            if(opcion==1){
                objVEs.Mostrar(objVEs.cvcil(),"el area del cilindro es");
            }else{
                if(opcion==2){
                    objVEs.Mostrar(objVEs.calcularVolumen(),"El volumen del cilindro es ");
            
                }else{
                    System.out.println("gracias por usar el programa");
                }
            }
   }
}
