package biblicoteca;

public class livro {

    private String titulo;
    private String autor;
    private boolean disponivel;
    private String usuarioReservou;

    public livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public boolean isDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    public String getUsuarioReservou() {
        return usuarioReservou;
    }
    public void setUsuarioReservou(String usuarioReservou) {
        this.usuarioReservou = usuarioReservou;
    }
}
