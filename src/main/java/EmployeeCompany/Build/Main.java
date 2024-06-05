package EmployeeCompany.Build;

import EmployeeCompany.Domain.Empleado;
import EmployeeCompany.Domain.Empresa;

public class Main {
    public static void main(String[] args) {
        Empresa empresa1 = new Empresa("Pepito S.L", "B4324324", "971546254", "Solitario St/6");

        Empleado empleado1 = new Empleado("Jack", "546254123S", 1700.00);
        Empleado empleado2 = new Empleado("Michellle", "564213879Q", 2900);
       /* Empleado empleado3 = new Empleado("Lorraine", "876434665B", 3350.5, (byte) 41, "681546254", "Street 1");
        Empleado empleado4 = new Empleado("Fede", "83544324665X", 7350.5, (byte) 31, "641246254", "Street 2");
        Empleado empleado5 = new Empleado("Pere", "1232165C", 5150.5, (byte) 42, "6512354", "Street 3");
        Empleado empleado6 = new Empleado("Michael", "62343265M", 10050.5, (byte) 61, "7154234", "Street 4");*/

        Object[][] employees = {
                {"Lorraine", "876434665B", 3350.5, (byte) 41, "681546254", "Street 1"},
                {"Fede", "83544324665X", 7350.5, (byte) 31, "641246254", "Street 2"},
                {"Pere", "1232165C", 5150.5, (byte) 42, "6512354", "Street 3"},
                {"Michael", "62343265M", 10050.5, (byte) 61, "7154234", "Street 4"}
        };

        empresa1.añadirEmpleado(empleado1);
        empresa1.añadirEmpleado(empleado2);

        for (Object[] empleado : employees) {
            String nombre = (String) empleado[0];
            String DNI = (String) empleado[1];
            double salario = (double) empleado[2];
            byte edad = (byte) empleado[3];
            String telefono = (String) empleado[4];
            String direccion = (String) empleado[5];

            Empleado empleadoL = new Empleado(nombre, DNI, salario, edad, telefono, direccion);
            empresa1.añadirEmpleado(empleadoL);
        }

        empresa1.eliminarEmpleado(empleado1);
        empresa1.eliminarEmpleado(empleado2);

        System.out.println();

        for (int i = 0; i < empresa1.tamañoEmpresa(); i ++) {
            System.out.println(empresa1.getEmpleados().get(i).toString());
        }

        System.out.println();
        System.out.println("Forma alternativa:");
        System.out.println(empresa1.toString());
    }
}
