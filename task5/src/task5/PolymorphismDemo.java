package task5;

public class PolymorphismDemo {
	public static void main(String[] args) {
		displayObject(new Circle(1,"red", false));
		displayObject(new Rectangle(1,1,"b1ack", true));}

		public static void displayObject(GeometricObject object){
		System.out.println("created on " + object.getDateCreated() +
		". color is " +object.getColor());}

}
