package application;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class NotificacaoSms extends Notificacao implements Priorizavel {
   
    private String numeroTelefone;
    private String mensagem;

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private int nivelPrioridade;

    public NotificacaoSms(String remetente, String numeroTelefone, String mensagem, int prioridade){
        super(remetente);
        this.numeroTelefone = numeroTelefone;
        this.mensagem = mensagem;
        this.nivelPrioridade = prioridade;

    }
    @Override
    public void enviar(){
        System.out.println("Enviando SMS (Prioridade)"+ this.nivelPrioridade + ") para " + this.numeroTelefone);
    }
    
    @Override
    public void registrarLog(){
        System.out.println("[LOG] SMS (" + "Prioridade" + this.nivelPrioridade + ") para" + this.numeroTelefone);
    }

    @Override
    public int obterNivelPrioridade(){
        return this.nivelPrioridade;
    }

    public void definirPrioridade(int nivel){
        if(nivel >=1 && nivel <=10){
            this.nivelPrioridade = nivel;
            System.out.println("Prioridade Redefinida: " + this.nivelPrioridade);

        }else {
            System.out.println("Nivel de Prioridade Invalido (1-10)");
        }
    }
}
