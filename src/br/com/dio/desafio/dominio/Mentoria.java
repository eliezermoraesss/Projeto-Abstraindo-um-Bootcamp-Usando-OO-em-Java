package br.com.dio.desafio.dominio;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Mentoria extends Conteudo{

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + sdf.format(data) +
                '}';
    }
}
