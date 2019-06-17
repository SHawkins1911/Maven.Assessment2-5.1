package rocks.zipcode.assessment2.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {

    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        Inventory inventory =new Inventory();

    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        Inventory inventory =new Inventory();

        inventory.put(1, item);
    }

    private void put(int i, String item) {

    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        Map<Integer, String> inventory = new HashMap<>();
                inventory.remove(1);
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        Map<Integer, String> inventory = new HashMap<>();
        inventory.put(1, item);

        return Collections.frequency(inventory.values(), item);
    }
}
