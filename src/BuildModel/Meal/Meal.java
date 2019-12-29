package BuildModel.Meal;

import BuildModel.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @ClassName: Meal
 * @DESCRIPT: TODO
 * @AUTHOR: cuizhichao
 * @DATA: 2019/12/29 2:54 PM
 **/
public class Meal {
    public List<Item> itemList = new ArrayList<>();

    public void addItem(Item item){
        itemList.add(item);
    }

    public float getCost(){
        AtomicReference<Float> cost = new AtomicReference<>(0.0f);
        itemList.forEach(f->{
            cost.updateAndGet(v -> new Float((float) (v + f.price())));
        });
        return cost.get();
    }

    public void showItems(){
        itemList.forEach(f->{
            System.out.println("Item:"+f.name());
            System.out.println("Packing:"+f.packing().pack());
            System.out.println("Price:"+f.price());
        });
    }

}
