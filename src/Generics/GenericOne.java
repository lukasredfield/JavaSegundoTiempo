package Generics;

public class GenericOne<T> {

    private final T tipoObject;

    //Este constructor dice que el valor de la variable "tipoObject" va a ser proporcionado cuando se lo introduzca
    //Al momento de llamar al constructor en el parámetro entre paréntesis

    public GenericOne(T tipoObject) {
        this.tipoObject = tipoObject;
    }

    public void mostrar(){
        System.out.println("Esta es la clase del genérico: " + tipoObject.getClass().getName());
    }
}
