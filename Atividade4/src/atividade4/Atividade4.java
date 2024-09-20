package atividade4;

    import java.util.Scanner;
    import java.util.ArrayList;
    import atividade4.Pis;
    import atividade4.Ipi;

public class Atividade4 {
    
    public static void imprimirPis(ArrayList<Pis> listaPis){
        for(int contador = 0; contador < listaPis.size(); contador++){
            listaPis.get(contador).imprimirImposto();
        }
    }
    
    public static void main(String[] args) {
        ArrayList<Pis> listaPis = new ArrayList<Pis>();
        ArrayList<Ipi> listaIpi = new ArrayList<Ipi>();
        Scanner teclado = new Scanner(System.in);
        String varResposta =  "n";
        int varOpcao = 0;
        double varTotalPis = 0;
        double varTotalIpi = 0;
        double varDebito = 0;
        double varCredito = 0;
        double varValorProduto = 0;
        double varValorFrete = 0;
        double varValorSeguro = 0;
        double varDespesas = 0;
        double varAlicota = 0;
        
        do{
            
            System.out.println("Selecione um imposto: ");
            System.out.println("1 - Pis");
            System.out.println("2 - Ipi");
            
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
                    
                    System.out.print("Valor do produto: ");
                    varValorProduto = teclado.nextDouble();
                    System.out.print("Valor frete: ");
                    varValorFrete = teclado.nextDouble();
                    System.out.print("Valor seguro: ");
                    varValorSeguro = teclado.nextDouble();
                    System.out.print("Outras Despesas: ");
                    varDespesas = teclado.nextDouble();
                    System.out.print("Taxa Alicota: ");
                    varAlicota = teclado.nextDouble();

                    Ipi objIpi = new Ipi(varValorProduto, varValorFrete, varValorSeguro, varDespesas, varAlicota);
                    varTotalIpi += objIpi.getValorImposto();
                    listaIpi.add(objIpi);
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
