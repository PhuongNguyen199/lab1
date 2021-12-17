public class Main {
    public static void main(String[] args) {
        //Calculator
        Calculator cal= new Calculator();
        System.out.println("Total: "+ cal.total(5,5));
        System.out.println("Subtraction: "+ cal.subtraction(5,5));
        System.out.println("Multiplication: "+ cal.multiplication(5,5));
        System.out.println("Division: "+ cal.division(5,5));

        //BMI
        double weight = 64;
        float  height = 1.72f;
        double totalBim=weight/(height*height);
        System.out.println("BMI = "+totalBim);

        Bmi.bmiVoid();

        Bmi bmi=new Bmi();
        System.out.println("BMI = "+bmi.bmiDouble(64,1.72));

        double weight = 64;
        float  height = 1.72f;
        double totalBim=weight/(height*height);
        System.out.println("BMI = "+totalBim);
    }
}
