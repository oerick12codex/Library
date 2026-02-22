package erick.seixas.estudos.ChatGPTDesafios.biblioteca;

import java.time.LocalDate;

public class Book {
    private String title;
    private String authorName;
    private final int publicationYear;
    private static int contadorId = 1;
    private int id;


    public Book(String bookName, String authorName) {
        this.title = bookName;
        this.authorName = authorName;
        this.id = contadorId;
        contadorId++;
        this.publicationYear = LocalDate.now().getYear();
    }
    //Getters
    public String getBookTitle() {return title;}
    public String getAuthorName() {return authorName;}
    public int getId() {return id;}
    public int getPublicationYear() {return publicationYear;}

    //Setters
    public void setBookTitle(String bookTitle) {this.title = bookTitle;}
    public void setAuthorName(String authorName) {this.authorName = authorName;}

}
