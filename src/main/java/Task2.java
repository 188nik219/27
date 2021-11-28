public class Task2 {
    public static void main(String[] args) {
        IFunction comparison = (a, b) -> (a>b) ? a: (b>a)?b:0;
        int res = comparison.operation(95, 90);
        System.out.println(res);
    }
}
interface IFunction{
    int operation(int a, int b);
}