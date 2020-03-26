package ejercicio01.entity;

public class Persona {

    String nombre;
    int edad;
    float altura;

    public String consultaNome() {
        return nombre;
    }

    public void cambiaNome(String nom) {
        nombre = nom;
    }


}
