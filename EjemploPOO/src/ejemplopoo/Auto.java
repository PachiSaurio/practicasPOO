package ejemplopoo;

public class Auto {
    
    int id;
    String patente;
    int can_puertas;
    String color; 
    boolean caja_manual;

    public Auto() {
    }

    public Auto(int id, String patente, int can_puertas, String color, boolean caja_manual) {
        this.id = id;
        this.patente = patente;
        this.can_puertas = can_puertas;
        this.color = color;
        this.caja_manual = caja_manual;
    }
        
    public void encender () {
        System.out.println("Encendiendo..");
    }
    public void apagar () {
        System.out.println("Apagando..");
    }
    public void acelerar (double km) {
        System.out.println("Acelerando a" + km + "km/h");
    } 
    public void frenar (double km) {
        System.out.println("Frenando a" + km + "km/h");             
    }
}
