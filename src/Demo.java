import java.util.ArrayList;
import java.util.Collections;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Cart> carts = new ArrayList<>();
        carts.add(new Cart("Warenkorb 1", 2, 15, 510));
        carts.add(new Cart("Warenkorb 2", 4, 11, 180));
        carts.add(new Cart("Warenkorb 3", 6, 26, 1230));

        System.out.println("Unsortiert \n"+carts);

        Collections.sort(carts);

        System.out.println("Sortiert \n"+carts);
    }
}
