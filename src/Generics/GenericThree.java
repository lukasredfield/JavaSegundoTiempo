package Generics;

public class GenericThree {
    public <T> void mostrar(T tipoObject){
        System.out.println("Esta es la clase del genérico: " + tipoObject.getClass().getName());
    }

    public < T, R> R mostrarTwo(T tipoObject, R tipoObj){
        System.out.println("Esta es la clase del genérico: " + tipoObject.getClass().getName());
        return tipoObj;
    }
}
