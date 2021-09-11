package demoAnnotation;

import java.util.List;

import org.springframework.stereotype.Component;


public class Triangle implements Shape {
	
	private List<Point> points;
	

	public List<Point> getPoints() {
		return points;
	}


	public void setPoints(List<Point> points) {
		this.points = points;
	}


	public void draw() {
		System.out.println("This is a triangle");
		for (Point point : points) {
			System.out.println("Point-"+(points.indexOf(point)+1)+"("+point.getPointX()+","+point.getPointY()+")");
		}
		
	}

}
