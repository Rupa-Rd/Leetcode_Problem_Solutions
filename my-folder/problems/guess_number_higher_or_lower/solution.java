/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */
import java.util.Arrays;
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        // int[] arr = new int[10];
        // Arrays.setAll(arr,i->i+1);
        int l = 1;
        int h = n;
        
        while(l<=h){
            int mid = l + (h - l) / 2;
            int numGuess = guess(mid);
            if(numGuess == 0){
                return mid;
            }else if(numGuess == -1){
                h = mid -1;
            }else{
                l = mid+1;
            }
        }
        return -1;
    }
}