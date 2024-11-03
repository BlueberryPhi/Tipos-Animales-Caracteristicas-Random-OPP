/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Mamifero extends Animal {
    private String tipoDePelo;
    private String dieta;

    public Mamifero(boolean vivo, int edad, int ojos, String tipoDePelo, String dieta) {
        super(vivo, edad, ojos);
        this.tipoDePelo = tipoDePelo;
        this.dieta = dieta;
    }

    public String getTipoDePelo() {
        return tipoDePelo;
    }

    public void setTipoDePelo(String tipoDePelo) {
        this.tipoDePelo = tipoDePelo;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    @Override
    public void Sonido() {
        System.out.println("El mamífero emite un sonido.");
    }

    public void amamantar() {
        System.out.println("El mamífero está amamantando a sus crías.");
    }

    
    @Override
    public void accionEspecifica() {
        amamantar();
    }
    
    @Override
    public String toString() {
        return "Mamifero [vivo=" + isVivo() + ", edad=" + getEdad() + ", numeroDeOjos=" + getojos()
                + ", tipoDePelo=" + tipoDePelo + ", dieta=" + dieta + "]";
    }
}
