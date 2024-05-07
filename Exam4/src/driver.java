import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class driver {

    public static void decideWinner(ArrayList<Object> aList) {
        ArrayList<String> strList = new ArrayList<>(aList.size());
        for (Object obj : aList) {
            strList.add(obj.toString());
        }
        //breaking indexes of arraylist object
        String[] strArray = strList.toArray(new String[0]);
        String playString = Arrays.toString(strArray);
        String newPlayString = playString.replace(",", "");
        newPlayString = newPlayString.trim();
        String[] newPlayString2 = newPlayString.split(" ");

        String a = Arrays.toString(newPlayString2);


        ArrayList<Character> numList = new ArrayList<>();
        //pulled out digits and added to char arraylist
        for (int i = 0; i < a.length(); i++) {
            if (Character.isDigit(a.charAt(i))) {
                numList.add(a.charAt(i));
            }
        }
        //Trying to isolate the dice rolls in order to find max #
        for (int j = (numList.size() & ~1) - 1; j >= 0; j -= 2) {
            numList.remove(j);
        }
        String nums = numList.toString();
        //trying to isolate names of players using indexes to compare with rolls
        ArrayList<String> newPlayString3 = new ArrayList<>();
        Collections.addAll(newPlayString3, newPlayString2);


        System.out.println("won the game" + nums);
        //System.out.println(newPlayString3);


    }
}
