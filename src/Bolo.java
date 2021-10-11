public class Bolo extends Lanche {
    // existem 3 tipos de lanches: sanduíche, massa e bolo
    // O bolo tem os atributos massa, recheio e cobertura
    private String massa;
    private String recheio;
    private String cobertura;

    // Construtor da subclasse Bolo
    public Bolo() {
        super.setTempoPreparo(10);
    }

}
