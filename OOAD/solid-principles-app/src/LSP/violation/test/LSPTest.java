package LSP.violation.test;

import LSP.violation.Rectangle;
import LSP.violation.Square;

public class LSPTest {
	public static void main(String args[]) {
		Rectangle rectangle = new Rectangle(100, 200);
		shouldNotChangeWidth_IfHeightIsModified(rectangle);
		
		Rectangle square = new Square(10);
		shouldNotChangeWidth_IfHeightIsModified(square);
	}
	
	public static void shouldNotChangeWidth_IfHeightIsModified(Rectangle rectangle) {
		int beforew = rectangle.getWidth();
		 rectangle.setHeight(rectangle.getHeight()+10);
		 int afterw = rectangle.getWidth();
		 System.out.println(beforew==afterw);
		
	}

}
