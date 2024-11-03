/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Pez extends Animal {
    private String tipoDeAgua;
    private boolean venenoso;

    public Pez(boolean vivo, int edad, int numeroDeOjos, String tipoDeAgua, boolean venenoso) {
        super(vivo, edad, numeroDeOjos);
        this.tipoDeAgua = tipoDeAgua;
        this.venenoso = venenoso;
    }

    public String getTipoDeAgua() {
        return tipoDeAgua;
    }

    public void setTipoDeAgua(String tipoDeAgua) {
        this.tipoDeAgua = tipoDeAgua;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    @Override
    public void Sonido() {
        System.out.println("El pez no emite sonidos");
    }

    public void nadar() {
        System.out.println("El pez está nadando.");
    }

     @Override
    public void accionEspecifica() {
        nadar();
    }
    
    @Override
    public String toString() {
        return "Pez [vivo=" + isVivo() + ", edad=" + getEdad() + ", numeroDeOjos=" + getojos()
                + ", tipoDeAgua=" + tipoDeAgua + ", venenoso=" + venenoso + "]";
    }
}

