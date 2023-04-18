package SalarioFinal;

public enum Genero {
   MASCULINO("Mascilino"),
   FEMININO("Feminino");
   
     protected String texto;

    private Genero() {
    }

    private Genero(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }



}
