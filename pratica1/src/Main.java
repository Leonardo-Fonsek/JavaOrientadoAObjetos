public class Main {
    public static void main(String[] args) {
        //INSTANCIANDO A CLASSSE MOUSE
        Mouse m1 = new Mouse();
        m1.modelo = "Redragon";
        m1.material = "Plastico";
        m1.botao = 7;
        m1.ligar();
        m1.temLed();
        m1.naoTemBotaoReset();
        m1.informacoes();
        m1.clicar();
        m1.apertarBotaoReset();

        System.out.println();

        Mouse m2 = new Mouse();
        m2.modelo = "Logitech";
        m2.material = "Carbono";
        m2.botao = 10;
        m2.semLed();
        m2.desligar();
        m2.temLed();
        m2.temBotaoReset();
        m2.informacoes();
        m2.clicar();
        m2.apertarBotaoReset();


    }
}