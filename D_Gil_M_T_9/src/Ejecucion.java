/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
import java.util.Random;

public class Ejecucion {
    private Animal[] animales;
    private Random rand;

    // Constructor
    public Ejecucion() {
        animales = new Animal[10];
        rand = new Random();
    }

    
    public void crearAnimalesAleatorios() {
        for (int i = 0; i < animales.length; i++) {
            int tipo = rand.nextInt(3);
            boolean vivo = rand.nextBoolean();
            int edad = rand.nextInt(15) + 1; 
            int ojos = rand.nextInt(2)+2; 

            switch (tipo) {
                case 0: 
                    String[] tiposDePelo = { "Largo", "Corto", "Sin Pelo" };
                    String[] dietas = { "Herbívoro", "Carnívoro", "Omnívoro" };
                    String tipoDePelo = tiposDePelo[rand.nextInt(tiposDePelo.length)];
                    String dieta = dietas[rand.nextInt(dietas.length)];
                    animales[i] = new Mamifero(vivo, edad, ojos, tipoDePelo, dieta);
                    break;
                case 1: 
                    double[] envergaduras = { 0.5, 1.0, 1.5, 2.0, 2.5 }; 
                    boolean vuela = rand.nextBoolean();
                    double envergadura = envergaduras[rand.nextInt(envergaduras.length)];
                    animales[i] = new Ave(vivo, edad, ojos, envergadura, vuela);
                    break;
                case 2: 
                    String[] tiposDeAgua = { "Dulce", "Salada" };
                    boolean venenoso = rand.nextBoolean();
                    String tipoDeAgua = tiposDeAgua[rand.nextInt(tiposDeAgua.length)];
                    animales[i] = new Pez(vivo, edad, ojos, tipoDeAgua, venenoso);
                    break;
                default:
      
                    animales[i] = null;
            }
        }
    }


    public void imprimirAnimales() {
        for (int i = 0; i < animales.length; i++) {
            Animal animal = animales[i];
            System.out.println(animal.toString());
            animal.Sonido();
            animal.accionEspecifica();
            System.out.println(); 
        }
    }
}