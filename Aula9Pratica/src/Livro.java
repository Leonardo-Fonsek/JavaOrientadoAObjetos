public class Livro implements Publicacao{

    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    //Construtor
    public Livro(String tit, String aut, int tot, Pessoa leitor){
        setTitulo(tit);
        setAutor(aut);
        setTotPaginas(tot);
        setAberto(false);
        setPagAtual(0);
        setLeitor(leitor);
    }

    //Metodos

    public String detalhes() {
        return "\nLivro{" +
                "titulo = " + titulo + ", " +
                "autor = " + autor + "\n" +
                "totPaginas = " + totPaginas + ", " +
                "pagAtual = " + pagAtual + ", " +
                "aberto = " + aberto + "\n" +
                "leitor = " + leitor.getNome() + ", " +
                "Idade = " + leitor.getIdade() + ", " +
                "Sexo = " + leitor.getSexo() + "\n" +
                '}';
    }

    //Getters e Setters
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

    public int getTotPaginas() {
        return totPaginas;
    }
    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    //Metodos abstratos
    @Override
    public void abrir() {
        setAberto(true);
    }

    @Override
    public void fechar() {
        setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if(this.getTotPaginas() < p || getAberto() == false){
            System.out.println("Impossível folhear!");
        } else {
            setPagAtual(p);
        }
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
}
