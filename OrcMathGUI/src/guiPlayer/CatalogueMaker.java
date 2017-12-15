package guiPlayer;

import java.util.ArrayList;

public class CatalogueMaker {
	
	private ArrayList <AjitPaiMemes> list = new ArrayList<AjitPaiMemes>();

	public CatalogueMaker() {
		list.add(new AjitPaiMemes("Hitler Pai","Ajit in a black and white photo with the Nazi flags behind him"));
		list.add(new AjitPaiMemes("Who would win?","Everyone in America vs One Greedy boi"));
	}
	
	public String getCSVContent() {
		String data = "title,description\n";
		for(AjitPaiMemes t: list) {
			data += t + "\n";
		}
		return data;
	}

	public static void main(String[] args) {
		
	}

}
