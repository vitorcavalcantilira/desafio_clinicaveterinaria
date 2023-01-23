package modelos;

import modelos.enuns.EnumTipoAnimal;

import java.time.LocalDateTime;

public class Animal {
    private static int identificadorCount = 0;
    private int identificador;
    private String nome;
    private String raca;
    private String idade;
    private boolean estaDoente;
    private Dono dono;
    private String sintomas;
    private EnumTipoAnimal classe;
    private LocalDateTime dataHoraInternacao = null;
    private LocalDateTime dataHoraAlta = null;

    public Animal() {
        this.identificador = ++identificadorCount;
    }

    public Animal(String nome, Dono dono, String raca, String idade, boolean estaDoente, String sintomas, EnumTipoAnimal classe) {
        this.nome = nome;
        this.dono = dono;
        this.raca = raca;
        this.idade = idade;
        this.estaDoente = estaDoente;
        this.sintomas = sintomas;
        this.classe = classe;
    }

    public static int getIdentificadorCount() {
        return identificadorCount;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }

    public LocalDateTime getDataHoraInternacao() {
        return dataHoraInternacao;
    }

    public void setDataHoraInternacao(LocalDateTime dataHoraInternacao) {
        this.dataHoraInternacao = dataHoraInternacao;
    }

    public LocalDateTime getDataHoraAlta() {
        return dataHoraAlta;
    }

    public void setDataHoraAlta(LocalDateTime dataHoraAlta) {
        this.dataHoraAlta = dataHoraAlta;
    }

    public boolean estaDoente() {
        return estaDoente;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public boolean isEstaDoente() {
        return estaDoente;
    }

    public void setEstaDoente(boolean estaDoente) {
        this.estaDoente = estaDoente;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public EnumTipoAnimal getClasse() {
        return classe;
    }

    public void setClasse(EnumTipoAnimal classe) {
        this.classe = classe;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "identificador=" + identificador +
                ", classe=" + classe + '\'' +
                ", nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", dono=" + dono.toString() +
                ", idade='" + idade + '\'' +
                ", estaDoente=" + estaDoente +
                ", sintomas='" + sintomas + '\'' +
                ", dataHoraInternacao=" + dataHoraInternacao +
                ", dataHoraAlta=" + dataHoraAlta +
                '}';
    }
}