package controllers;

import java.util.HashMap;



public class Mapa {
    public Mapa() {
        HashMap<String, Integer> mapita =  new HashMap<>();
        mapita.put("Manzana", 20);
        mapita.put("Pera", 25);
        mapita.put("Mandarina", 20);

        System.out.println(mapita);
        mapita.remove("Pera");
        System.out.println("Existe pero" + mapita.containsKey("Pera")); 
        System.out.println("Existe una peros--> "+mapita.containsKey("Mandarina"));
 
        int valorManzana =  mapita.get("Manzana");
        System.out.println("Valor menazanda es: "+ valorManzana);

        System.out.println(mapita.size());
        System.out.println("Esta vacio ?" + mapita.isEmpty());

        System.out.println("\n claves de mapa");
        for (String clave : mapita.keySet()) {
            System.out.println("- "+ clave);
            
        }
        System.out.println("Valores del mapa");
        for (Integer value : mapita.values()) {
            System.out.println("- "+ value);
            
        }
        System.out.println(mapita);
        mapita.replaceAll((k,v)-> v*2);
        System.out.println(mapita);

        mapita.clear();
        System.out.println(mapita);


   }
}
