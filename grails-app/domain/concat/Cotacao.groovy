package concat

class Cotacao {

	BigDecimal valor
	Date data
	
	static belongsTo = [item:Item, moeda:Moeda, fornecedor:Fornecedor]
	
	static constraints = {
	}
}
