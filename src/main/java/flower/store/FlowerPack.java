package flower.store;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class FlowerPack {
    private Flower flower;
    private int amount;


    public double getPrice() {
        return flower.getPrice() * amount;
    }
}
