package ru.javabegin.springboot.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.javabegin.springboot.test.domain.Item;
import ru.javabegin.springboot.test.repository.ItemRepository;

@Component
public class MainController {

    @Autowired
    private ItemRepository itemRepository;
    
    public void showData(){
        for (Item item:itemRepository.findAll()) {
            System.out.println("item = " + item.getName());
            /*Item item2 = itemRepository.findOne(1L);
            item2.setName("asdasd");
            itemRepository.save(item2);*/
        }
    }

}
