public class Reptil extends Animal{
    private String corEscama;

    @Override
    void locomover(){
        System.out.println("Rastejando...");
    }

    @Override
    void alimentar(){
        System.out.println("Comendo vegetais...");
    }

    @Override
    void emitirSom(){
        System.out.println("Som de réptil");
    }

    public String getCorEscama(){
        return corEscama;
    }
    public void setCorEscama(String corEscama){
        this.corEscama = corEscama;
    }
}
