/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity1;
import java.util.ArrayList;

public class Practice1 {
    public static void main (String [] args ){
        ArrayList<Integer> numbers = new ArrayList<>();
        
        numbers.add(1);
        numbers.add(0);
        numbers.addFirst(3);
        numbers.addLast(2);
        numbers.add(2, 5);
        
        System.out.println(numbers.get(2));
        
        System.out.println(numbers);
        
        numbers.set (2,4);
        System.out.println("Number of elements: " + numbers.size());
        System.out.println(numbers.contains(5));
        numbers.remove(0);
        System.out.println(numbers.isEmpty());
        
        
        for (int i = 0 ; i < numbers.size(); i++){
            System.out.println("$" + numbers.get(i) + ".00 ");
        }
        
    }
    
}
