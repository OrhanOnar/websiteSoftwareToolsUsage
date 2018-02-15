package com.mycompany.app;

import java.util.ArrayList;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
    	ArrayList liste = new ArrayList();
        liste.add(20);
        liste.add(100);
        liste.add(40);
        liste.add(30);
        liste.add(35);
        liste.add(45);

      search(liste,30);

    }
public interface islem {
	
    public void search();

    
}
public static boolean search(ArrayList<Integer> array, int e) {
        System.out.println("inside search");
        if (array == null) return false;
  
        for (int elt : array) {
          if (elt == e) return true;
        }
        return false;
      }


























}
