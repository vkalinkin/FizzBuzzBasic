public class fizzBuzzBasic {
    public static void main(String[] args) {
        int startValue = 1;
        int endValue = 100;
        fizzBuzzBasic run = new fizzBuzzBasic();
        run.fizzBuzz(startValue, endValue);
    }
    public void fizzBuzz (int start, int end){
        int i = start;
        for (int a = i; a < (end + 1); a++){
            if ((a%3 == 0) && (a%5 == 0)){
                System.out.println("Fizz Buzz");
            } else if (a%3 == 0){
                System.out.println("Fizz");
            } else if (a%5 == 0){
                System.out.println("Buzz");
            } else
                System.out.println(a);
        }
    }
}
