package zadanieDecorator;

import java.util.HashSet;
import java.util.Set;

public class LargeDrinkDecorator implements MealSet{

    private MealSet set;

    public LargeDrinkDecorator (MealSet set){
        this.set = set;

    }
    @Override
    public Set<SetParts> getParts(){
        Set <SetParts> parts = new HashSet<>(this.set.getParts());
        parts.add(SetParts.LARGE_DRINK);
        return parts;

    }
    @Override
    public double getPrice(){
        return this.set.getPrice() + 2d; // zwiekszanie ceny o 2 zl
    }

}
