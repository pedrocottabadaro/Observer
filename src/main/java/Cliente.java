import java.util.Observable;
import java.util.Observer;

public class Cliente implements Observer {

    private String nome;
    private String ultimaEnvio;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return this.ultimaEnvio;
    }

    public void matriculaNewsLetter(LojaApple loja) {
        loja.addObserver(this);
    }

    public void update(Observable loja, Object arg1) {
        this.ultimaEnvio = this.nome + ", email enviado na " + loja.toString();
    }
}
