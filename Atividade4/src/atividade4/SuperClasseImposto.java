package atividade4;

public class SuperClasseImposto {
    protected String varNomeImposto = new String();
    protected double varValorImposto = 0;
    protected final double CEM = 100;
    
    public SuperClasseImposto(){
    
    };
    
    protected double getValorImposto(){
        return this.varValorImposto;
    }
}
