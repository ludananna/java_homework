package collection.partcatalogue;

import java.util.HashMap;
import java.util.Map;

public class Catalogue {

    public static void main(String[] args) {
        Part windscreenWiper = new Part("windscreenWiper", "Valeo", "Ni330");
        Part fuelFilter = new Part("fuelFilter", "Hengst", "JK35");
        Part antifreeze = new Part("Antifreeze", "FEBI", "N34H67");

        Map<String, Part> partMap = new HashMap<>();
        partMap.put(windscreenWiper.getNumber(), windscreenWiper);
        partMap.put(fuelFilter.getNumber(), fuelFilter);
        partMap.put(antifreeze.getNumber(), antifreeze);

        System.out.println("partMap = " + partMap);
        Part part = partMap.get(antifreeze.getNumber());
        System.out.println("part = " + part);

    }
}