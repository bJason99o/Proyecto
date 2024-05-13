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

        // Leer el contenido actual del archivo y agregarlo al jsonArray si existe
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

        // Agregar los nuevos objetos JSON al jsonArray con detección de duplicados
        for (Meals meal : mealList) {
    if (meal != null) { // Verificar si meal no es null
        JSONObject newObject = new JSONObject();
        newObject.put("idMeal", meal.getIdMeal());
        newObject.put("name", meal.getName());
        newObject.put("quantity", meal.getQuantity());
        newObject.put("price", meal.getPrice());

        // Detección de duplicados
        if (!isDuplicate(jsonArray, meal.getIdMeal())) {
            jsonArray.add(newObject);
        } else {
            JOptionPane.showMessageDialog(null, "El producto con código de barras " + meal.getIdMeal() + " ya existe.");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Error: objeto Meals es nulo.");
    }
}

        // Escribir el jsonArray al archivo JSON
        try (FileWriter file = new FileWriter(filePath)) {
            file.write(jsonArray.toJSONString());
            file.flush();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al escribir en el archivo JSON");
            e.printStackTrace();
        }
    }

// Método para verificar si un código de barras ya existe en el jsonArray
    public boolean isDuplicate(JSONArray jsonArray, String idMeal) {
        for (Object object : jsonArray) {
            JSONObject jsonObject = (JSONObject) object;
            if (idMeal.equals(jsonObject.get("idMeal"))) {
                return true; // Encontrado duplicado
            }
        }
        return false; // No encontrado duplicado
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

                // Verificar si el campo "price" está presente y no es null
                Object priceObject = jsonObject.get("price");
                double price = 0.0; // Valor por defecto si no se puede obtener el precio correctamente
                if (priceObject != null) {
                    try {
                        price = Double.parseDouble(priceObject.toString()); // Convertir el objeto a cadena y luego a double
                    } catch (NumberFormatException e) {
                        // Manejo de excepción si el valor no es un número válido
                        e.printStackTrace();
                    }
                }

                Object quantityObject = jsonObject.get("quantity");
                int quantity = 0; // Valor por defecto si no se puede obtener el precio correctamente

                if (quantityObject != null) {
                    try {
                        quantity = ((Long) quantityObject).intValue(); // Convertir Long a int
                    } catch (NumberFormatException e) {
                        // Manejo de excepción si el valor no es un número válido
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

    if (meal != null) { // Verificar si meal no es null
        jsonObject.put("idMeal", meal.getIdMeal());
        jsonObject.put("name", meal.getName());
        jsonObject.put("quantity", meal.getQuantity());
        jsonObject.put("price", meal.getPrice());

        jsonArray.add(jsonObject);
    } else {
        // Manejo de casos donde meal es nulo, como lanzar una excepción o imprimir un mensaje de advertencia
        System.out.println("Warning: Found a null meal object in the linked list.");
    }

    current = current.getSiguiente();
}


    // Escribir el jsonArray al archivo JSON
    try (FileWriter file = new FileWriter(filePath)) {
        file.write(jsonArray.toJSONString());
        file.flush();
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error al escribir en el archivo JSON");
        e.printStackTrace();
    }
}


}
