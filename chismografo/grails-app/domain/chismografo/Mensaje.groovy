package chismografo

class Mensaje {

	String titulo
	String mensaje
	
    static constraints = {
			mensaje nullable:false
			titulo nullable:true
    }

	public String toString(){
		return "t: ${titulo}, msg:${mensaje}"
	}
					
}
