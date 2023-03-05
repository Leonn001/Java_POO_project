package biblicoteca;

public class usuario {

    private String nome;
    private String endereço;
    private String email;
    private livro[] livrosReservados;

    public usuario(String nome, String endereço, String email) {
        this.nome = nome;
        this.endereço = endereço;
        this.email = email;
        livrosReservados = new livro[3];
    }


    public void reservarLivro(livro livro){
        boolean livroReservado = false;
        for(int i = 0; i < livrosReservados.length; i++){
            if (livrosReservados[i] == null) {
                livrosReservados[i] = livro;
                livroReservado = true;
        }
        if (!livroReservado) {
            System.out.println("Não é possível reservar mais livros.");
        }
    }
    
    }

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getEndereço() {
        return endereço;
    }


    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public livro[] getLivrosReservados() {
        return livrosReservados;
    }


    public void setLivrosReservados(livro[] livrosReservados) {
        this.livrosReservados = livrosReservados;
    }
}