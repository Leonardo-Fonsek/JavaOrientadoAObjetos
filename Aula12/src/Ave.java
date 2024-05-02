public class Ave extends Animal{
    private String corPena;

    public void fazerNinho(){
        System.out.println("Construiu um ninho");
    }

    @Override
    void locomover(){
        System.out.println("Voando...");
    }

    @Override
    void alimentar(){
        System.out.println("Comendo frutas");
    }

    @Override
    void emitirSom(){
        System.out.println("Som da ave");
    }

    public String getCorPena(){
        return corPena;
    }
    public void setCorPena(String corPena){
        this.corPena = corPena;
    }
}
