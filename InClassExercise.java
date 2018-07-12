import java.awt.Color;
import java.awt.Graphics;

public class InClassExercise {

	public static void main(String[] args) {
		DrawingPanel window = new DrawingPanel(400, 400);
		Graphics pen = window.getGraphics();
		pen.setColor(Color.GRAY);
		pen.fillOval(0, 0, 400, 400);
		pen.setColor(Color.yellow);
		pen.fillRect(100, 100, 50, 50);
		pen.fillRect(250, 100, 50, 50);
		pen.setColor(Color.red);
		pen.fillRoundRect(100, 250, 200, 20, 20, 20);

	}

}
