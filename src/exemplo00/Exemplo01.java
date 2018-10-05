package exemplo00;

import java.util.HashMap;

/**
 * @author Gabriel de Oliveira Ferreira
 */
public class Exemplo01 {

    public static void main(String[] args) {
        
        HashMap<String, Integer> idades= new HashMap<>();
        idades.put("Cleiton", 22);
        idades.put("Kleyton", 24);
        
        if (idades.containsKey("Kreyton")) {
            System.out.println("TEM KREYTON AQUI");
        }else{
            System.out.println("NÃO TEM KREYTON AQUI");
        }
        
        int idade = idades.get("Kleyton");
        System.out.println("Idade do Kleyton: " + idade);
        
        // put altera o valor da chave
        idades.put("Kleyton", 27);
    }
}
