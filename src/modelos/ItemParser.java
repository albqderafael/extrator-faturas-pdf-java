package modelos;

public class ItemParser {
    public static AtributosFatura parseLinha(String linha) {

        AtributosFatura atributo = new AtributosFatura();

        // Pretendo dividir a String em duas partes
        // Antes de kWh: descricao = Parte 0
        // Depois de kWh: valores = Parte 1
        String[] partes = linha.split("kWh");

        String descricao = partes[0].trim();
        atributo.setDescricao(descricao);

        String valores = partes[1].trim();

        // IMPORTANTE:
        // valores[0] = quantidade
        // valores[1] = preço unitário
        // valores[2] = valor total
        // valores[3] = PIS/COFINS
        // valores[4] = base ICMS
        // valores[5] = ICMS (%)
        // valores[6] = valor ICMS
        // valores[7] = tarifa unitária
        String valoresSeparados[] = valores.split("\\s+");

        int quantidade = Integer.parseInt(valoresSeparados[0].replace(".",""));
        atributo.setQuantidade(quantidade);

        double precoUnitario = Double.parseDouble(valoresSeparados[1].replace(",","."));
        atributo.setPrecoUnitarioComTributos(precoUnitario);

        double valor = Double.parseDouble(valoresSeparados[2].replace(",","."));
        atributo.setValor(valor);

        double pis = Double.parseDouble(valoresSeparados[3].replace(",","."));
        atributo.setPisCofins(pis);

        double baseIcms = Double.parseDouble(valoresSeparados[4].replace(",","."));
        atributo.setBaseCalcIcms(baseIcms);

        double aliqIcms = Double.parseDouble(valoresSeparados[5].replace("%", "").replace(",","."));
        atributo.setAliquotaIcms(aliqIcms);

        double icms = Double.parseDouble(valoresSeparados[6].replace(",","."));
        atributo.setIcms(icms);

        double tarifa = Double.parseDouble(valoresSeparados[7].replace(",","."));
        atributo.setTarifaUnitaria(tarifa);

        return atributo;

    }
}
