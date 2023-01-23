package modelos;

import modelos.enuns.EnumTamanhoCachorro;
import modelos.enuns.EnumTipoAnimal;

public class Cachorro extends Animal {

    private EnumTamanhoCachorro tamanho;
    private String corPelo;
    private boolean castrado;

    public Cachorro() {
        super();
    }

    public Cachorro(String nome, Dono dono, String raca, String idade, boolean estaDoente, String sintomas, EnumTipoAnimal tipo, EnumTamanhoCachorro tamanho, String corPelo, boolean castrado) {
        super(nome, dono, raca, idade, estaDoente, sintomas, tipo);
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    public boolean isCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }

    public EnumTamanhoCachorro getTamanho() {
        return tamanho;
    }

    public void setTamanho(EnumTamanhoCachorro tamanho) {
        this.tamanho = tamanho;
    }
}
