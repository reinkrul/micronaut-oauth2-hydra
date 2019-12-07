package webshop;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.stream.Collectors;

@Controller("/")
public class Index {

    private InventoryClient client;

    public Index(InventoryClient client) {
        this.client = client;
    }

    @Get(processes = "text/plain")
    public String index() {
        return "Products in stock:\n" + client.list()
                .stream()
                .map(i -> " - " + i.name + ": " + i.count + "x")
                .collect(Collectors.joining("\n"));
    }
}
