import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Meals {
    private ArrayList<String> meals = new ArrayList<String>();
    private final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("今天吃什么呢？");
        new Meals().printMeal();
    }

    private void printMeal() {
        String meal = getMeal();
        System.out.print("How about "+ meal);
    }

    public Meals(){
        meals.add("KFC");
        meals.add("Hungary Jacks");
        meals.add("麻辣烫");
        meals.add("火锅");
        meals.add("米线");
    }
    private int getLength(){
        return meals.size();
    }
    private String getMeal(){
        Random rand = new Random();
        int r = rand.nextInt(getLength());
        return meals.get(r);
    }
}
