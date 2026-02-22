package erick.seixas.estudos.ChatGPTDesafios.biblioteca;

public class Main {
    public static void main(String[] args) {
        Library biblioteca = new Library();

        // Criando livros
        Book livro1 = new Book("O Senhor dos Anéis", "J.R.R. Tolkien");
        Book livro2 = new Book("1984", "George Orwell");

        // Criando usuários
        User user1 = new User("Alice","erick@example.com","password123");
        User user2 = new User("Bob","bob@example.com","password456");

        // Adicionando livros e usuários à biblioteca
        biblioteca.addBook(livro2);
        biblioteca.addBook(livro1);
        biblioteca.addUser(user1);
        biblioteca.addUser(user2);

       
        System.out.println(biblioteca.bookList());
        System.out.println(biblioteca.usersList());
    }
}
