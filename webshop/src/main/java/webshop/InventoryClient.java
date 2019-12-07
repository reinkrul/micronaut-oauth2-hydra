package webshop;

import com.fasterxml.jackson.annotation.JsonCreator;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

import java.util.List;

@Client("http://inventory:8080/inventory")
public interface InventoryClient {

    @Get
    List<Item> list();

    class Item {
        public String name;
        public int count;
    }
}
