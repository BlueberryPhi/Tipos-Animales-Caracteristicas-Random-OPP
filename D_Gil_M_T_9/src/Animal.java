/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public abstract class Animal {
    private boolean vivo;
    private int edad;
    private int ojos;

    public Animal(boolean vivo, int edad, int ojos) {
        this.vivo = vivo;
        this.edad = edad;
        this.ojos = ojos;
    }


    public boolean isVivo() { 
        return vivo; 
    }
    public void setVivo(boolean vivo) { 
        this.vivo = vivo; 
    }

    public int getEdad() { 
        return edad; 
    }
    
    public void setEdad(int edad) { 
        this.edad = edad; 
    }

    public int getojos() { return ojos; }
    public void setojos(int numeroDeOjos) { this.ojos = ojos; }


    
    protected void dormir() {
        System.out.println("El animal esta durmiendo");
    }

    public abstract void Sonido();

    public abstract void accionEspecifica();

    @Override
    public String toString() {
        return "Animal [vivo=" + vivo + ", edad=" + edad + ", numeroDeOjos=" + ojos + "]";
    }
}