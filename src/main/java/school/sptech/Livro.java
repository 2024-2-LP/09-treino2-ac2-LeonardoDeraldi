package school.sptech;

import school.sptech.exception.ArgumentoInvalidoException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private String autor;
    private java.time.LocalDate dataPublicacao;
    private final List<Avaliacao> avaliacoes;

    public Livro() {
        this.avaliacoes = new ArrayList<>();
    }

    public Livro(String titulo, String autor, java.time.LocalDate dataPublicacao) {
        this();
        this.titulo = titulo;
        this.autor = autor;
        this.dataPublicacao = dataPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void adicionarAvaliacao(String descricao, Double qtdEstrelas) {
        if (descricao == null || descricao.isBlank()) {
            throw new ArgumentoInvalidoException("Descrição inválida!");
        }
        if (qtdEstrelas == null || qtdEstrelas < 0 || qtdEstrelas > 5) {
            throw new ArgumentoInvalidoException("Quantidade de estrelas inválida!");
        }
        Avaliacao avaliacao = new Avaliacao(descricao, qtdEstrelas);
        this.avaliacoes.add(avaliacao);
    }

    public Double calcularMediaAvaliacoes() {
        if (avaliacoes.isEmpty()) {
            return 0.0;
        }
        double soma = 0;
        for (Avaliacao avaliacao : avaliacoes) {
            soma += avaliacao.getQtdEstrelas();
        }
        return soma / avaliacoes.size();
    }

    @Override
    public String toString() {
        return "Livro: " + titulo + " | Autor: " + autor + " | Publicado em: " + dataPublicacao
                + " | Avaliações: " + calcularMediaAvaliacoes();
    }
}