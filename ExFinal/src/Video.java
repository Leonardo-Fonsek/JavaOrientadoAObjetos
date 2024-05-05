public class Video implements AcoesBasicas{
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

    private String titulo;
    private float views, avaliacao, curtidas;
    private int reproduzindo;

    //getters e setters
    public String getTitulo(){ return titulo; }
    public void setTitulo(String tiotulo){ this.titulo = titulo; }

    public float getViews(){ return views; }
    public void setViews(float views){ this.views = views; }

    public float getAvaliacao(){ return avaliacao; }
    public void setAvaliacao(float avaliacao){ this.avaliacao = avaliacao; }

    public float getCurtidas(){ return curtidas; }
    public void setCurtidas(float curtidas){ this.curtidas = curtidas; }

    public int getReproduzindo(){ return reproduzindo; }
    public void setReproduzindo(int reproduzindo){ this.reproduzindo = reproduzindo; }
}
