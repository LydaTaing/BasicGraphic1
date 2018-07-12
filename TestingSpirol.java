import java.awt.Color;
import java.awt.Graphics;

public class TestingSpirol {
	public static final int height= 800, width =800;
	

	public static void main(String[] args) {
		DrawingPanel window = new DrawingPanel(width, height); 
		Graphics pen = window.getGraphics();
		int step = 40;
		drawTriangle( window,  pen, step);
		drawline(window,  pen, step);
	}
	
	public static void drawTriangle(DrawingPanel window, Graphics pen, int step) {
		pen.setColor(Color.PINK);
		pen.drawLine(0, 0, width/2 , height);
		pen.drawLine( width/2 , height, width, 0);
		
	}
	
	public static void drawline (DrawingPanel window, Graphics pen, int step) {
		for (int y=0; y< height; y= y+step) {
			for (int line=0; line < hieght; line++) {
				
				
			}

		}
	}
		
		
	
}
