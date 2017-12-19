package myStuff;

import guiTeacher.GUIApplication;

public class CatalogueMakerGui extends GUIApplication {

	public CatalogueMakerGui(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	@Override
	public void initScreen() {
		CatalogueScreen s = new CatalogueScreen(getWidth(),getHeight());
		setScreen(s);
	}

	public static void main(String[] args) {
		CatalogueMakerGui sample = new CatalogueMakerGui(800, 550);
		Thread go = new Thread(sample);
		go.start();
	}

}
