
package SalarioFinal;

import java.time.LocalDate;
import java.time.Month;


public class Main {
    public static void main(String[] args) {
       
        Motoboy motoboy = new Motoboy("bkd1853", "carlos", "000.000.000-00", "00.000.000.00", Genero.MASCULINO, 3250, LocalDate.of(2004, Month.SEPTEMBER, 21));
    
        Gerente gerente = new Gerente(Bonificacao.GERENTE, "Ricardo", "000.000.000-00", "00.000.000.00", Genero.MASCULINO, 8500, LocalDate.of(1985, Month.MARCH, 21));
         
        Diretor diretor = new Diretor(Bonificacao.DIRETOR, "Josefa", "000.000.000-12", "00.000.000-000", Genero.FEMININO, 9600, LocalDate.of(1972, Month.MAY, 10));
       
        System.out.println(motoboy.toString());
        
        System.out.println(gerente.toString());
    
        System.out.println(diretor.toString());
    }
 
}
