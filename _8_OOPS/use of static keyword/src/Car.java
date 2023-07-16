public class Car {
    String company;
    String model;
    int numberOfTyre;
    String color;
    int dof;
  private static int numberOfCars; //this will automatically get increased everytime we call car or create a new car;
        //iske liye static keyword use karna hota hai
    //without private use kiye hm isko change v kar  skte the bina new car bnaye ,,,isliye isko private kar diya aur access karne k lie
    //ek getter method bna denge
    public Car(){
        numberOfCars++;  //apun chahta hai ki jitne bar ek new car ki input le we apne aap +1 se update ho jaye
    }

    //construcuter;
    public Car(String company , String model , int numberOfTyre, String color, int dof){
        this.company=company;
        this.model=model;
        this.numberOfTyre=numberOfTyre;
        this.color=color;
        this.dof=dof;
        numberOfCars++;
    }
    public static int getNumberOfCars(){  //isme v static use karna hoga
        return numberOfCars;
    }

    //static :- used if we want to access a function in the class
    //className.function;
}
