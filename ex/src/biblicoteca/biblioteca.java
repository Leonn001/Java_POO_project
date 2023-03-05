package biblicoteca;

public class biblioteca {
    public static void main(String[] args) {

        sistema biblioteca = new sistema();

        usuario u1 = new usuario("Leon", "Casa nova", "leonmoreira@gmail.com");
        usuario u2 = new usuario("João", "Avenida Matos", "joao@gmail.com");
        usuario u3 = new usuario("Marcos", "Avenida azul", "marcos@gmail.com");

        livro l1 = new livro("A luta de Santiago", "João de Pedras");
        livro l2 = new livro("One Piece", "Echiiro Oda");
        livro l3 = new livro("A volta de Josué", "Marco Antonio");

        biblioteca.cadastrarUsuario(u1);
        biblioteca.cadastrarUsuario(u2);
        biblioteca.cadastrarUsuario(u3);
        biblioteca.cadastrarLivro(l1);
        biblioteca.cadastrarLivro(l2);
        biblioteca.cadastrarLivro(l3);

        biblioteca.exibirLivros();

        biblioteca.realizarReserva(u1, l1);
        biblioteca.realizarReserva(u2, l2);
        biblioteca.realizarReserva(u3, l3);
        biblioteca.realizarDevolucao(u2, l2);
        biblioteca.realizarReserva(u3, l2);

        biblioteca.exibirLivrosReservados();
    }
}
