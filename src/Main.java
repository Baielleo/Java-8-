import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Programmer programmer =new Programmer();
        programmer.setName("Java");
        programmer.setDisignation("Backend");
        programmer.setCompanyName("PicsoftHouse");
        Dancer dancer=new Dancer();
        dancer.setName("kyrgyz");
        dancer.setDisignation("nassional");
        dancer.setGroupName("Nazyk");
        Singer singer=new Singer();
        singer.setName("Aya");
        singer.setDisignation("Roc");
        singer.setBandName("Gorod -312 ");
        System.out.println("Programmer name:"+programmer.getName()+"\n Disignation :"+programmer.getDisignation()
               +"\n CompanyName : " +programmer.getCompanyName()+"\n\n  Dencer name:"+dancer.getName()+"\n Disignation :"
                +dancer.getDisignation()+"\n GroupName :"+dancer.getGroupName()+"\n\n Singer name :"+
                singer.getName()+"\n Disignation :"+singer.getDisignation()+"\n BandName :"+singer.getBandName());

    }
}