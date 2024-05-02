public class Aula5Pratica {
    public static void main(String[]args){
        ContaBanco2 p1 = new ContaBanco2();
        p1.setDono("Leonardo Fernando Pires Fonseca");
        p1.setNumConta(1212);
        p1.criarConta("CP");
        p1.depositar(500);
        p1.sacar(90);
        p1.pagarMensal();
        p1.statusConta();

        ContaBanco2 p2 = new ContaBanco2();
        p2.setDono("Eliane Miranda Pires");
        p2.criarConta("CC");
        p2.setNumConta(3333);
        p2.depositar(1200);
        p2.statusConta();
    }
}
