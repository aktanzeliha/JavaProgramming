package day29ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListpractice2MyOwn {
    public static void main(String[] args) {
        // remove all names which starts capital M
        String [] names = {"Mary", "Monica", "Mehray", "Musti", "Sumeyra", "Hasan", "Beril"};

       ArrayList<String> list= new ArrayList<>(Arrays.asList(names));

list.removeIf(p ->p.charAt(0)== 'M');

names= list.toArray(new String[0]);

        System.out.println(Arrays.toString(names));


    }
    }

