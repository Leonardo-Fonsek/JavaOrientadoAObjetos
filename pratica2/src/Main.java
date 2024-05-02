public class Main {
    public static void main(String[] args) {
        CriarSistema s1 = new CriarSistema();
        s1.tema = "Criar cadastro de clientes";
        s1.linguagem = "JAVA";
        s1.logica = "Intermediário";
        s1.variaveis = 5;
        s1.loops = "WHILE";
        s1.informacoes();
        s1.semFuncao();
        s1.nivelSistema();
        s1.nivelLogica();
        s1.teste();

        System.out.println("");

        CriarSistema s2 = new CriarSistema();
        s2.tema = "Cadastrar media de 100 alunos.";
        s2.linguagem = "PYTHON";
        s2.logica = "Avançada";
        s2.variaveis = 15;
        s2.loops = "ARRAY";
        s2.informacoes();
        s2.temFuncao();
        s2.nivelSistema();
        s2.nivelLogica();
        s2.teste();

    }
}