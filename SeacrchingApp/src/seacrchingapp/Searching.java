/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seacrchingapp;

import java.util.Random;

/**
 *
 * @author student
 */
public class Searching 
{
    private int[] list;
    
    private int linearSearchComparisons;
    private int bidirectionalComparisons;
    
    
    public Searching(int size)
    {
        linearSearchComparisons = 0;
        bidirectionalComparisons = 0;
        
        
        list = new int[size];
    }
    
    public void fillList(int min, int max)
    {
        Random random = new Random();
        
        for (int i = 0; i < list.length; i++)
        {
            list[i] = random.nextInt(max - min + 1) + min;
        }
        
        System.out.println("The List is populated************* \n\n");
    }
    
    public int singleLinearSearch(int key)
    {
        for(int i = 0; i < list.length; i++)
        {
            linearSearchComparisons++;
            if(list[i] == key)
            {
                return i;
            }
        }
        
        return -1;
    }
    
    
    public int[] comparisonsPerformed()
    {
        return new int[]{linearSearchComparisons, bidirectionalComparisons};
    }
    
    public int bidirectionalLinearSearch(int target)
    {
        int left = (list.length - 1) / 2;
        int right = (list.length - 1) / 2;
        
        
        for( ; left >=0 && right <= list.length - 1 ;left--, right++ )
        {
             bidirectionalComparisons++;
            if(list[left] == target)
            {
                return left;
            }
            
            else if(list[right] == target)
            {
                return right;
            }
            
            else
            {
                if(left != 0)
                {
                    left--;
                }
                
                if(right != list.length - 1)
                {
                    right++;
                }
                
            }
        }
        
//        while(left >= 0 && right <= list.length - 1)
//        {
//           
//        }
        return -1;
    }
    
    
    
    
    public void showList()
    {
        System.out.println("\n**********************************************");
        System.out.println("The List Items Are : ");
        for(int i = 0; i < list.length; i++)
        {
            System.out.print(list[i] + ",");
        }
        System.out.println("\n**********************************************");
    }
}
