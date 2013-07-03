package chismografo

import com.google.gson.Gson;

import grails.plugin.gson.converters.GSON;
import io.iron.ironmq.Client

class MensajesController {

	Client ironMqClient;
	
	
    def index(String mensaje) {
		return ["mensaje":mensaje]
	}
	
	def enviar(String tit, String msg){
		Mensaje mensaje = new Mensaje(titulo:tit, mensaje: msg)
		enviaMensaje(mensaje)
		redirect (action: "index", params: ["mensaje":msg])
	}
		
	def enviaMensaje(Mensaje msg){
		print "enviando mensaje a cola: ${msg}"
		def queue = ironMqClient.queue("testqueue")
		def cadena = msg as GSON 
		cadena = cadena.toString()
		queue.push(cadena)
	}

}
