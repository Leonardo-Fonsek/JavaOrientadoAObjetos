import java.util.Random;
public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int round;
    private boolean aprovada;

    //Métodos Públicos
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar(){
        if(getAprovada()){
            System.out.println("### DESAFIADO ###");
            this.getDesafiado().apresentar();
            System.out.println("### DESAFIANTE ###");
            this.getDesafiante().apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            System.out.println("====== RESULTADO FINAL ======");

            switch (vencedor){
                case 0: //Empate
                    System.out.println("Empatou!");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                    break;
                case 1:
                    System.out.println("Vitória do " + this.getDesafiado().getNome());
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                    break;
                case 2:
                    System.out.println("Vitória do " + this.getDesafiante().getNome());
                    this.getDesafiante().ganharLuta();
                    this.getDesafiado().perderLuta();
                    break;

            }
        } else {
            System.out.println("A luta não pode acontecer.");
        }
    }

    //Getters e Setters
    public Lutador getDesafiado(){ return desafiado; }
    public void setDesafiado(Lutador desafiado){ this.desafiado = desafiado; }


    public Lutador getDesafiante(){ return desafiante; }
    public void setDesafiante(Lutador desafiante){ this.desafiante = desafiante; }

    public int getRound(){ return round; }
    public void setRound(int round){ this.round = round; }

    public boolean getAprovada(){ return aprovada; }
    public void setAprovada(boolean aprovada){ this.aprovada = aprovada; }

}
