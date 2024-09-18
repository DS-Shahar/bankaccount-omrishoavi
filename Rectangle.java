package cyber;

public class Rectangle {
	
	private int length;
	private int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public int calcArea() {
		return length*width;
	}
	
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
		
	}

	public int calcPerimeter() {
		return length*2 + width*2;
	}
	
	public void scale(int factor) {
		length *= factor;
		width *= factor;
	}
	
	public void draw() {
		for (int i=0;i<length;i++) {
			for (int j=0;j<width;j++) {
				System.out.print('X');
			}
			System.out.println(' ');
		}
		System.out.println(' ');
	}
}
