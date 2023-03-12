package Calculator;

public class Operations {

	public Operations() {
		
	}
	
	public String VLSM(String red,String typered, String IP, int number){
		String data = "";
		
		switch(red) {
			case "RED":data = red(typered,IP,number); break;
			case "PDV":data = pdv(typered,IP,number); break;
			case "PC#":data = pc(typered,IP,number); break;
			case "UDV":data = udv(typered,IP,number); break;
			case "Broadcast":data = broadcast(typered,IP,number); break;
		}
		
		return data;
		
	}
	
	public String FLSM(String red,String typered, String IP, int number){
		String data = "";
		/*
		switch(red) {
			case "RED":data = red(typered,IP,number); break;
			case "PDV":data = pdv(typered,IP,number); break;
			case "PC#":data = pc(typered,IP,number); break;
			case "UDV":data = udv(typered,IP,number); break;
			case "Broadcast":data = broadcast(typered,IP,number); break;
		}*/
		
		return data;
		
	}
	
	

	private String broadcast(String typered, String iP, int number) {
		String data = "";
		switch(typered) {
			case "LAN": break;
			case "WAN": break;
		}
		
		return data;
		
	}

	private String udv(String typered, String iP, int number) {
		String data = "";
		switch(typered) {
			case "LAN": break;
			case "WAN": break;
		}
		return data;
	}

	private String pc(String typered, String iP, int number) {
		String data = "";
		switch(typered) {
			case "LAN": break;
			case "WAN": break;
		}
		return data;
	}

	private String pdv(String typered, String iP, int number) {
		String data = "";
		switch(typered) {
			case "LAN": break;
			case "WAN": break;
		}
		return data;
	}

	private String red(String typered, String iP, int number) {
		String data = "";
		Red red = new Red();
		switch(typered) {
			case "LAN":
				
				data = red.LANVLSM(iP, number);
				
				break;
			case "WAN": 
				data = red.WANVLSM(iP, number);
				
				break;
		}
		
		return data;
		
	}

}
