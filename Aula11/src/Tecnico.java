public class Tecnico extends Aluno{
    private String registroProf;

    public void praticar(){
        System.out.println("O aluno " + this.getNome() + " está programando...");
    }

    public String getRegistroProf() {
        return registroProf;
    }

    public void setRegistroProf(String registroProf) {
        this.registroProf = registroProf;
    }
}
