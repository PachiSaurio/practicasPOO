package ejemplopoo;

import java.util.logging.Logger;

public class Auto extends Vehiculo{

    private int id;
    private String patente;
    private int can_puertas;
    private String color;
    private boolean caja_manual;

    public Auto() {
    }

    public Auto(int id, String patente, int can_puertas, String color, boolean caja_manual, int num_registro, int cant_ruedas, String marca, String modelo) {
        super(num_registro, cant_ruedas, marca, modelo);
        this.id = id;
        this.patente = patente;
        this.can_puertas = can_puertas;
        this.color = color;
        this.caja_manual = caja_manual;
    }    
    
    public int getId() {
        return id;
    }
    public String getPatente() {
        return patente;
    }
    public int getCan_puertas() {
        return can_puertas;
    }
    public String getColor() {
        return color;
    }
    public boolean isCaja_manual() {
        return caja_manual;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setPatente(String patente) {
        this.patente = patente;
    }
    public void setCan_puertas(int can_puertas) {
        this.can_puertas = can_puertas;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setCaja_manual(boolean caja_manual) {
        this.caja_manual = caja_manual;
    }

    @Override
    public String toString() {
        return "Auto{" + "id=" + id + ", patente=" + patente + ", can_puertas=" + can_puertas + ", color=" + color + ", caja_manual=" + caja_manual + '}';
    }
    
    

    public void encender() {
        System.out.println("Encendiendo..");
    }

    public void apagar() {
        System.out.println("Apagando..");
    }

    public void acelerar(double km) {
        System.out.println("Acelerando a" + km + "km/h");
    }

    public void frenar(double km) {
        System.out.println("Frenando a" + km + "km/h");
    }
}
