package it.unibo.ai.didattica.competition.tablut.fusco;

import java.io.IOException;
import java.net.UnknownHostException;

public class TablutRandomWhiteClientPROVASecondaVersione {
	
	public static void main(String[] args) throws UnknownHostException, ClassNotFoundException, IOException {
		String[] array = new String[]{"WHITE"};
		if (args.length>0){
			array = new String[]{"WHITE", args[0]};
		}
		TablutBiancoPROVASecondaVersione.main(array);
	}


}
