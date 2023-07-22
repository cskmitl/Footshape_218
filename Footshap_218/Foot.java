package Footshape_218;

public class Foot {
    public void draw(String shape) {
        if (shape.equalsIgnoreCase("ellipse")) {
            System.out.println("draw ellipse");
            // Insert ellipse drawing logic here
        } else if (shape.equalsIgnoreCase("rectangle")) {
            System.out.println("draw rectangle");
            // Insert rectangle drawing logic here
        } else {
            System.out.println("Invalid shape! Please choose 'ellipse' or 'rectangle'.");
        }
    }
}
