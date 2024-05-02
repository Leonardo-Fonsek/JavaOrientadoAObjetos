public class Pratica {
    public static void main(String[] args){
        ContaBanco2 p1 = new ContaBanco2();
        p1.setNumConta(1111);
        p1.setDono("Leonardo");
        p1.criarConta("CC");
        p1.depositar(200);
        p1.sacar(70);
        p1.fecharConta();

        p1.statusConta();
    }
}