package guiPlayer;

import java.util.ArrayList;
import java.util.Scanner;

public class CatalogueMaker {
	
	private ArrayList <AjitPaiMemes> list = new ArrayList<AjitPaiMemes>();

	public CatalogueMaker() {
		list.add(new AjitPaiMemes("Hitler Pai","Ajit in a black and white photo with the Nazi flags behind him"));
		list.add(new AjitPaiMemes("Who would win?","Everyone in America vs One Greedy boi"));
	}
	
	public String getCSVContent() {
		String data = "Title , Description\n";
		for(AjitPaiMemes t: list) {
			data += t + "\n";
		}
		return data;
	}
	
	public void addNewItem(String title, String description) {
		list.add(new AjitPaiMemes(title,description));
		System.out.println("New meme added to the database.");
	}

	public static void main(String[] args) {
		CatalogueMaker x = new CatalogueMaker();
		System.out.println(x.getCSVContent());
		Scanner in = new Scanner(System.in);
		
		System.out.println("Type the Title for your meme.");
		String title = in.nextLine();
		System.out.println("Type the description for the meme named " + "'" + title + "'");
		String description = in.nextLine();
		System.out.println("Yeah, fuck Ajit Pai");
	}
	

}
