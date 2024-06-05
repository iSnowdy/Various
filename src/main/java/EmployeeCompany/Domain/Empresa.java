package EmployeeCompany.Domain;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private final String nombre;
    private final String CIF;
    private String telefono;
    private String direccion;

    private final List<Empleado> empleados;

    public Empresa(String nombre, String CIF, String telefono, String direccion) {
        this.nombre = nombre;
        this.CIF = CIF;
        this.telefono = telefono;
        this.direccion = direccion;
        this.empleados = new ArrayList<Empleado>();
    }

    public void añadirEmpleado(Empleado empleado) {
        this.empleados.add(empleado);
        System.out.println("Empleado añadido correctamente");
    }

    public void eliminarEmpleado(Empleado empleado) {
        this.empleados.remove(empleado);
        System.out.println("Empleado eliminado correctamente");
    }

    public int tamañoEmpresa() {
        return this.empleados.size();
    }

    public double calcularSueldoBrutoTotal() {
        double totalSalarioBruto = 0.0;

        for (Empleado empleado : this.empleados) {
            totalSalarioBruto += empleado.getSalario();
        }
        return totalSalarioBruto;
    }

    public double calcularSueldoNetoTotal() {
        double totalSalarioNeto = 0.0;

        for(Empleado empleado : this.empleados) {
            totalSalarioNeto += empleado.calcularSueldoNeto(empleado.getSalario());
        }
        return totalSalarioNeto;
    }

    public void imprimirLimitado() {
        for (Empleado empleado : this.empleados) {
            System.out.println("Nombre del empleado: " + empleado.getNombre());
            System.out.println("DNI del empleado: " + empleado.getDNI());
            System.out.println("Sueldo Bruto del empleado: " + empleado.getSalario());
            System.out.println("Sueldo Neto del empleado: " + empleado.calcularSueldoNeto(empleado.getSalario()));
        }
    }

    @Override
    public String toString() {
        StringBuilder resultado = new StringBuilder("Lista de Empleados:\n");

        for (Empleado empleado : this.empleados) {
            resultado.append(empleado.toString()).append("\n");
        }
        return resultado.toString();
    }

    // Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public String getCIF() {
        return CIF;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }
}
