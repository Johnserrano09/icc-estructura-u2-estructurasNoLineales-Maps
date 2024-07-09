import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runMapExample();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        runEjerccios();
    }

    private static void runEmpleadoExample() {
        EmpleadoContoller empCtrl= new EmpleadoContoller();
        empCtrl.addEmpleado(new Empleado(1, "Juan", "Developer"));
        empCtrl.addEmpleado(new Empleado(2, "Juan", "Cantante"));
        empCtrl.addEmpleado(new Empleado(3, "Miguel", "artista"));
        empCtrl.addEmpleado(new Empleado(4, "Miguel", "director"));

        empCtrl.imprimirEmpleados();
    }

    private static void runMapExample() {
        new Mapa();
        
    }

    private static void runEjerccios() {
        throw new UnsupportedOperationException("Not implemented yet");

    }
}
