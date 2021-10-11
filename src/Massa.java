public class Massa extends Lanche {
    // existem 3 tipos de lanches: sanduíche, massa e bolo
    // todas as massas têm o atributo molho
    private String molho;

    // Construtor da subclasse Massa
    public Massa() {
        super.setTempoPreparo(30);
    }

    // Getters e Setters da Lanche
    public String getMolho() {
        return molho;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }
}
