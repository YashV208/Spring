package ObjInjection;

public class Point {
	private int pointx;
	private int pointy;

	public int getPointx() {
		return pointx;
	}

	public void setPointx(int pointx) {
		this.pointx = pointx;
	}

	public int getPointy() {
		return pointy;
	}

	public void setPointy(int pointy) {
		this.pointy = pointy;
	}

	@Override
	public String toString() {
		return "Point [pointx=" + pointx + ", pointy=" + pointy + "]";
	}

	
	
	
	

}
