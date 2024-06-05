package EmployeeCompany.Domain;

public class Empleado {
    private final String nombre;
    private final String DNI;
    private double salario;
    private byte edad;
    private String telefono;
    private String direccion;

    public Empleado(String nombre, String DNI, double salario) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.salario = salario;
    }
    public Empleado(String nombre, String DNI, double salario, byte edad, String telefono, String direccion) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.salario = salario;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    protected double calcularSueldoNeto (double salario) {
        double salarioAnual = salario * 12;

        if (salarioAnual < 12000.00) {
            return salario * 0.8;
        } else if (12000.00 <= salarioAnual && salarioAnual < 25000.00) {
            return salario * 0.7;
        } else {
            return salario * 0.6;
        }
    }

    @Override
    public String toString() {
        return "Información del Empleado:\n" +
                "Nombre: " + getNombre() + "\n" +
                "DNI: " + getDNI() + "\n" +
                "Salario Bruto: " + getSalario() + "\n" +
                "Salario Neto: " + calcularSueldoNeto(getSalario()) + "\n" +
                "Edad: " + getEdad() + "\n" +
                "Teléfono: " + getTelefono() + "\n" +
                "Dirección: " + getDireccion() + "\n";
    }

    // Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public byte getEdad() {
        return edad;
    }
    public void setEdad(byte edad) {
        this.edad = edad;
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

}
