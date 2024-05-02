public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura, peso;
    private String categoria;
    private int vitorias, derrotas, empates;

    //CONSTRUTOR
    public Lutador(String no, String na, int id, float al, float pe, int vit, int der, int em){
        setNome(no);
        setNacionalidade(na);
        setIdade(id);
        setAltura(al);
        setPeso(pe);
        setVitorias(vit);
        setDerrotas(der);
        setEmpates(em);
    }
    
    public void apresentar(){
        System.out.println("---------------------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador: " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("com " + this.getIdade() + " anos e " + this.getAltura() + " de altura");
        System.out.println("Pesando: " + this.getPeso() + "Kg");
        System.out.println(this.getVitorias() + " vitórias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
    }

    public void status(){
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " vezes");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes");
        System.out.println("Empatou " + this.getEmpates() + " vezes");
    }

    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }

    //GETTERS E SETTERS
    private void setNome(String n){ this.nome = n; }
    public String getNome(){ return this.nome ;}

    private void setIdade(int i){ this.idade = i; }
    private int getIdade(){ return this.idade; }

    private void setNacionalidade(String nacionalidade){ this.nacionalidade = nacionalidade; }
    private String getNacionalidade(){ return this.nacionalidade; }

    private void setPeso (float p){
        this.peso = p;
        setCategoria();
    }
    private float getPeso(){ return this.peso; }

    private void setCategoria(){
        if(getPeso() <= 52.2){
            this.categoria = "Inválido";
        } else if(getPeso()<= 70.3){
            this.categoria = "Leve";
        } else if (getPeso() <= 83.9){
            this.categoria = "Medio";
        } else if(getPeso()<= 120.2){
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public String getCategoria(){ return this.categoria; }

    private void setVitorias(int v){ this.vitorias = v; }
    private int getVitorias(){ return this.vitorias; }

    private void setDerrotas(int d){ this.derrotas = d; }
    private int getDerrotas(){ return this.derrotas; }

    private void setEmpates(int e){ this.empates = e; }
    private int getEmpates(){ return this.empates; }

    private void setAltura(float a){ this.altura = a; }
    private float getAltura(){ return this.altura; }


}

