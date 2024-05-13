/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.model;

import java.util.ArrayList;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Jason
 */
public class JsonClass {

    private ArrayList<Meals> mealsList;
    private String filePath = "meals.json";

    public JsonClass() {

        this.mealsList = new ArrayList<>();
    }

    public void appendJsonToFile(ArrayList<Meals> mealList) {
        JSONArray jsonArray = new JSONArray();

       
        JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader(filePath)) {
            Object obj = jsonParser.parse(reader);
            if (obj != null) {
                jsonArray = (JSONArray) obj;
            }
        } catch (IOException | ParseException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo JSON");
            e.printStackTrace();
        }
        for (Meals meal : mealList) {
    if (meal != null) { 
        JSONObject newObject = new JSONObject();
        newObject.put("idMeal", meal.getIdMeal());
        newObject.put("name", meal.getName());
        newObject.put("quantity", meal.getQuantity());
        newObject.put("price", meal.getPrice());

        if (!isDuplicate(jsonArray, meal.getIdMeal())) {
            jsonArray.add(newObject);
        } else {
            JOptionPane.showMessageDialog(null, "El producto con código de barras " + meal.getIdMeal() + " ya existe.");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Error: objeto Meals es nulo.");
    }
}
        try (FileWriter file = new FileWriter(filePath)) {
            file.write(jsonArray.toJSONString());
            file.flush();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al escribir en el archivo JSON");
            e.printStackTrace();
        }
    }
    public boolean isDuplicate(JSONArray jsonArray, String idMeal) {
        for (Object object : jsonArray) {
            JSONObject jsonObject = (JSONObject) object;
            if (idMeal.equals(jsonObject.get("idMeal"))) {
                return true; 
            }
        }
        return false;
    }

    public ArrayList<Meals> loadMealsFromJson() {
        ArrayList<Meals> meal = new ArrayList<>();
        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader(filePath)) {
            Object obj = parser.parse(reader);
            JSONArray jsonArray = (JSONArray) obj;

            for (Object object : jsonArray) {
                JSONObject jsonObject = (JSONObject) object;
                String idMeal = (String) jsonObject.get("idMeal");
                String name = (String) jsonObject.get("name");
                Object priceObject = jsonObject.get("price");
                double price = 0.0; 
                if (priceObject != null) {
                    try {
                        price = Double.parseDouble(priceObject.toString()); 
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                }

                Object quantityObject = jsonObject.get("quantity");
                int quantity = 0; 

                if (quantityObject != null) {
                    try {
                        quantity = ((Long) quantityObject).intValue();
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                }

                Meals meals = new Meals(idMeal, name , quantity, price);
                meal.add(meals);
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return meal;
    }

    public void saveLinkedListToJson(List linkedList) {
    JSONArray jsonArray = new JSONArray();
    Nodo current = linkedList.getCabeza();

    while (current != null) {
    JSONObject jsonObject = new JSONObject();
    Meals meal = current.getMeal();

    if (meal != null) { 
        jsonObject.put("idMeal", meal.getIdMeal());
        jsonObject.put("name", meal.getName());
        jsonObject.put("quantity", meal.getQuantity());
        jsonObject.put("price", meal.getPrice());

        jsonArray.add(jsonObject);
    } else {
        System.out.println("Warning: Found a null meal object in the linked list.");
    }

    current = current.getSiguiente();
}
    try (FileWriter file = new FileWriter(filePath)) {
        file.write(jsonArray.toJSONString());
        file.flush();
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error al escribir en el archivo JSON");
        e.printStackTrace();
    }
}


}
