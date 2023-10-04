
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class Main {
    
    public static void main(String[] args) {
        Ascensor ascensor = new Ascensor();
        Scanner scanner = new Scanner(System.in);
        Usuario usuario = new Usuario();

        System.out.println("El ascensor está en el piso " + ascensor.pisoActual());

        while (true) {
            System.out.print("Ingrese en qué piso se encuentra el usuario (1-" + ascensor.totalPisos + "): ");
            int pisoUsuario = scanner.nextInt();
  
            System.out.println(ascensor.estadoDeAscensor(pisoUsuario));
            

            System.out.print("Ingrese 's' para salir: ");
            String input = scanner.next();

            if (input.equals("s")) {
                System.out.println("Saliendo del ascensor. ¡Adiós!");
                break;
            }
        }

        scanner.close();
    }
    }
    

