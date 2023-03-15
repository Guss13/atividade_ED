import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ListaSeq lista = new ListaSeq();

        if(!lista.cheia())
        {
            do{
                int pos = 1;
                System.out.printf("Digite o elemento %d da lista:%n", lista.tam() + 1);
                lista.insere(pos ,sc.nextInt());

                pos++;
            }while (!lista.cheia());
        }

        for(int i = 0; i < 5; i++)
        {
            System.out.printf("%dº: %d%n", i + 1,  lista.buscaValor(i + 1));
        }

        lista.insere(1, 90);
        lista.remove(4);

        if (!lista.vazia())
            System.out.println("A lista não está mais vazia");
        

        sc.close();
    }
}
