package com.karthik.ocj;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import javax.xml.transform.Source;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ArraysTest {

    @Test
    public void testIntArraySort(){
        int [] intArry = {1, 78, 23, -65, 28, -12, 100, 4};
        Arrays.sort(intArry);
        for (int anIntArry : intArry) {
            System.out.print(anIntArry + " ");
        }
        assertThat(intArry[0]).isEqualTo(-65);
    }

    @Test
    public void testStringArraySort(){
        String [] strArray = {"90", "1", "10", "-78", "abc", "XYZ", "100", "xyz", "%$^"};
        Arrays.sort(strArray);
        for (String str : strArray) {
            System.err.print(str+" ");
        }
    }

    @Test
    public void testArraysBinarySearchWithSortedIntegerArray(){
        int [] intArr = {2, 5, 7, 9, 11};
        assertThat(Arrays.binarySearch(intArr, 7)).isEqualTo(2);
        assertThat(Arrays.binarySearch(intArr, 5)).isEqualTo(1);
        assertThat(Arrays.binarySearch(intArr, 8)).isEqualTo(-4);
        assertThat(Arrays.binarySearch(intArr, 15)).isEqualTo(-6);//The index(negative) needs to insert + (-1)
    }

    @Test
    public void testArraysBinarySearchWithStringArray(){
        String [] strArr = {"90", "1", "10", "-78", "abc", "XYZ", "100", "xyz", "%$^"};
        /*System.out.println("---Before Sort---");
        for (String str : strArr) {
            System.err.print(str+" ");
        }*/
        System.out.println();
        System.out.println("---After Sort---");
        Arrays.sort(strArr);
        for (String str : strArr) {
            System.err.print(str+" ");
        }
        assertThat(Arrays.binarySearch(strArr, "7")).isEqualTo(-6);
        assertThat(Arrays.binarySearch(strArr, "abc")).isEqualTo(7);
        assertThat(Arrays.binarySearch(strArr, "100")).isEqualTo(4);
        assertThat(Arrays.binarySearch(strArr, "1001")).isEqualTo(-6);
        assertThat(Arrays.binarySearch(strArr, "*()")).isEqualTo(-2);
    }

    @Test
    public void testArraysToList(){
        String[] strArray = {"Cow", "Dog", "Cat", "Rat"};
        List<String> strList = Arrays.asList(strArray);
//        strList.add("Hen");//UnsupportedOperationException
        strList.set(3, "Hen");
        //strList.clear();//UnsupportedOperationException
        //strList.remove("Cat");//UnsupportedOperationException
        //strList.remove(2);//UnsupportedOperationException
        for (String str :
                strArray) {
            System.out.print(str+" ");

        }
    }
}
