package myStuff;

import java.awt.Button;
import java.util.List;

import guiTeacher.components.*;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CatalogueScreen extends FullFunctionScreen {
	
	private TextField priceField;
	private TextField searchField;
	private Button add;

	public CatalogueScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		searchField = new TextField(40,40,200,30,"'Search'","'Off---White'");
		priceField = new TextField(40,80,200,30,"'Price'");
		viewObjects.add(searchField);
		viewObjects.add(priceField);
		add = new Button(40,120,100,100,"'Submit'", new Action() {
			@Override
			public void act() {
				System.out.println("'Submitted'");
			}
		}
		);
		viewObjects.add(add);
	}

}
