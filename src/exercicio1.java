public class exercicio1 {
    public static void main(String[] args){
        Carro carro1 = new Carro("Cobalt", "ABC8764", 2024);

        carro1.exibirCarro();

        System.out.println("\n\nVeículo cadastrado:");
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Placa: " + carro1.getPlaca());
        System.out.println("Ano: " + carro1.getAno());


    }
}
