package Les6;

public class Car {
    int Price;
    int YearOfMake;
    String color;
    String OwnerName;
    double weiht;
    int horsePowers;

    public Car(int price, int yearOfMake, String ownerName, double weiht) {
        Price = price;
        YearOfMake = yearOfMake;
        OwnerName = ownerName;
        this.weiht = weiht;
    }
    void startRun(){
        System.out.println("I am running");
    }
    void stopRun(){
        System.out.println("I am stopping");
    }
    void changeOwner(String s){
        OwnerName = s;
    }

}
