package file;

import Model.Product;
import Model.Prospect;

public class ProductBuilder {

    public static Product build (String line) {
        int firtsComa = line.indexOf(";");
        int secondComa = line.lastIndexOf(";");
        String name = line.substring(0, firtsComa);
        float price = Float.valueOf(line.substring(firtsComa+1, secondComa));
        String prospe = line.substring(secondComa+2);
        
        //Redondear el precio a dos decimales
        double priceRound = price*Math.pow(10, 2);
        priceRound = Math.round(priceRound);
        priceRound = priceRound/Math.pow(10, 2);
        
        return new Product(name, priceRound, new Prospect(prospe));
    }
}
