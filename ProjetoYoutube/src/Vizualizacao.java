public class Vizualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Vizualizacao(Gafanhoto espectador, Video filme){
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public void avaliar(){

    }

    public void avaliar(float nota){

    }

    public void avaliar(int porc){

    }

    public Gafanhoto getEspectador(){ return espectador; }
    public void setEspectador(Gafanhoto espectador){ this.espectador = espectador; }

    public Video getFilme(){ return filme; }
    public void setFilme(Video filme){ this.filme = filme; }

    @Override
    public String toString() {
        return "Vizualizacao{" +
                "espectador=" + espectador +
                ", filme=" + filme +
                '}';
    }
}
