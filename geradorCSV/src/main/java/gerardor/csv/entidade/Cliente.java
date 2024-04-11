package gerardor.csv.entidade;

import gerardor.csv.CSV.IncluiCSV;

import java.time.LocalDate;

public class Cliente {

    @IncluiCSV  private final Long codigo;
    @IncluiCSV  private final String nome;
    private final LocalDate dataNascimento;


    public Cliente(Long codigo, String nome, LocalDate dataNascimento) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public Long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
}
