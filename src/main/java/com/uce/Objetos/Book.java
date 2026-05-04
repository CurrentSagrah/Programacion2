package com.uce.Objetos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor

public class Book {

    @Getter @Setter
    private String title;
    @Getter @Setter
    private String author;
    @Getter @Setter
    private float price;
    @Getter @Setter
    private String editorial;
    @Getter @Setter
    private int pages;
    @Getter @Setter
    private int year;
    @Getter @Setter
    private String edition;

    @Override
    public String toString (){
        String est = "Book: " + title + " | Autor: " + author + " | Precio: " + price +
        " | Editorial: " + editorial + " | Paginas: " + pages + " | Año: " + year + " | Edición: " + edition;
        System.out.println(est);
        return est;
    }

    //funcion que verifique el contenido de cada instancia, que no sean iguales en contenido

}
