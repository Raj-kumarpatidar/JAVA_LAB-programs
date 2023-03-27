public class week2_program6{
    public static void main(String[] args) {
        Box box = new Box(5.0, 4.0, 3.0);

        double volume = calculateVolume(box);

        System.out.println("The volume of the cuboid is: " + volume);
    }

    public static double calculateVolume(Box box) {
        double length = box.getLength();
        double width = box.getWidth();
        double height = box.getHeight();

        double volume = length * width * height;

        return volume;
    }
}

class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
