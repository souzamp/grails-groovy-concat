package concat

class Categoria {

	String nome

	// Modificando o modo como a representa��o textual � gerada
	String toString() {
		this.nome
	}

	static constraints = {
		nome nullable:false, blank:false, maxSize:128, unique:true
	}
}
