package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import model.Product;

public class ProductsListReader {

    public static List<Product> read(String filename) {
        List<Product> list = new ArrayList<>();
        try {
            BufferedReader buffer = new BufferedReader(new FileReader(new File(filename)));
            String line;
            while ((line = buffer.readLine()) != null) {
                list.add(ProductBuilder.build(line));
            }
        } catch (IOException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
        return list;
    }
}
