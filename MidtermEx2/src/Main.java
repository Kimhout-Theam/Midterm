// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    class Rectangle{
        private double width;

        private double length;
        public Rectangle(){
            length = 0;
            width = 0;
        }
        public Rectangle(double width, double length){

        };
        public double getArea(){
            return width * length;
        };
        public double getPerimeter(){
            return (width + length) * 2;
        };
    }
    class Square extends Rectangle{
        public Square(double side){
            super(side, side);

        };
    }
    public static void main(String[] args) {

    }
}