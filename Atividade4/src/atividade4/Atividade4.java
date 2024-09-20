package atividade4;

    import java.util.Scanner;
    import java.util.ArrayList;
    import atividade4.Pis;

public class Atividade4 {
    
    public static void imprimirPis(ArrayList<Pis> listaPis){
        for(int contador = 0; contador < listaPis.size(); contador++){
            listaPis.get(contador).imprimirImposto();
        }
    }
    
    public static void main(String[] args) {
        ArrayList<Pis> listaPis = new ArrayList<Pis>();
        Scanner teclado = new Scanner(System.in);
        String varResposta =  "n";
        int varOpcao = 0;
        double varTotalPis = 0;
        double varDebito = 0;
        double varCredito = 0;
        
        do{
            
            System.out.println("Selecione um imposto: ");
            System.out.println("1 - Pis");
            System.out.println("2 - ");
            
            System.out.print("R: " );
            varOpcao = teclado.nextInt();
            
            switch(varOpcao){
                case 1:
                    System.out.print("Informe o valor do debito: ");
                    varDebito = teclado.nextDouble();
                    System.out.print("Informe o valor do credito: ");
                    varCredito = teclado.nextDouble();
        
                    Pis objPis = new Pis(varDebito, varCredito);
                    varTotalPis += objPis.getValorImposto();
                    listaPis.add(objPis);
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Por favor, selecione uma opcao valida");
                    break;
            }
            
            System.out.print("Deseja informar um novo imposto [S/N]: ");
            varResposta = teclado.next();
        }while(varResposta.equalsIgnoreCase("s"));
        
        System.out.println("==========");
        System.out.println("PIS");
        System.out.println("==========");
        System.out.println("Valor Total: " + varTotalPis);
        imprimirPis(listaPis);
        
    }
    
}
