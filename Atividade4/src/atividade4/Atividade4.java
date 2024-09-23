package atividade4;

    import java.util.Scanner;
    import java.util.ArrayList;
    import atividade4.Pis;
    import atividade4.Ipi;
    import atividade4.Pagamento;
    import atividade4.SuperClasseImposto;

public class Atividade4 {
    
    public static void imprimirDados(ArrayList<Pagamento> listaPagamento){
        
        ArrayList<Pis> listaPis = new ArrayList<Pis>();
        ArrayList<Ipi> listaIpi = new ArrayList<Ipi>();
        
        for(int contador = 0; contador < listaPagamento.size(); contador++){
            if(listaPagamento.get(contador).getObjSuperClasseImposto() instanceof Pis){
                listaPis.add((Pis) listaPagamento.get(contador).getObjSuperClasseImposto());
            }
            else{
                listaIpi.add((Ipi) listaPagamento.get(contador).getObjSuperClasseImposto());
            }
        }
        
        imprimirImpostos(listaPis, listaIpi);
        
    }
    
    public static void imprimirImpostos(ArrayList<Pis> listaPis, ArrayList<Ipi> listaIpi){
        
        System.out.println("============");
        System.out.println("Lista de PIS");
        System.out.println("============");
        for(Pis pis : listaPis){
            pis.imprimirImposto();
        }
        
        System.out.println("=========");
        System.out.println("Lista IPI");
        System.out.println("=========");
        for(Ipi ipi : listaIpi){
            ipi.imprimirImposto();
        }
    }
    
    public static void main(String[] args) {
        
        
        ArrayList<Pagamento> listaPagamento = new ArrayList<Pagamento>();
        Pagamento objPagamento = new Pagamento();
        Scanner teclado = new Scanner(System.in);
        String varResposta =  "n";
        String varNomeEmpresa = " ";
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
        
        System.out.print("Informe o nome da Empresa: ");
        varNomeEmpresa = teclado.nextLine();
        
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
                    objPagamento = new Pagamento(varNomeEmpresa, objPis);
                    listaPagamento.add(objPagamento);
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
                    objPagamento = new Pagamento(varNomeEmpresa, objIpi);
                    listaPagamento.add(objPagamento);
                    break;
                default:
                    System.out.println("Por favor, selecione uma opcao valida");
                    break;
            }
            
            System.out.print("Deseja informar um novo imposto [S/N]: ");
            varResposta = teclado.next();
        }while(varResposta.equalsIgnoreCase("s"));
        
        System.out.println("*******************************");
        System.out.println("Nome Empresa: " + listaPagamento.get(0).getVarNomeEmpresa());
        System.out.println("*******************************");
        
        System.out.println("===");
        System.out.println("PIS");
        System.out.println("===");
        System.out.println("Valor Total Pis: " + varTotalPis);

        System.out.println("===");
        System.out.println("IPI");
        System.out.println("===");
        System.out.println("Valor Total Ipi: " + varTotalIpi);

        imprimirDados(listaPagamento);
    }
    
}
