/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seacrchingapp;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class SeacrchingApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int key;
        
        Searching s1 = new Searching(10);
        
        s1.fillList(0, 50);
        
        s1.showList();
        
        
        System.out.println("Enter The Key That You Want To Find : ");
        key = scanner.nextInt();
        
        int singleLinearIndex = s1.singleLinearSearch(key);
        int bidirectionalIndex = s1.bidirectionalLinearSearch(key);
        
        System.out.println("The Key is at " + singleLinearIndex +"th index");
        
        int singlelinearComparisons = s1.comparisonsPerformed()[0];
        int bidirectionalComparisons = s1.comparisonsPerformed()[1];
        
        System.out.println("Single Linear Search Comparisons : " + singlelinearComparisons);
        System.out.println("Bidirectional Linear Search Comparisons : " + bidirectionalComparisons);

        
    }
    
}
