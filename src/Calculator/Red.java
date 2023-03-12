package Calculator;

public class Red {

	public Red() {
		// TODO Auto-generated constructor stub
	}
	
	public String LANVLSM(String iP, int number) {
		String data = "";
		String prefbd = prefijo(number);
		String[] pb = prefbd.split(",");
		int pref = Integer.parseInt(pb[0]);
		int bd = Integer.parseInt(pb[1]);
		
		data = "Prefijo: "+pref+" <br>";
		data += "Subred: "+iP+" <br>";
		
		data += PDV(iP, number, bd);
		data += PCL(iP, number, bd);
		data += UDVL(iP, number, bd);
		data += Broadcast(iP, number, bd);
		
		return data;
	}
	
	public String WANVLSM(String iP, int number) {
		String data = "";
		String prefbd = prefijo(number);
		String[] pb = prefbd.split(",");
		int pref = Integer.parseInt(pb[0]);
		int bd = Integer.parseInt(pb[1]);
		
		data = "Prefijo: "+pref+" <br>";
		data += "Subred: "+iP+" <br>";
		
		data += PDV(iP, number, bd);
		data += UDVW(iP, number, bd);
		data += Broadcast(iP, number, bd);
		
		return data;
	}
	
	private String prefijo(int number) {
		int pref = 8;
		int bd = 0;
		for(int i = 0; i < 8; i++) {
			if(number < Math.pow(2, i)) {
				bd = (int) ((Math.pow(2, i))-1);
				break;
			}
			System.out.println(Math.pow(2, i));
			pref--;
			
		}
		
		int prefijos = 24;
		prefijos += pref; 
		
		return prefijos+","+bd;
	}
	
	private String PDV(String iP, int number, int bd) {
		String[] ip = iP.split("\\.");
		int ip4 = Integer.parseInt(ip[3]) + 1;
		ip[3] = Integer.toString(ip4);
		
		return "PDV: "+ ip[0] + "." + ip[1] + "." + ip[2] + "." + ip[3]+" <br>";
	}
	
	private String PCL(String iP, int number, int bd) {
		String[] ip = iP.split("\\.");
		int ip4 = Integer.parseInt(ip[3]);
		ip4 = ip4+number-1;
		ip[3] = Integer.toString(ip4);
		
		return 	"PC"+(number-1)+": "+ ip[0] + "." + ip[1] + "." + ip[2] + "." + ip[3]+" <br>";

	}
	
	private String UDVL(String iP, int number, int bd) {
		String[] ip = iP.split("\\.");
		int ip4 = Integer.parseInt(ip[3]);
		ip4 = (ip4 + bd)-1;
		ip[3] = Integer.toString(ip4);
		
		return "UDV: "+ ip[0] + "." + ip[1] + "." + ip[2] + "." + ip[3] +" <br>";
	}
	
	private String Broadcast(String iP, int number, int bd) {
		String[] ip = iP.split("\\.");
		int ip4 = Integer.parseInt(ip[3]);
		ip4 = (ip4 + bd);
		ip[3] = Integer.toString(ip4);
		
		return 	"Broadcast: "+ ip[0] + "." + ip[1] + "." + ip[2] + "." + ip[3]+" <br>";

	}
	
	private String UDVW(String iP, int number, int bd) {
		String[] ip = iP.split("\\.");
		int ip4 = Integer.parseInt(ip[3]);
		ip4 += number;
		ip[3] = Integer.toString(ip4);
		
		return "UDV: "+ ip[0] + "." + ip[1] + "." + ip[2] + "." + ip[3] +" <br>";
	}

}
