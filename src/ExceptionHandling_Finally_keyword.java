public class ExceptionHandling_Finally_keyword {


    public static void main(String[] args) {
        ExceptionHandling_Finally_keyword etc = new ExceptionHandling_Finally_keyword();

        try {
            System.out.println("In try");
            int lo = etc.err(8, 0);
            System.out.println(lo);
        } finally {
            System.out.println("This is finally block");
        }

        System.out.println("out of block ");
    }
    static int err(int a, int b ) throws ArithmeticException{
        int f =  a/b;
        return f;

    }
}
