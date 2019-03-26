/**
 * Created with Intellij IDEA.
 * User: jma
 * Date: 2019/3/26
 * Time: 16:52
 * To change this template use File | Settings | File and Code Templates
 */
public class LaunchForever {

    final static  String fizz ="Fizz";
    final static  String buzz = "Buzz";

    static boolean dividedOrHasThree(int num){
        return num%3==0 || (num+"").contains("3");
    }
    static boolean dividedOrHasFive(int num){
        return num%5==0 || (num+"").contains("5");
    }
    //A number is FizzBuzz if it is divisible by 3 or 5 or if it has a 3 or 5 in it.  i%3 || i%5 || '3' || '5', seriously?
    //statement 3 is in conflict with 1 and 2
    static boolean dividedAndContainsThreeOrFive(int num){
        return dividedOrHasThree(num) && dividedOrHasFive(num);
    }

    static void printf(int number){
        Object  result = "";
        if(dividedAndContainsThreeOrFive(number)){
            result = fizz + buzz;
        }else if (dividedOrHasThree(number) ){
            result = fizz;
        }else if (dividedOrHasFive(number)){
            result = buzz;
        }else {
            result = number;
        }


        System.out.println(result);
    }

    public static void main(String [] args){
        for(int i =1;i<=100; i++){
            printf(i);
        }
    }
}
