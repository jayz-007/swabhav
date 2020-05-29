package LSP.solution1;

public class Square extends Quadrilateral {
	private int side;

	public Square(int side) {
		this.side = side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public int getSide(int side) {
		return side;
	}

	@Override
	public int calculateArea() {
		return (side * side);
	}

}
