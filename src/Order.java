import java.util.ArrayList;
import java.util.Arrays;
import Tshirt.TShirt;
import Tshirt.order;


public class Order {

    public static void main(String[] args) {
        TShirt tshirt1 = new TShirt("Gorkhali Batman", 572, 1235, "Karuna", "Graphic text: You either die a hero or live long enough to see yourself be a villain", new String[]{"XL", "Medium", "Large"});
        TShirt tshirt2 = new TShirt("Goku", 681, 1780, "bragonball", "Graphic text: To get stronger you just overcome your limits by fighting someone stronger", new String[]{"Small", "Medium", "Large"});
        TShirt tshirt3 = new TShirt("Animal",500,5000,"Tseries","Graphic text: father are the best person in the world",new String[]{"Small","Medium","Large"});


        ArrayList<Integer> orderItems = new ArrayList<>(Arrays.asList(572, 681));
        ArrayList<Double> orderPrices = new ArrayList<>(Arrays.asList(1235.0, 1780.0));
        order order1 = new order("Gopal Sharma", "0486756465", orderItems, orderPrices);

        order1.generateBill();

//        System.out.println(tshirt1.describeTShirt());
//        System.out.println(tshirt2.describeTShirt());
    }
}