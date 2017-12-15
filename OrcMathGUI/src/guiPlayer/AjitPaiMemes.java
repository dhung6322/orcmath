package guiPlayer;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.AnimatedComponent;
import guiTeacher.components.Component;


public class AjitPaiMemes extends Component {

	private String title;
	private String description;

	public AjitPaiMemes(String title, String description) {
		super(40, 40, 25, 32);
		this.title = title;
		this.description = description;
		/* addSequence("resources/megaman.png", 100, 1, 42, 25, 32, 10);
		Thread animation = new Thread(this);
		animation.start(); (extends AnimatedComponent) */
		update();
	}
	
	public String toString() {
		return title + "," + description;
	}

	@Override
	public void update(Graphics2D g) {
		g.setColor(Color.yellow);
		g.fillRect(0, 0, getWidth(), getHeight()); 
		//super.update(g);
	}

}
