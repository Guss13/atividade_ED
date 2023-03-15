public class ListaSeq {
    private int dados[];
    private int tamA;
    private int tamM;


    public  ListaSeq()
    {
        tamM = 5;
        tamA = 0;
        dados = new int[tamM];
    }

    public boolean vazia()
    {
        if (tamA == 0)
            return true;
        else
            return false;
    }

    public boolean cheia()
    {
        if (tamA == tamM)
            return true;
        else
            return false;
    }

    public int tam()
    {
        return tamA;
    }

    public int buscaValor(int pos)
    {
        int dado;

        if ((pos > tamA) || (pos <= 0))
            return -1;

        dado = dados[pos - 1];
        return dado;
    }

    public int buscaPosicao(int dado)
    {
        for (int i = 0; i < tamA; i++)
        {
            if (dados[i] == dado){
                return (i + 1);
            }
        }
        return -1;
    }

    public boolean insere(int pos, int dado){
        if (cheia() || (pos > tamA + 1) || (pos <= 0)){
            return false;
        }

        for (int i = tamA; i >= pos; i--){
            dados[i] = dados[i-1];
        }

        dados[pos - 1] = dado;
        tamA++;
        return true;
    }

    public int remove(int pos){
        int dado;
        if ((pos > tamA) || (pos < 1 ))
        {
            return -1;
        }
        dado = dados[pos-1];

        for (int i = pos - 1; i < tamA - 1; i++)
        {
            dados[i] = dados[i+1];
        }

        tamA--;
        return dado;
    }
}
