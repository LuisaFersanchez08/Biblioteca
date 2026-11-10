package Biblioteca;

public class Main {

    public static void main(String[] args) {

        SistemaBiblioteca biblioteca = new SistemaBiblioteca();


        Libro libro1 = new Libro("L001", "Satanás", 2002, true,
                "Mario Mendoza", "97803074745556");

        Libro libro2 = new Libro("L002", "Juventud en Extasis", 1993, false,
                "Carlos Cuauhtémoc", "9780156778568");

        Revista revista1 = new Revista("R001", "National Geographic", 2024, true,
                15, "Ciencia");

        Revista revista2 = new Revista("R002", "Muy Interesante", 2023, true,
                20, "Tecnología");


        biblioteca.registrarMaterial(libro1);
        biblioteca.registrarMaterial(libro2);
        biblioteca.registrarMaterial(revista1);
        biblioteca.registrarMaterial(revista2);


        Material encontrado = biblioteca.buscarMaterial("L001");

        if (encontrado != null) {
            encontrado.mostrarInfo();
        }

        Material inexistente = biblioteca.buscarMaterial("L999");

        if (inexistente == null) {
            System.out.println("El material no existe.");
        }

        biblioteca.agregarEspera("L002", "Ana");
        biblioteca.agregarEspera("L002", "Carlos");
        biblioteca.agregarEspera("L002", "Luisa");

        System.out.println(biblioteca.siguienteEnEspera("L002"));
        System.out.println(biblioteca.siguienteEnEspera("L002"));


        System.out.println(biblioteca.registrarMiembro("Ana"));
        System.out.println(biblioteca.registrarMiembro("Carlos"));
        System.out.println(biblioteca.registrarMiembro("Luisa"));

        System.out.println(biblioteca.registrarMiembro("Ana"));

        System.out.println(biblioteca.tieneMembresia("Carlos"));
        System.out.println(biblioteca.tieneMembresia("Luis"));


        biblioteca.mostrarCatalogo();
    }
}

