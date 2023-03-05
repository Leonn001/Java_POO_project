package biblicoteca;

public class sistema {

    private livro[] livros;
    private usuario[] usuarios;

    public sistema() {
        livros = new livro[3];
        usuarios = new usuario[3];
    }

    public void cadastrarLivro(livro livro){
        for(int i=0; i < livros.length; i++){
            if (livros[i] == null) {
                    livros[i] = livro;
                    break;
                }
            }
    }

    public void cadastrarUsuario(usuario usuario){
        for(int i=0; i < usuarios.length; i++){
            if (usuarios[i] == null) {
                    usuarios[i] = usuario;
                    break;
                }
        }
    }

    public void exibirLivros() {
        System.out.println("Livros da biblioteca:");
        System.out.println();
        for(int i=0; i < livros.length; i++){
            System.out.println("livro: " + livros[i].getTitulo() + "; de: " + livros[i].getAutor());
            
        }
    }

    public void realizarReserva(usuario usuario, livro livro) {
        for(int i=0; i < livros.length; i++){
            if (livros[i].isDisponivel()) {
                livros[i].setDisponivel(false);
                livros[i].setUsuarioReservou(usuario.getNome());
                System.out.println("Reserva do livro " + livros[i].getTitulo() + " por " + usuario.getNome() + " realizada com sucesso!");
                System.out.println();
                return;
            }
        }
        System.out.println("Todos os livros estão indisponíveis para reserva.");
        System.out.println();
    }

    public void realizarDevolucao(usuario usuario, livro livro){
        if (livro.isDisponivel() == false && livro.getUsuarioReservou().equals(usuario.getNome())) {
            livro.setDisponivel(true);
            livro.setUsuarioReservou(null);
            System.out.println("Devolução do livro " + livro.getTitulo() + " por " + usuario.getNome() + " realizada com sucesso!");
            System.out.println();
        } else {
            System.out.println("O livro não está emprestado para este usuário.");
            System.out.println();
        }
    }

    public void exibirLivrosReservados(){
        System.out.println("Livros reservados:");
        System.out.println();
        for(int i=0; i < livros.length; i++){
            if (!livros[i].isDisponivel()) {
                System.out.println("Livro: " + livros[i].getTitulo() + ", reservado por: " + livros[i].getUsuarioReservou());
            }
        }
    }


    public livro[] getLivros() {
        return livros;
    }

    public void setLivros(livro[] livros) {
        this.livros = livros;
    }

    public usuario[] getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(usuario[] usuarios) {
        this.usuarios = usuarios;
    }

}
