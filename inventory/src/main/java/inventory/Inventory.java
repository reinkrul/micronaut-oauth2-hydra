package inventory;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.List;

@Controller("/inventory")
public class Inventory {

    @Get
    public List<Item> list() {
        return List.of(
                new Item("Nails", 20000),
                new Item("Screws", 10000),
                new Item("Lumber 4x8", 40)
        );
    }

    public static class Item {
        public String name;
        public int count;

        public Item(String name, int count) {
            this.name = name;
            this.count = count;
        }
    }
}
