
public class Main
{
    public static boolean xyzMiddle(String str){
        //get the length of the string
        int length = str.length();
        //variable to store middle position
        int middle;
        
        //find the middle position
        if(length % 2 == 1) {
            //odd length: middle is at length / 2
            middle = length / 2;
        }else {
            //even length: middle is at (length / 2) -1
            middle = (length / 2) - 1;
        }
        
        //get the substring form middle - 1 to middle + 2 and check if it equals "xyz"
       return str.substring(middle - 1, middle + 2).equals("xyz");
    }
    public static void main(String[] args) {
        
        //test
        System.out.println(xyzMiddle("AAxyzBB"));   //true
        System.out.println(xyzMiddle("AxyzBB"));    //true
        System.out.println(xyzMiddle("AxyzBBB"));   //false
        System.out.println(xyzMiddle("mabcm"));     //false
        System.out.println(xyzMiddle("ggxyza"));    //false
        System.out.println(xyzMiddle("APxyzCSP"));//true
        System.out.println(xyzMiddle("AAzyxAA"));   //false
        System.out.println(xyzMiddle("xyz"));       //true
        System.out.println(xyzMiddle("qwertyuiopasdxyzfghjklzxcvbnm")); //true
    }
}
