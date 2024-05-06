public class Video implements AcoesBasicas{
    private String titulo;
    private int views, avaliacao, curtidas;
    private boolean reproduzindo;

    public Video(String titulo){
        this.setTitulo(titulo);
        this.setAvaliacao(1);
        this.setViews(0);
        this.setCurtidas(0);
        this.setReproduzindo(false);
    }

    //metodos interface AcoesBasicas
    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void like() {

    }

    @Override
    public String toString() {
        return "Video{" +
                "titulo='" + titulo + '\'' +
                ", views=" + views +
                ", avaliacao=" + avaliacao +
                ", curtidas=" + curtidas +
                ", reproduzindo=" + reproduzindo +
                '}';
    }

    //getters e setters
    public String getTitulo(){ return titulo; }
    public void setTitulo(String titulo){ this.titulo = titulo; }

    public int getViews(){ return views; }
    public void setViews(int views){ this.views = views; }

    public int getAvaliacao(){ return avaliacao; }
    public void setAvaliacao(int avaliacao){ this.avaliacao = avaliacao; }

    public int getCurtidas(){ return curtidas; }
    public void setCurtidas(int curtidas){ this.curtidas = curtidas; }

    public boolean getReproduzindo(){ return reproduzindo; }
    public void setReproduzindo(boolean reproduzindo){ this.reproduzindo = reproduzindo; }
}
