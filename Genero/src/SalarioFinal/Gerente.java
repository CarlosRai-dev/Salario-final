package SalarioFinal;

import java.time.LocalDate;

public class Gerente extends CargoDeConfianca {

    public Gerente(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataAdmissao) {
        super(bonificacao, nome, cpf, rg, genero, salarioBase, dataAdmissao);
    }

    @Override
    public String toString() {
        return  "\n: "+super.bonificacao+
                "\n: "+super.nome+
                "\n: "+super.cpf +
                "\n: " +super.rg+
                "\n: "+super.genero.texto+
                "\n: "+ Util.formatBrl(salarioBase)+
                "\n: "+ Util.formatBrl(getSalarioFinal(salarioBase))+
                "\n: "+ Util.formatdate(dataAdmissao);
    }

      public double getSalarioFinal() {
        double salarioFinal = 0;  
        salarioFinal += this.salarioBase * bonificacao.getValor();
        salarioFinal += this.salarioBase;
        
        return salarioFinal;
      }

    private double getSalarioFinal(double salarioBase) {

        double salarioFinal = 0;  
        salarioFinal += this.salarioBase * bonificacao.getValor();
        salarioFinal += this.salarioBase;
        
        return salarioFinal;
      }    }


   
    

