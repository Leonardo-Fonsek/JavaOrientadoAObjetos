public class Caneta {
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    public Caneta(String modelo, String cor, float ponta) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
        tampar();

    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return ponta;
    }
    public void setPonta(float p) {
        this.ponta = p;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String c) {
        this.cor = c;
    }

    public void tampar() {
        this.tampada = true;
    }
    public void destampar() {
        this.tampada = false;
    }

    public void status(){
        System.out.println("SOBRE A CANETA: " );
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Tampada: " + this.tampada);
    }
}
