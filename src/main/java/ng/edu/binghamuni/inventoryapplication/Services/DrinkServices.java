package ng.edu.binghamuni.inventoryapplication.Services;

import ng.edu.binghamuni.inventoryapplication.domain.Drink;

import java.util.List;

public interface DrinkServices {


    Drink saveDrink(Drink drink);
    Drink getDrinkById(long id);
    List<Drink> getAllDrink();
    Drink updateDrinkById(Drink drink);
    void deleteDrinkById(long id);


}
