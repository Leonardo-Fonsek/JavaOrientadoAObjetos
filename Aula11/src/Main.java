public class Main {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();
        /*Visitante v1 = new Visitante();
        v1.setNome("Gabriel");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());*/

        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatricula(1111);
        a1.setCurso("Informatica");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Leonardo");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.renovarBolsa();
        b1.pagarMensalidade();

        Professor pr1 = new Professor();
        pr1.setNome("Guanabara");
        pr1.setIdade(47);
        pr1.setSexo("M");
        pr1.setEspecialidade("Lógica de programação");
        pr1.setSalario(5000f);
        pr1.receberAumento(150f);

        Tecnico t1 = new Tecnico();
        t1.setNome("Fernando");
        t1.setIdade(23);
        t1.setSexo("M");
        t1.setRegistroProf("Desenvolvimento de sistemas");
        t1.praticar();
    }
}