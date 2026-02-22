package erick.seixas.estudos.ChatGPTDesafios.biblioteca;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<Integer, Book> books;
    private Map<Integer, User> users;

    public Library() {
        this.books = new HashMap<>();
        this.users = new HashMap<>();
    }
    // Adiciona usuarios e livros.
    public void addBook(Book livro) {
        if(livro == null) {
            throw new IllegalArgumentException("Livro não pode ser nulo.");
        }
        if(books.containsKey(livro.getId())) {
            throw new IllegalArgumentException("Livro já existe.");
        }
        books.put((livro.getId()), livro);
    }
    public void addUser(User user) {
        if(user == null) {
            throw new IllegalArgumentException("Usuário não pode ser nulo.");
        }
        if(users.containsKey(user.getId())) {
            throw new IllegalArgumentException("Usuário já existe.");
        }
        users.put(user.getId(), user);
    }

    // Regras de negocio
    public void loanOfBook(int userId, int livroId) {
        if(!users.containsKey(userId)) {
            throw new IllegalArgumentException("Usuário não encontrado.");
        }
        if(!books.containsKey(livroId)) {
            throw new IllegalArgumentException("Livro não encontrado.");
        }  
        // Lógica de empréstimo (pode ser implementada posteriormente)
    }
    // Remover livros e usuarios.
    public void RemoveBook(Book livro) {
        if(!books.containsKey(livro.getId())) {
            throw new IllegalArgumentException("Livro não encontrado.");
        }
        books.remove(livro.getId());
    }
    public void removeUser(User user) {
        if(!users.containsKey(user.getId())) {
            throw new IllegalArgumentException("Usuário não encontrado.");
        }
        users.remove(user.getId());
    }

    public String bookList() {
        StringBuilder sb = new StringBuilder();
        for(Book livro : books.values()) {
            sb.append("ID: ").append(livro.getId())
              .append(", Título: ").append(livro.getBookTitle())
              .append(", Autor: ").append(livro.getAuthorName())
              .append(", Ano de Publicação: ").append(livro.getPublicationYear())
              .append("\n");
        }
        return sb.toString();
    }
    public String usersList() {
        StringBuilder sb = new StringBuilder();
        for(User user : users.values()) {
            sb.append("ID: ").append(user.getId())
              .append(", Nome: ").append(user.getUserName())
              .append(", Email: ").append(user.getEmail())
              .append("\n");
        }
        return sb.toString();
    }

}
