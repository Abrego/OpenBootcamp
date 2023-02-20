/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package dev.abrego.ejerciciotema9;

/**
 *
 * @author carlo
 */
public class EjercicioTema9 {

    public static void main(String[] args) {
        //Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, 
        // el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
        Cliente cliente = new Cliente();
        cliente.setNombre("Juan");
        cliente.setEdad(45);
        cliente.setTelefono("5555555555");
        cliente.setCredito(45000);
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Teléfono: " + cliente.getTelefono());
        System.out.println("Crédito: " + cliente.getCredito());
        
        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Pedro");
        trabajador.setEdad(25);
        trabajador.setTelefono("4444444444");
        trabajador.setSalario(25000);
        System.out.println("Trabajador: " + trabajador.getNombre());
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Teléfono: " + trabajador.getTelefono());
        System.out.println("Salario: " + trabajador.getSalario());
    }
}
//Crea una clase Persona con las siguientes variables:
//La edad
//El nombre
//El teléfono
class Persona {
    int edad;
    String nombre;
    String telefono;
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
     public int getEdad() {
         return this.edad;
     }
     public void setNombre(String nombre) {
         this.nombre = nombre;
     }
     public String getNombre() {
         return this.nombre;
     }
     public void setTelefono(String telefono) {
         this.telefono = telefono;
     }
     public String getTelefono() {
         return this.telefono;
     }
}
//Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, 
// esta nueva clase tendrá la variable credito solo para esa clase.
class Cliente extends Persona {
    double credito;
    
    public void setCredito(double credito) {
        this.credito = credito;
    }
    public double getCredito() {
        return this.credito;
    }
}

//Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, 
// y con una variable salario que solo tenga la clase Trabajador.
class Trabajador extends Persona {
    double salario;
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getSalario() {
        return this.salario;
    }
}