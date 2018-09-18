
public class Rectangle {
	private int width, length;

	public Rectangle(int a, int b) {
		this.width = a;
		this.length = b;
	}

	public void SayHello() {
		System.out.println("Ich bin " + width + " breit und " + length + " lang");
	}

	public int getWidth() {
		return width;
	}

	public int getLength() {
		return length;
	}

	public void setWidth(int a) {
		this.width = a;
	}

	public void setLength(int b) {
		this.length = b;
	}

	public int getArea() {
		return width * length;
	}

	public int getCircumference() {
		return 2 * width + 2 * length;
	}
}
