import Generics.GenericOne;
import Generics.GenericThree;
import Generics.GenericTwo;
import Practica.ClaseSaludo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /**
         * Practicando Instancias de Objetos
         */

        /* System.out.println("Hello world!");

        var saludo = new ClaseSaludo();

        saludo.printHolaLucas();

        ClaseSaludo obj = new ClaseSaludo();
        obj.printAdiosLucas(); */

        /**
         * Practicando con Listas
         */

        /* List<String> list = new ArrayList<>();

        list.add("hola");
        list.add("chau");

        System.out.println(list);

        final String ejemplo = list.get(0);

        System.out.println(ejemplo);

        //creo una lista pero no especifico de que tipo van a ser sus elementos

        List list = new ArrayList<>();

        list.add(1);
        list.add("chau");

        //Me permite imprimir la lista con elementos de distintos tipos

        System.out.println(list);

        //Puedo "castear" el tipo de dato de un elemento, al no especificar nada los elementos de la "list" son de
        // tipo "Object" por defecto y necesita ser de tipo "Integer" para setear la variable "ejemplo" por eso
        // necesito castear:

        final Integer ejemplo = (Integer) list.get(0);

        System.out.println(ejemplo);

        final String ejemplo2 = Integer.toString((Integer) list.get(0));

        System.out.println(ejemplo);

        */

        /**
         * Practicando con Genéricos
         */

        GenericOne<String> generico = new GenericOne<>("Hola");

        generico.mostrar();

        GenericTwo<Double> genericoTwo = new GenericTwo<>(1.5);

        genericoTwo.mostrar();

        System.out.println("Nuevo ejercício");

        GenericThree genericoTres = new GenericThree();

        genericoTres.mostrar("hola");
        genericoTres.mostrar(1);
        genericoTres.mostrar(1.5);
        genericoTres.mostrar(true);

        var genericoCuatro = new GenericThree();

        Boolean resultado = genericoCuatro.mostrarTwo("In Jesus have the ",true);

        System.out.println(resultado);


    }
}
