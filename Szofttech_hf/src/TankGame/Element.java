package TankGame;

import java.awt.Graphics;
import java.awt.Point;

abstract public class Element {
	protected Point position; // kirajzol�s pozici�ja
	protected double orientation; // orient�ci� megad�sa radi�nban
	protected double velocity; // elem mozg�s�nak sebess�ge

	public boolean deleteElement;
	
	protected Map map;

	abstract public void draw(Graphics g);

	abstract public void move(int T);

	public void rotate(double angle) {
		this.orientation = this.orientation + angle;
	}

	abstract public void collisionDetection();

}
