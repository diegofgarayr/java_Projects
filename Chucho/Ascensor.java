
import java.util.Random;
import java.util.Scanner;

public final class Ascensor {
    public int pisoActual;
    public int pisoAscensor;
    public final int totalPisos = 7; 
    public final Random random = new Random();
    
    public Ascensor() {
        this.pisoAscensor = pisoAscensor(); 
        this.pisoActual = this.pisoAscensor;
    }

    public int pisoAscensor() {
        return random.nextInt(totalPisos) + 1; 
    }

    public int pisoActual() {
        return this.pisoActual;
    }

    public String estadoDeAscensor(int pisoUsuario) {
        
   
        if (this.pisoAscensor < pisoUsuario) {
            while (this.pisoAscensor < pisoUsuario) {
                this.pisoAscensor++;
                System.out.println("El ascensor está subiendo. Piso " + this.pisoAscensor);
                
            } 
           return "El ascensor ha llegado al piso del usuario.";
        } else if (this.pisoAscensor > pisoUsuario) {
            while (this.pisoAscensor > pisoUsuario) {
               this.pisoAscensor--;
                System.out.println("El ascensor está bajando. Piso " + this.pisoAscensor);
            }
            return "El ascensor ha llegado al piso del usuario.";
        } else {
            return "El ascensor está en el mismo piso que el usuario.";
        }
    }
}

    

