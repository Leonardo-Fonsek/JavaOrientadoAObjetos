public abstract class Pessoa {
    protected String nome, sexo;
    protected int idade;
    protected float experiencia;

    public Pessoa(String nome, int idade, String sexo){
        setNome(nome);
        setIdade(idade);
        setSexo(sexo);
        setExperiencia(0);
    }

    protected void ganharExp(){

    }

    public String getNome(){ return nome; }
    public void setNome(String nome){ this.nome = nome; }

    public String getSexo(){ return sexo; }
    public void setSexo(String sexo){ this.sexo = sexo; }

    public int getIdade(){ return idade; }
    public void setIdade(int idade){ this.idade = idade; }

    public float getExperiencia(){ return experiencia; }
    public void setExperiencia(float experiencia){ this.experiencia = experiencia; }
}
