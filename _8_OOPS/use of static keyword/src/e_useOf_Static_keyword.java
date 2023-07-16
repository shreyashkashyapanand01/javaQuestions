public class e_useOf_Static_keyword {
    public static void main(String[] args) {

        Car car= new Car("mahindra","scorpio",4,"black",111);
        System.out.println(car.getNumberOfCars()); //note it
        Car car1= new Car("mahindra","scorpio",4,"black",111);
        System.out.println(car.getNumberOfCars()); //note it
        Car car2= new Car("mahindra","scorpio",4,"black",111);
        System.out.println(car.getNumberOfCars()); //note it
        Car car3= new Car("mahindra","scorpio",4,"black",111);
        System.out.println(car.getNumberOfCars()); //note it



        Car c1 = new Car();
        c1.company="Tata";
        System.out.println("-->"+Car.getNumberOfCars());
//
//        Car.numberOfCars+=10000;
        System.out.println("new = "+Car.getNumberOfCars());
        //note :- yaha pe hm isko change v kar skte hai bina koi new car bnaye
        //so it'll be a problem
        //isliye hm Car.java class me jake numberOfCars ko private kar denge aur ek getter method likh denge
        //intelligent hai hm

    }
}