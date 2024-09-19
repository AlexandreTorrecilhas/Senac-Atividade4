package atividade4;

    import java.util.Scanner;
    import java.util.ArrayList;
    import atividade4.Pis;

public class Atividade4 {
    
    public static void main(String[] args) {
        ArrayList<Pis> listPis = new ArrayList<Pis>();
        Scanner teclado = new Scanner(System.in);
        double debito = 0;
        double credito = 0;
        
        System.out.print("Informe o valor do debito: ");
        debito = teclado.nextDouble();
        System.out.print("Informe o valor do credito: ");
        credito = teclado.nextDouble();
        
        Pis objPis = new Pis(debito, credito);
        listPis.add(objPis);
        listPis.get(0).imprimirImposto();
        
        
    }
    
}
