package chismografo

class Mensaje {

		String titulo
		String mensaje
	
    static constraints = {
			mensaje nullable:false
			titulo nullable:true
    }
				
}
