// 64050355 Jirapat Pichai

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Ex2_Single {
    public static final int MAX = 5;
    public static void main(String[] args) {
            System.out.println("Welcome to the Application!");

            List<Integer> nums = new ArrayList<>();
            
            nums = inputNumber(nums);

            nums = sortNumber(nums);

            printList(nums);
    }

    public static List<Integer> inputNumber(List<Integer> nums) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter 5 valid integers in the range [0, 10]");

        while(nums.size() < MAX) {
            String s = inp.nextLine();
            
            if (!checkFormat(s)) continue;
            int num = Integer.parseInt(s);
            
            if (!checkRange(num)) continue;
            nums.add(num);
        }

        inp.close();
        return nums;
    }

    public static boolean checkFormat(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid! Try again!");
            return false;
        }
    }

    public static boolean checkRange(int num) {
        if(num < 0 || num > 10) {
            System.out.println("Invalid range! Try again!");
            return false;
        }
        return true;
    }

    public static List<Integer> sortNumber(List<Integer> nums) {
        Collections.sort(nums);
        return nums;
    }

    public static void printList(List<Integer> nums) {
        for(int num : nums)
            System.out.print(num + " ");
    }
}