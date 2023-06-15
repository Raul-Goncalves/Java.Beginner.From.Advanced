package br.raul.Java.Coleções;

import java.util.HashMap;
import java.util.Map;

public class ColeçãoMap {

    public static void main(String[] args) {

        Map<Integer,String> usuarios = new HashMap<>();

        usuarios.put(1, "Raul");
        usuarios.put(2, "Marco");
        usuarios.put(3, "Kiko");
        usuarios.put(4, "Luis");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(1));
        System.out.println(usuarios.containsValue("Marco"));

        System.out.println(usuarios.get(3));
        System.out.println(usuarios.get(1));
        System.out.println(usuarios.remove(4));

        for(int key : usuarios.keySet()){
            System.out.println(key
            );
        }

        for( String value : usuarios.values()){
            System.out.println(value);
        }

        for (Map.Entry<Integer,String> register : usuarios.entrySet()){
            System.out.println(register.getKey());
            System.out.println(register.getValue());
        }
    }
}
