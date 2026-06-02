import java.util.ArrayList;

public class exercicio2 {
    public static void main(String[] args){
        ArrayList<Contato> contatos = new ArrayList<>();

        contatos.add(new Contato("João", "(21) 97483-3799"));
        contatos.add(new Contato("Maria", "(21) 99799-1408"));
        contatos.add(new Contato("Karla", "(21) 97521-0952"));

        System.out.println("Lista de contatos:");
        int indice = 1;
        for (Contato contato : contatos) {
            System.out.printf("\n%d. %s - %s", indice++, contato.getNome(), contato.getTelefone());
        }

    }
}
