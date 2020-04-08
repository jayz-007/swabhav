package unit.testcase.model;

public class Foo {
	@UnitTestCase
	public boolean m1() {
		return true;
	}

	public boolean m2() {
		return true;
	}

	@UnitTestCase
	public boolean m3() {
		return false;
	}

	@UnitTestCase
	public boolean m4() {
		return true;
	}

}
