import java.awt.Color;
import java.awt.Graphics;

public class GraphicTesting {

	public static final int width= 800, height = 800;
	public static void main(String[] args) {
		DrawingPanel window = new DrawingPanel(width, height); 
		Graphics pen = window.getGraphics();
		//drawingSomething(pen);
		drawGraphPaper(pen, 40);
		drawCircle(window,pen, 40);
	}		
	public static void drawingSomething ( Graphics pen) {
		pen.drawLine(50, 50, 600, 600);
		pen.setColor(Color.pink);
		//pen.drawRect(600, 600, 100, 100);
		pen.fillRect(600, 600, 100, 100);
		pen.setColor(Color.GRAY);
		pen.fillOval(600, 600, 100, 100);
	}
	public static void drawGraphPaper(Graphics pen, int step) {
		pen.setColor(Color.PINK);
		for (int x1=40; x1 <=width; x1= x1 + step) {
			pen.drawLine(x1, 0, x1, height);
		}
		pen.setColor(Color.black);
		for (int y1=40; y1 <=width; y1= y1 + step) {
			pen.drawLine(0, y1, width, y1);
		}
	}
	public static void drawCircle (DrawingPanel window, Graphics pen, int step) {
		for (int x= 0; x<width; x= x+step) {
			for (int y=0; y< height; y=y+step) {
				pen.setColor(Color.gray);
				pen.drawOval(x, y, step, step);
			}
		window.sleep(50);
		}
	}	
}
