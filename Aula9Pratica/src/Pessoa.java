public class Pessoa {
    //Atributos
    private String nome;
    private int idade;
    private String sexo;

    //Metodos
    public void fazerAniver(){
        setIdade(getIdade() + 1);
    }

    public Pessoa(String n, int id, String se){
        this.setNome(n);
        this.setIdade(id);
        this.setSexo(se);
    }

    //Getters e Setters
    public String getNome(){ return nome; }
    public void setNome(String nome){ this.nome = nome; }

    public int getIdade(){ return idade; }
    public void setIdade(int idade){ this.idade = idade; }

    public String getSexo(){ return sexo; }
    public void setSexo(String sexo){ this.sexo = sexo; }
}
