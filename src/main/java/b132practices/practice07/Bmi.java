package b132practices.practice07;

import java.text.DecimalFormat;

public class Bmi {
    private double weight;
    private double height;

   public Bmi(double weight,double height){
       this.height=height;
       this.weight=weight;
   }
    public void calculateBmi(){
       double bmi=weight/(height*height);
        DecimalFormat decimalFormat=new DecimalFormat(".00");
        System.out.println("BMI: "+decimalFormat.format(bmi));
       if(bmi<18.5){
           System.out.println("Underweight");
       }else if(bmi>=18.5&&bmi<25){
            System.out.println("Normal weight");
        }else if(bmi>=25&&bmi<30){
            System.out.println("Overweight");
        }else if(bmi>=30){
            System.out.println("Obez");
        }
   }

    @Override
    public String toString() {
        return "Bmi{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
