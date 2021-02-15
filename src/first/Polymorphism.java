package first;

class Vehicle {

    private String make;

    private String model;

    private int year;

public Vehicle(){}
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    void start(){
        System.out.println("starting");
    }
    void stop(){
        System.out.println("stopped");
    }
}


 class SUV extends Vehicle {

int tyre;

    public SUV(String make, String model,int year,int tyre) {

        super(make,model,year);
        this.tyre=tyre;



    }

    void start(){
        System.out.println(String.format("Starting for SUV vehicle Make=%s,model=%s, year=%d",getMake(),getModel(),getYear()));
    }
     void stop(){
         System.out.println(String.format("Stopping for SUV vehicle Make=%s,model=%s, year=%d",getMake(),getModel(),getYear()));
     }

}

 class Motorcycle extends Vehicle {



    public Motorcycle( String make, String model, int year) {

        super(make, model, year);



    }

    void start(){
        System.out.println(String.format("Starting for Motorcycle vehicle Make=%s,model=%s, year=%d",getMake(),getModel(),getYear()));
    }
    void stop(){
        System.out.println(String.format("Stopping for Motorcycle vehicle Make=%s,model=%s, year=%d",getMake(),getModel(),getYear()));
    }

}
public class Polymorphism {
    public static void main(String[] args) {
        Vehicle vehicle = new Motorcycle("harley", "123", 1904);

        vehicle.start();
        //Vehicle vehicle1=new SUV("sedan","123",1234);
       // vehicle1.start();

    }
}
