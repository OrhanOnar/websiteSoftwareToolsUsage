package com.mycompany.app;

import java.util.ArrayList;
import java.util.Arrays;

import junit.framework.TestCase;

public class AppTest 
    extends TestCase
{
    public void testFound() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertTrue(new App().search(array, 4));
    }

    public void testNotFound() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertFalse(new App().search(array, 5));
    }

    public void testEmptyArray() {
      ArrayList<Integer> array = new ArrayList<>();
      assertFalse(new App().search(array, 1));
    }
 public void SearchmergedArrayCorrectly() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(5, 6, 7, 8));
        array.addAll(array2);
      assertFalse(new App().search(array, 7));
    }
    public void testNull() {
      assertFalse(new App().search(null, 1));
    }

}
