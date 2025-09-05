package val;

public class Validacao {
      private Validacao() {
        // Private constructor to prevent instantiation
    }

        public static boolean validarString(String nome) {
        if (nome != null && !nome.isEmpty()) {
            return true;
            // valido
        } else {
            System.out.println("sem nome (nulo ou vazio)");
            // não valido
            return false;
        }

    
    }


    public static boolean validarTelefone(String telefone) {
        if (telefone != null && !telefone.isEmpty()){
            return true;
        }

        else{
            System.out.println("numero de telefone invalido");
            // não valido
            return false;
        }
}
    
}
