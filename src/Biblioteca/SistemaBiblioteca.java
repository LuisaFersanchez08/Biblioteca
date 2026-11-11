package Biblioteca;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


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

    Map<String, List<String>> listaEspera = new HashMap<>();

    public void agregarEspera(String codigoMaterial, String usuario){

        if(!listaEspera.containsKey(codigoMaterial)){
            List<String> usuarios = new ArrayList<>();
            listaEspera.put(codigoMaterial, usuarios);


        }

        listaEspera.get(codigoMaterial).add(usuario);

    }

    public String siguienteEnEspera(String codigoMaterial) {

        if (!listaEspera.containsKey(codigoMaterial)) {
            return null;
        }

        List<String> usuarios = listaEspera.get(codigoMaterial);

        if (usuarios.isEmpty()) {
            return null;
        }

        return usuarios.removeFirst();
    }

    Set<String> miembros = new HashSet<>();

    public boolean  registrarMiembro(String usuario){

        return miembros.add(usuario);

    }

    public boolean tieneMembresia(String usuario){
        return miembros.contains(usuario);
    }
}





