package application;

import lombok.Getter;
import lombok.Setter;

import lombok.AccessLevel;
@Getter
@Setter
public class NotificacaoEmail extends Notificacao implements Priorizavel, Arquivavel {
    private String destinatario;
    private String assunto;
    private String corpo;

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private int nivelPrioridade;

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private boolean estaArquivado;

    public NotificacaoEmail(String remetente, String destinatario, String assunto, String corpo, int prioridade){
        super(remetente);
        this.destinatario = destinatario;
        this.assunto = assunto;
        this.corpo = corpo;
        this.nivelPrioridade = prioridade;
    }

    @Override
    public void enviar(){
        System.out.println("Enviando E-Mail (Prioridade " + this.nivelPrioridade + ") para "+ this.destinatario);
    }

    @Override
    public void registrarLog(){
        System.out.println("[LOG] SMS (" + "Prioridade" + this.nivelPrioridade + ") para" + this.destinatario);
    }
    @Override
    public int obterNivelPrioridade(){
        return this.nivelPrioridade;
    }
    @Override
    public void definirPrioridade(int nivel){
        if(nivel >= 1 && nivel <= 10){
            this.nivelPrioridade = nivel;
            System.out.println("Prioridade redefinida para " + this.nivelPrioridade);
        }else{
            System.out.println("Nivel de Prioridade Invalido (1-10)");
        }
    }

    @Override
    public boolean estaArquivado(){
        return this.estaArquivado;
    }

    @Override
    public void Arquivar(){
        if(!this.estaArquivado){
            this.estaArquivado = true;
            System.out.println("Email arquivado");
        }else{
            System.out.println("Email já está arquivado");
        }
    }

    @Override
    public void desarquivar(){
        if(estaArquivado){
            this.estaArquivado = false;
            System.out.println("Email Desarquivado");
        }else{
            System.out.println("Email não está arquivado");
        }
    }
}
