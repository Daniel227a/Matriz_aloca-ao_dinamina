import java.util.ArrayList;
import java.util.Scanner;

public class Funçao
{
    Scanner teclado=new Scanner(System.in);
    public void criaMatriz(int linha,int coluna)
    {
        ArrayList<Integer>matLinha=new ArrayList<>();
        ArrayList<Integer>matClouna=new ArrayList<>();
        Integer matriz;
        for (int l=0;l<linha;l++)
        {
            matLinha.add(1);
            for (int c=0;c<coluna-1;c++)
            {
                matClouna.add(0);
            }
        }
        for (int l=0;l<linha;l++)
        {
          matriz=matClouna.get(l);
            System.out.print(matriz);
            for (int c=0;c<coluna-1;c++)
            {
                matriz=matLinha.get(c);
                System.out.print(" "+matriz+" ");
            }
            System.out.println();
        }
    }






}
