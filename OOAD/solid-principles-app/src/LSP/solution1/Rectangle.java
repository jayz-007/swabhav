package LSP.solution1;

public class Rectangle extends Quadrilateral {
	private int height;
	private int width;

	public Rectangle(int height , int width) {
		this.height = height;
		this.width = width;
	}

	@Override
	public int calculateArea() {
		return (width * height);
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

}
