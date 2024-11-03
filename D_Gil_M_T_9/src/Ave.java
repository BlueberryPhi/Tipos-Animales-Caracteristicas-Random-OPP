/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Ave extends Animal {
    private double envergadura;
    private boolean vuela;

    public Ave(boolean vivo, int edad, int ojos, double envergadura, boolean vuela) {
        super(vivo, edad, ojos);
        this.envergadura = envergadura;
        this.vuela = vuela;
    }

    public double getEnvergadura() {
        return envergadura;
    }

    public void setEnvergadura(double envergadura) {
        this.envergadura = envergadura;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }

    @Override
    public void Sonido() {
        System.out.println("El ave canta.");
    }

    public void volar() {
        if (vuela) {
            System.out.println("El ave está volando.");
        } else {
            System.out.println("El ave no puede volar.");
        }
    }

    @Override
    public void accionEspecifica() {
        volar();
    }

    
    @Override
    public String toString() {
        return "Ave [vivo=" + isVivo() + ", edad=" + getEdad() + ", numeroDeOjos=" + getojos()
                + ", envergadura=" + envergadura + ", vuela=" + vuela + "]";
    }
}
