public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistido;

    public void viuMaisUm(){
        setLogin(getLogin() + 1);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
