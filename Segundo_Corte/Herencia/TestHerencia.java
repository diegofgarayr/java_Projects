package test;

import herenci.*;

public class TestHerencia {

    public static void main(String[] args) {

        //Crear empleados 
        Empleado empleado1 = new Empleado("Alex", 3000);
        System.out.println(empleado1);
        Empleado empleado2 = new Empleado("Reol", 4000);
        System.out.println(empleado2);

        Empleado empleado3 = new Empleado("Juan", 5000);
        System.out.println(empleado3);

       
    }
}
