public class Aula4 {
    public static void main(String[] args) {
        //Caneta c1 = new Caneta();

        //c1.setModelo("BIC");
        //c1.modelo = "BIC";

        //c1.setPonta(0.5f);
        //c1.ponta = 0.5f;

        //System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());

        Caneta c1 = new Caneta("NIC", "AMARELA", 0.4f);
        c1.status();

        System.out.println();

        Caneta c2 = new Caneta("KKK", "VERMELHA", 1.5f);
        c2.status();
    }
}