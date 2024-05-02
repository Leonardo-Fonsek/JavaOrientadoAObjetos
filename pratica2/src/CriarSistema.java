import java.sql.SQLOutput;

public class CriarSistema {
    //ATRIBUTOS
    String tema;
    String linguagem;
    String logica;
    int variaveis;
    String loops;
    boolean funcaoDeArray;

    //METODOS

    void informacoes(){
        System.out.println("Tema: " + this.tema);
        System.out.println("Linguagem: " + this.linguagem);
        System.out.println("Logica: " + this.logica);
        System.out.println("Quantidade de variáveis: " + this.variaveis);
        System.out.println("Loops usados: " + this.loops);
    }

    void nivelSistema(){
        if (this.variaveis <= 5){
            System.out.println("Sistema básico.");
        } else if (this.variaveis > 5 && this.variaveis <= 10){
            System.out.println("Sistema intermediário.");
        } else {
            System.out.println("Sistema avançado.");
        }
    }

    void nivelLogica(){
        if (this.logica == "Iniciante"){
            System.out.println("Vai estudar mais!");
        } else if (this.logica == "Intermediário"){
            System.out.println("Aplica pra vaga e continua estudando.");
        } else if(this.logica == "Avançada"){
            System.out.println("Corre pro abraço.");
        }
    }

    void temFuncao(){ this.funcaoDeArray = true; }
    void semFuncao(){ this.funcaoDeArray = false; }

    void teste (){
        if (this.loops == "WHILE" || this.loops == "FOR"){
            System.out.println("Sistema executado com sucesso!");
        } else {
            System.out.println("Erro no sistema");
        }
    }

}
