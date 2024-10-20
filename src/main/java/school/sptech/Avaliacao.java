package school.sptech;

public class Avaliacao {
    private String descricao;
    private Double qtdEstrelas;

    // Construtor vazio
    public Avaliacao() {}

    // Construtor com parâmetros
    public Avaliacao(String descricao, Double qtdEstrelas) {
        this.descricao = descricao;
        this.qtdEstrelas = qtdEstrelas;
    }

    // Getters e Setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getQtdEstrelas() {
        return qtdEstrelas;
    }

    public void setQtdEstrelas(Double qtdEstrelas) {
        this.qtdEstrelas = qtdEstrelas;
    }

    @Override
    public String toString() {
        return "Avaliacao: " + descricao + " | Estrelas: " + qtdEstrelas;
    }
}

