public class Peixe extends Animal{
    private String corEscama;

    public void soltarBolha(){
        System.out.println("Soltando bolhas...");
    }

    @Override
    void locomover(){
        System.out.println("Nadando...");
    }

    @Override
    void alimentar(){
        System.out.println("Comendo substâncias...");
    }

    @Override
    void emitirSom(){
        System.out.println("Peixe não faz som");
    }

    public String getCorEscama(){
        return corEscama;
    }
    public void setCorEscama(String corEscama){
        this.corEscama = corEscama;
    }
}
