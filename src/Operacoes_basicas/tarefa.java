package Operacoes_basicas;

public class tarefa {
    private String descricao;
public tarefa (String descricao){
this.descricao = descricao;
}
    public String getDescricao() {
        return descricao;
    }
    @Override
    public String toString() {
        return "tarefa{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
