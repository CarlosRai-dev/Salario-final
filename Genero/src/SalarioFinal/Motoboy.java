package SalarioFinal;

import java.time.LocalDate;

public class Motoboy extends Funcionario {

    private String placaDaMoto;

    public double getSalarioFinal() {

        return super.salarioBase;
    }

    public Motoboy() {
    }

    public Motoboy(String placaDaMoto, String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataAdmissao) {
        super(nome, cpf, rg, genero, salarioBase, dataAdmissao);
        this.placaDaMoto = placaDaMoto;
    }

    @Override
    public String toString() {
        return  "\n: "+this.placaDaMoto+
                "\n: "+super.nome+
                "\n: "+super.cpf +
                "\n: " +super.rg+
                "\n: "+super.genero.texto+
                "\n: "+ Util.formatBrl(salarioBase)+
                "\n: "+ Util.formatdate(dataAdmissao);
    }

   
    
    public String getPlacaDaMoto() {
        return placaDaMoto;
    }

    public void setPlacaDaMoto(String placaDaMoto) {
        this.placaDaMoto = placaDaMoto;
    }


}
