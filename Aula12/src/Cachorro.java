public class Cachorro extends Mamifero{
    public void enterrarOsso(){
        System.out.println("Enterrando osso...");
    }

    public void abanarRabo(){
        System.out.println("Abanando rabo");
    }

    @Override
    void emitirSom(){
        System.out.println("Latindo...");
    }
}
