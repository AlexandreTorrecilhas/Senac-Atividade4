package atividade4;

    import atividade4.SuperClasseImposto;
    

public class Ipi extends SuperClasseImposto implements InterfaceImposto {
    
    double varValorProduto = 0;
    double varValorFrete = 0;
    double varValorSeguro = 0;
    double varDespesas = 0;
    double varAlicota = 0;
    
    public Ipi(double varValorProduto, double varValorFrete, double varValorSeguro, double varDespesas, double varAlicota){
        this.varValorProduto = varValorProduto;
        this.varValorFrete = varValorFrete;
        this.varValorSeguro = varValorSeguro;
        this.varDespesas = varDespesas;
        this.varAlicota = (varAlicota / this.CEM);
        this.setValorImposto();
    }
    
    public double getValorProduto(){
        return this.varValorProduto;
    }
    
    public double getValorFrete(){
        return this.varValorFrete;
    }

    public double getVarValorSeguro() {
        return this.varValorSeguro;
    }
    
    public double getVarDespesas() {
        return this.varDespesas;
    }
    
    public double getVarAlicota() {
        return varAlicota;
    }

    public void setVarValorSeguro(double varValorSeguro) {
        this.varValorSeguro = varValorSeguro;
    }

    public void setVarDespesas(double varDespesas) {
        this.varDespesas = varDespesas;
    }

    public void setVarAlicota(double varAlicota) {
        this.varAlicota = varAlicota;
    }
    
    
    
    @Override
    public void setValorImposto(){
        double varValorProduto = this.getValorProduto();
        double varValorFrete = this.getValorFrete();
        double varValorSeguro = this.getVarValorSeguro();
        double varDespesas = this.getVarDespesas();
        double varAlicota = this.getVarAlicota();
        
        this.varValorImposto = ((varValorProduto + varValorFrete + varValorSeguro + varDespesas) * varAlicota);
    }
    
    @Override
    public void imprimirImposto(){
        System.out.println("====================");
        System.out.println("Valor Produto: " + this.getValorProduto());
        System.out.println("Valor Frete: " + this.varValorFrete);
        System.out.println("Valor Seguro: " + this.getVarValorSeguro());
        System.out.println("Despesas: " + this.getVarDespesas());
        System.out.println("Alicota: " + (this.getVarAlicota() * this.CEM));
        System.out.println("====================");
    }
}
