import java.util.Arrays;

public class Sanduiche extends Lanche {
    // Controlar a quantidade de ingredientes no meu array
    private int contIngredientes=0; //1
    // Todos os lanches derivam da classe Lanche
    // Existem 3 tipos de lanches: sanduíche, massa e bolo
    // Sanduíche deve receber um vetor de até 10 ingredientes
    private String[] ingredientes=new String[10]; //ultimo elemento: lenght - 1 = 9

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    // Construtor da subclasse Sanduiche
    public Sanduiche(){
        super.setTempoPreparo(15);
    }

    public void setContIngredientes(int contIngredientes) {
        this.contIngredientes = contIngredientes;
    }

    public void adicionarIngrediente(String ingrediente) {
        // contIngredientes: próxima posição livre
        // do array ingredientes
        if(contIngredientes<ingredientes.length) {
            this.ingredientes[contIngredientes] = ingrediente;
            contIngredientes++;
        } else {
            System.out.println("Número máximo de ingredientes atingidos!");
        }
    }

        @Override
    public String toString() {
        // montar string de ingredientes para retorno do método
        String lanche="[ ";
        // percorrer o array de ingredientes
        // somente concatenar com a string lanche
        // quanto diferente de null
            for (String ingrediente : ingredientes) {
                if (ingrediente != null) {
                    lanche += ingrediente;
                    lanche += " ";
                }
            }
        lanche += "]";
        return lanche;
    }
}
