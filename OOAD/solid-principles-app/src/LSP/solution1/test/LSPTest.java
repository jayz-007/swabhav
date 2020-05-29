package LSP.solution1.test;

import LSP.solution1.Quadrilateral;
import LSP.solution1.Rectangle;
import LSP.solution1.Square;

public class LSPTest {
	public static void main(String args[]) {
		Quadrilateral rectangle = new Rectangle(100,200);
		System.out.println(rectangle.calculateArea());
		
		Quadrilateral square = new Square(4);
		System.out.println(square.calculateArea());
	}

}
