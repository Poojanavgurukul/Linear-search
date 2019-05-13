import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        int input=Integer.parseInt(args[0]);
        Integer searchIn[]={1,33,5,11,89,3,22,15,19,29};
        for (int i = 0; i <searchIn.length ; i++) {
            if(searchIn[i]==input){
                System.out.println(i);
                return;
            }
        }
        System.out.println("Number is not there");
    }
}