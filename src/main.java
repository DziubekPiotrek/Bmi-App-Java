import java.util.Scanner;
class Hello {
    public static void main(String[] args) {
        System.out.println("Welcome my Calculator Bmi");
        System.out.println("below 16.0 - starvation | \n" +
                "16.0 - 17.0 emaciation | 17-18.5 not serious\n | \n" +
                "18.5 - 25.0 correct value | \n" +
                "25.0 - 30.0 - overweight | 30.0 - 35.0 and the degree of obesity\n | 35.0 - 40.0 - II degree of obesity\n | over 40.0 - III degree of obesity (extreme obesity)");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Weight");
        int weight = scan.nextInt();
        System.out.println("Enter Your Height");
        double height = scan.nextDouble();
        double total = (weight / (height * height));
        System.out.println(total);
        }
}
