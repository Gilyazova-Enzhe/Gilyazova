import java.io.*;

public class PointViewer {

	public static void main(String[] args) throws FileNotFoundException {

	Point point = new Point();
	point.getPoint();
	DistanceCalculator dc = new DistanceCalculator();
	System.out.println ("Distance is " + dc.calculate(point));
	}
	}