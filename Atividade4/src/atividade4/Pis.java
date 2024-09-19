package atividade4;

public class Pis extends SuperClasseImposto implements InterfaceImposto {
    
    protected final String NOMEIMPOSTO = "Pis";
    protected double varDebito = 0;
    protected double varCredito = 0;
    protected final double TAXA = 0.0165;
    
    public Pis(double varDebito, double varCredito){
        this.varDebito = varDebito;
        this.varCredito = varCredito;
        this.setValorImposto();
    }
    
    public String getNOMEIMPOSTO(){
        return this.NOMEIMPOSTO;
    }
    
    public double getVarDebito(){
        return this.varDebito;
    }
    
    public double getVarCredito(){
        return this.varCredito;
    }
    
    public double getTAXA(){
        double varResultado = this.TAXA * this.CEM;
        return varResultado;
    }
    
    
    @Override
    public void setValorImposto(){
        
        double varDebito = this.getVarDebito();
        double varCredito = this.getVarCredito();
        double varTaxa = this.getTAXA();
        
        this.varValorImposto = (varDebito - varCredito) * varTaxa;
        
    };
    
    @Override
    public void imprimirImposto(){
        System.out.println("====================");
        System.out.println("Tipo: " + this.getNOMEIMPOSTO());
        System.out.println("Debito: " + this.getVarDebito());
        System.out.println("Credito: " + this.getVarCredito());
        System.out.println("Taxa: " + this.getTAXA());
        System.out.println("Valor do Imposto: " + this.getValorImposto());
    };
}
