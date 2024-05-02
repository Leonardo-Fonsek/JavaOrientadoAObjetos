import java.sql.SQLOutput;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void statusConta(){
        System.out.println("------------------------------ ");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Nome: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status da conta: " + this.getStatus());
    }

    //METODOS ESPECIAIS

    public ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC"){
            this.setSaldo(50);
        } else if(t == "CP"){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Você não pode fechar a conta com dinheiro!");
        } else if (this.getSaldo() < 0){
            System.out.println("Conta em débito.");
        } else {
            this.setStatus(false);
            System.out.println("Conta encerrada com sucesso!");
        }
    }

    public void depositar(float d){
        if(this.getStatus() == false){
            System.out.println("Erro ao depositar! Esta conta esta fechada.");
        } else {
            this.setSaldo(getSaldo() + d);
            System.out.println("Deposito realizado na conta de " + this.getDono());
        }
    }

    public void sacar(float s){
        if(this.getStatus()){
            if (this.getSaldo() >= s){
                this.setSaldo(getSaldo() - s);
                System.out.println("Saqaue de " + s + " foi realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossivel sacar!");
        }
    }

    public void pagarMensal(){
        float v = 0;
        if (this.getTipo() == "CC"){
            v = 12;
        } else if(this.getTipo() == "CP"){
            v = 20;
        }
        //v = 12
        if(this.getStatus()){
            if(this.getSaldo() > v){
                this.setSaldo(getSaldo() - v);
                System.out.println("Mensalidade de " + v + " paga com sucesso!");
            } else {
                System.out.println("Saldo insuficiente para a mensalidade!");
            }
        }
    }

    public int getNumConta(){ return this.numConta; }
    public void setNumConta(int num){ this.numConta = num; }

    public String getTipo(){ return this.tipo; }
    public void setTipo(String t){ this.tipo = t; }

    public String getDono(){ return this.dono; }
    public void setDono(String d){ this.dono = d; }

    public float getSaldo(){ return this.saldo; }
    public void setSaldo(float s){ this.saldo = s; }

    public boolean getStatus(){ return this.status; }
    public void setStatus(boolean st){ this.status = st;}


}

