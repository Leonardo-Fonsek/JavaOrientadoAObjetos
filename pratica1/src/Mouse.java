public class Mouse {
    //ATRIBUTOS
    int botao;
    boolean botaoReset;
    boolean led;
    boolean ligado;
    String cursor;
    String material;
    String modelo;

    //METODOS
    void informacoes(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Material: " + this.material);
        System.out.println("Botões: " + this.botao);
        System.out.println("Está ligado? " + this.ligado);
        System.out.println("Tem botao reset? " + this.botaoReset);
        System.out.println("Tem led? " + this.led);
    }
    void clicar(){
        if (this.ligado == true){
            System.out.println("Clicando");
        } else {
            System.out.println("Não é possivel usar o mouse, esta desligado!");
        }
    }

    void ligar(){ this.ligado = true; }

    void desligar(){ this.ligado = false; }


    void apertarBotaoReset(){
        if (botaoReset == true){
            System.out.println("Mouse resetado!");
        } else {
            System.out.println("Mouse não possui botão reset!");
        }
    }

    void temLed(){ this.led = true; }

    void semLed(){ this.led = false; }

    void temBotaoReset(){ this.botaoReset = true; }

    void naoTemBotaoReset(){ this.botaoReset = false; }

}
