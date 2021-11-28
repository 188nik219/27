public class Task1 {
    public static void main(String[] args) {
        IShape rectangle = (x, y, z) -> x*y;
        IShape triangle = (x, y, z) -> (int) (x*y*z/2);
        IShape circle = (x, y, z) -> (int) (x*x*3.14);
        int res= rectangle.getSquare(20, 30, 0);
        System.out.println(res);
        res = triangle.getSquare(80, 90, 0.6);
        System.out.println(res);
        res = circle.getSquare(90,0,0);
        System.out.println(res);

    }
}
interface IShape {
    int getSquare(int x, int y, double z);
}