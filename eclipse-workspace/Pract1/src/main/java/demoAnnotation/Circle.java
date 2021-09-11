package demoAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Circle implements Shape {
	
	private Point center;
	

	public Point getCenter() {
		return center;
	}

	@Autowired
	
	public void setCenter(Point center) {
		this.center = center;
	}


	public void draw() {
		System.out.println(" This is Circle (Center=(" + center.getPointX() + ","+center.getPointY()+"))");
	}


	@Override
	public String toString() {
		return " This is Circle (Center=(" + center.getPointX() + ","+center.getPointY()+")";
	}
	
}
