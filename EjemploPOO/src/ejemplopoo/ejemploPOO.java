package ejemplopoo;

public class ejemploPOO {
    
    public static void main(String[] args) {
       
    Vehiculo vehi = new Vehiculo(5636, 4, "Renault", "RAf");
        Auto auto1 = new Auto();
        Auto auto2 = new Auto(1, "AA22ee", 4, "blue", true, 23423, 4, "VW", "Gol");
        Moto moto1 = new Moto(125, 1231, 2, "Zanella", "Twe");
        Camion cami1 = new Camion(6, true, 234234, 6, "Scania", "RAs");
        
        Vehiculo vector[] = new Vehiculo [4];
        vector[0]= vehi;
        vector[1]= auto2;
        vector[2]= moto1;
        vector[3]= cami1;
        
            for (int i=0; i<4; i++){
                System.out.println("Registro Nº" + i + vector[i].getMarca());
            }
        /*
        auto2.acelerar(23.4);
        auto2.apagar();
        auto2.acelerar(25.3);
        auto2.encender();
    
        System.out.println("El valor id:" + auto2.getId());
        auto2.setId(35);
        System.out.println("El nuevo valor:" +auto2.getId());
            
        System.out.println("la id de auto1:" + auto1.getId());
        System.out.println("el color de auto1:" + auto1.getColor());
        
        auto1.setId(2);
        auto1.setCan_puertas(3);
        auto1.setColor("azul");
        auto1.setCaja_manual(false);
        auto1.setPatente("AA2234");
        
        System.out.println("---");        
        
        System.out.println("la id de auto1:" + auto1.getId());
        System.out.println("el color de auto1:" + auto1.getColor());
        */
        
    }
    
}
