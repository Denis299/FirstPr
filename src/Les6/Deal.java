package Les6;


import java.util.Date;

public class Deal {
    long id;
    int price;
    Date dateCreated;
    boolean isConfirmed;
    Date dateConfirmed;
    String city;
    String counry;
    String type;

    public Deal(int price, Date dateCreated, boolean isConfirmed, Date dateConfirmed, String city, String counry, String type) {
        this.price = price;
        this.dateCreated = dateCreated;
        this.isConfirmed = isConfirmed;
        this.dateConfirmed = dateConfirmed;
        this.city = city;
        this.counry = counry;
        this.type = type;
    }

    public Deal() {
    }

    public void confirmDeal() {
        //write your code here
        isConfirmed=true;
        dateConfirmed = new Date();

    }

    public boolean checkPrice(int pr) {
        //write your code here
        if (pr>1000) {return true;}
        return false;
    }

    public boolean isValidType(String s) {
        //write your code here
        if ((s=="Bye")|(s=="Sale")) {return true;}
        return false;
    }
}
