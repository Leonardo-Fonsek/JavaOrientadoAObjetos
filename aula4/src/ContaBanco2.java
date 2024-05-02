public class ContaBanco2 {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //CONSTRUCTOR
    public ContaBanco2(){
        this.setSaldo(0);
        this.setStatus(false);
    }

    //METODOS
    public void statusConta(){
        System.out.println("------------------------------ ");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Nome: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status da conta: " + this.getStatus());
    }

    public void criarConta(String t){
        this.setTipo(t);
        this.setStatus(true);

        if(this.getTipo() == "CC"){
            this.setSaldo(50);
        } else if(this.getTipo() == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta no nome de de " + this.getDono() + " aberta com sucesso!");
    }

    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Conta ainda com dinheiro!");
        } else if (this.getSaldo() < 0){
            System.out.println("Conta em débito!");
        } else {
            System.out.println("Conta de " + this.getDono() + "encerrada com sucesso!");
        }
    }

    public void depositar(float d){
        if(!this.getStatus()){
            System.out.println("Falha ao depositar! A conta esta encerrada.");
        } else {
            this.setSaldo(getSaldo() + d);
                System.out.println("Deposito concluido no nome de " + this.getDono());
            }
        }
        public void sacar(float s) {
            if (this.getStatus()){
                if(this.getSaldo() >= s){
                    this.setSaldo(getSaldo() + s);
                    System.out.println("Saque de " + s + " no nome de " + this.getDono() + " concluído!");
                }
            } else {
                System.out.println("Erro! A conta esta encerrada para saque.");
            }
        }

        public void pagarMensal(){
            int v = 0;
            if (this.getTipo() == "CC"){
                v = 12;
            } else if (this.getTipo() == "CP"){
                v = 22;
            }
            this.setSaldo(getSaldo() - v);
            System.out.println("Mensalidade de " + v + " reais paga com sucesso!");
        }



    //METODOS SETTER E GETTERS
    public void setNumConta(int n){ this.numConta = n; }
    public int getNumConta(){ return this.numConta; }

    public void setTipo(String t){ this.tipo = t; }
    public String getTipo(){ return this.tipo; }

    public void setDono(String d){ this.dono = d; }
    public String getDono(){ return this.dono; }

    public void setSaldo(float s){ this.saldo = s; }
    public float getSaldo(){ return this.saldo; }

    public void setStatus(boolean status){ this.status = status; }
    public boolean getStatus(){ return this.status; }

}

