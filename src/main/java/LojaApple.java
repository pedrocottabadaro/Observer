import java.util.Observable;
import java.util.Observable;

public class LojaApple extends Observable {

    private Integer ano;
    private Integer mes;
    private String produto;
    private String versao;

    public LojaApple(Integer ano, Integer mes, String produto, String versao) {
        this.ano = ano;
        this.mes = mes;
        this.produto = produto;
        this.versao = versao;
    }

    public void lancarEmail() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "LojaApple{" +
                "ano=" + ano +
                ", mes=" + mes +
                ", produto='" + produto + '\'' +
                ", versao='" + versao + '\'' +
                '}';
    }
}
