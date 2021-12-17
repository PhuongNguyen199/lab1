public class Bmi {


    public static void bmiVoid(){
        System.out.println("BMI = "+ 64/(1.72*1.72));
    }

    public double bmiDouble( double weight, double height){
        return weight/(height*height);
    }
}
