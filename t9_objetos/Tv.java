package t9_objetos;

import java.util.Scanner;

public class Tv {

		Scanner input = new Scanner(System.in);
		
		private int channel;
		private int volumen;
		private boolean on;
		static int numero;
		
		public int getChannel() {
			return channel;
		}
		public void setChannel(int channel) {
			this.channel = channel;
		}
		public int getVolumen() {
			return volumen;
		}
		public void setVolumen(int volumen) {
			this.volumen = volumen;
		}
		public boolean isOn() {
			return on;
		}
		public void setOn(boolean on) {
			this.on = on;
		}
		public static int getNumero() {
			return numero;
		}
		public static void setNumero(int numero) {
			Tv.numero = numero;
		}
		
		void channelUp (int canal){ this.channel=canal++;}
		
		void channelDown (int canal) { this.channel=canal; canal--;}
		
		void volumenUp (int vol) {this.volumen= vol; vol++;}
		
		void volumenDown (int vol) {this.volumen=vol; vol--;}
		
		
		
		Tv (int canal, int volumen, boolean on){}



	
	}


	
	
	

