package chismografo

import io.iron.ironmq.Client

class MensajesController {

	Client ironMqClient;
	
    def index() {
			
			if (request.getMethod()?.equalsIgnoreCase("post")){
				return doPost()	
			}else{
				return doGet()
			}			
		}
		
		def doPost(){
			def queue = ironMqClient.queue("testqueue")
			queue.push("Hello World!!!!")
			
			return ["mensaje":"Mensaje Enviado!!!"]
		}
		
		def doGet(){
			return ["mensaje":"Perverso!!!!"]
		}
		
}
