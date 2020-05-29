package LSP.violation;

public class Square extends Rectangle {

	public Square(int side) {
		super(side, side);
	}

	@Override
	public void setHeight(int height) {
		this.height = width = height;
	}

	@Override
	public void setWidth(int width) {
		height = this.width = width;
	}

}
