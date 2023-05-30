import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        boolean fimDeSemana = false;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;

        //tabela verdade

        //operador && (AND)
        // true && true = true
        // true && false = false
        // false && true = false
        // false && false = false

        //Operador || (OR)
        // true || true = true
        // true || false = true
        // false || true = true
        // false || false = false


        System.out.println(vamosAPraia);

        String mensagem = fimDeSemana ? "É fim de Semana" : "Não é fim de semana";
        System.out.println(mensagem);

    }
}