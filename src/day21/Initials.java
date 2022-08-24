package day21;

public class Initials {
    public static void main(String[] args) {
        String[] names = {"Elminur Ablimit", "Ali Kilic", "Hulya Keles", "Simen Kaya", "Begench Begenjov", "Ruveyda Durna",
                "Jonathan Holly", "Alshaun Rodgers", "Manas Kalenov", "Gulsen Sohret"};


        for(String each : names ){
            String initial = each.charAt(0)+"."+ each.charAt(  each.indexOf(" ") +1   );//  ikinci kisimda each.charAt(  each.indexOf(" ") +1 burada
            //each indexof (" ") deyinde isimden sonraki soy isimden onceki boslugu verir bize ama biz
            // o bosluktan sonraki ilk harfi yani soyismin ilk harfini istiyoruz o yuzden +1 yaziyoruz
            System.out.println(initial);
        }

// isminin ve soyisminin basharflerini yazdiracagiz sadce
    }
}
