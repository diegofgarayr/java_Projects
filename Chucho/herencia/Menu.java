
import java.util.Scanner;


public class Menu {
   VEsfera objVEs;

   public Menu(){
       objVEs=new VEsfera();
   }
   public void menu(){
       Scanner s=new Scanner(System.in);
            System.out.println("1. Area circulo");
            System.out.println("2. Volumen Esfera");
            System.out.println("Cualquier numero salir");
            int opcion=s.nextInt();
            if(opcion==1){
                objVEs.Mostrar(objVEs.calculaArea(),"el area del circulo es");
            }else{
                if(opcion==2){
                    objVEs.Mostrar(objVEs.cvesf(),"El volumen de la esfera es ");
            
                }else{
                    System.out.println("gracias por usar el programa");
                }
            }
   }
}
