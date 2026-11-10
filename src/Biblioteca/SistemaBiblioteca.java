package Biblioteca;

import java.util.HashMap;
import java.util.Map;


public class SistemaBiblioteca {

    Map<String, Material> catalogo = new HashMap<>();


    public void registrarMaterial(Material m){
       catalogo.put(m.getCodigo(), m);
    }

    public Material buscarMaterial(String codigo){

       return catalogo.get(codigo);


    }

    public void mostrarCatalogo() {

        for (Map.Entry<String, Material> entrada : catalogo.entrySet()) {

            System.out.println("Código: " + entrada.getKey());

            entrada.getValue().mostrarInfo();
        }
    }
}
