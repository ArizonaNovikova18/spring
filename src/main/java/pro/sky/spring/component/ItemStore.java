package pro.sky.spring.component;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import pro.sky.spring.model.Item;

import java.util.HashMap;
import java.util.Map;

@Component
public class ItemStore {
    private final Map<Integer, Item> itemMap = new HashMap<>();

    @PostConstruct
    public void init(){
        int idCounter = 1;
        itemMap.put(idCounter, new Item(idCounter++, "Ноутбук"));
        itemMap.put(idCounter, new Item(idCounter++, "Смартфон"));
        itemMap.put(idCounter, new Item(idCounter++, "Принтер"));
    }

    public Item get(int id){
        return itemMap.get(id);
    }
}
