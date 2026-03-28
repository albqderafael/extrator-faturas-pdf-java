package modelos;

public class AtributosFatura {
    private String descricao;
    private String unidade;
    private int quantidade;
    private double precoUnitarioComTributos;
    private double valor;
    private double pisCofins;
    private double baseCalcIcms;
    private double aliquotaIcms;
    private double icms;
    private double tarifaUnitaria;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPisCofins() {
        return pisCofins;
    }

    public void setPisCofins(double pisCofins) {
        this.pisCofins = pisCofins;
    }

    public double getBaseCalcIcms() {
        return baseCalcIcms;
    }

    public void setBaseCalcIcms(double baseCalcIcms) {
        this.baseCalcIcms = baseCalcIcms;
    }

    public double getAliquotaIcms() {
        return aliquotaIcms;
    }

    public void setAliquotaIcms(double aliquotaIcms) {
        this.aliquotaIcms = aliquotaIcms;
    }

    public double getIcms() {
        return icms;
    }

    public void setIcms(double icms) {
        this.icms = icms;
    }

    public double getTarifaUnitaria() {
        return tarifaUnitaria;
    }

    public void setTarifaUnitaria(double tarifaUnitaria) {
        this.tarifaUnitaria = tarifaUnitaria;
    }

    public double getPrecoUnitarioComTributos() {
        return precoUnitarioComTributos;
    }

    public void setPrecoUnitarioComTributos(double precoUnitarioComTributos) {
        this.precoUnitarioComTributos = precoUnitarioComTributos;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
