public class Mamifero extends Animal{
    private String corPelo;

    @Override
    void locomover() {
        System.out.println("Correndo...");
    }

    @Override
    void alimentar() {
        System.out.println("Mamando...");
    }

    @Override
    void emitirSom() {
        System.out.println("Som de mamífero");
    }

    public String getCorPelo(){
        return corPelo;
    }
    public void setCorPelo(String cor){
        this.corPelo = cor;
    }
}
