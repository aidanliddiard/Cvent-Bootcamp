package org.example;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Asset> assets = new ArrayList<>();
            assets.add(new Vehicle("my car", "2022", 7500, "Matrix", 4, 235000));
            assets.add(new House("parent's house", "1998", 300000, "890 SW funny road", 2, 2000, 5000));
            assets.add(new House("lake house", "2018", 450000, "lake st", 4, 1500, 7000));

    for (Asset asset : assets) {
        System.out.println("Description: " + asset.getDescription());
        System.out.println(asset.getDateAcquired());
        System.out.println(asset.getOriginalCost());
        System.out.println(asset.getValue());

        if (asset instanceof House) {
            System.out.println(((House) asset).getAddress());
        }
        if (asset instanceof Vehicle) {
            System.out.println(((Vehicle) asset).getMakeModel());
        }
    }
    }
}