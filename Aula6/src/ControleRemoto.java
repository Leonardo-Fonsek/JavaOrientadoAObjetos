public class ControleRemoto implements Controlador {

//ATRIBUTOS

    private int volume;
    private boolean ligado;
    private boolean tocando;

    //CONSTRUCTOR
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;
    }

    private void setVolume(int v) { this.volume = v; }
    private int getVolume() { return this.volume; }

    private void setLigado(boolean ligado) { this.ligado = ligado; }
    private boolean getLigado() { return this.ligado; }

    private void setTocando(boolean tocando) { this.tocando = tocando; }
    private boolean getTocando() { return this.tocando = tocando; }


    //METODOS ABSTRATOS
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (getLigado()) {
            System.out.println("-----MENU-----");
            System.out.println("Está ligado? " + this.getLigado());
            System.out.println("Está tocando? " + this.getTocando());
            System.out.print("Volume: " + this.getVolume());
            for (int i = 0; i <= this.getVolume(); i += 10) {
                System.out.print("|");
            }
            System.out.println();
        } else {
            System.out.println("Impossivel mostrar menu! TV desligada");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("TV desligada! Impossível aumentar volume.");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        } else{
            System.out.println("Não consegui reproduzir.");
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        } else {
            System.out.println("Não consegui pausar");
        }
    }
}