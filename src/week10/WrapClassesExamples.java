package week10;

import java.util.ArrayList;
import java.util.Arrays;

public class WrapClassesExamples {
    public static void main(String[] args) {
        int i1=100;// primitive
        Integer i2 ;// object Scanner scan=new Scanner....

    i2=i1;// automatically the data enlarge itself from primitive to object

    ArrayList<Integer> arrayList= new ArrayList<>();

    arrayList.add(i1);
    arrayList.add(i2);
        System.out.println("arrayList="+ arrayList);

    Integer n1=300;
    int n2=n1;// un-boxing to primitive
        n2 = arrayList.get(1);// getting an object from arrayList and assigning to primitive: un-boxing

      String searchResult="1-48 of over 6,000 results for java";

String[] arr = searchResult.split(" ");
        System.out.println(Arrays.toString(arr));

int resultAsPrimitive = Integer.parseInt(arr[3]);

        System.out.println(resultAsPrimitive+1);

        Integer resultAsObject = Integer.valueOf(arr[3]);
        System.out.println("resultAsObject = "  + resultAsObject);

// benimkinde bir hata cikti oscarin week 10 haftasindan, kayitlarda dogrusun u bulabilirsin

    }
}
