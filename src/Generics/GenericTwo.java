package Generics;

//Es una clase generica que solo va a aceptar tipos de "Number"

public class GenericTwo<T extends Number >  {

    private T tipoObject;

    public GenericTwo(T tipoObject) {
        this.tipoObject = tipoObject;
    }

    public void mostrar(){
        System.out.println("Esta es la clase del genérico: " + tipoObject.getClass().getName());
    }
}
