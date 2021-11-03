import java.util.*;
class Solution {
    public void duplicateZeros(int[] arr) {
        
        LinkedList<Integer> result = new LinkedList<Integer>();
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                result.add(arr[i]);
                result.add(arr[i]);
                System.out.print("Hello");
            }
            else{
                result.add(arr[i]);
            }
            
           
           
        }
        System.out.print(result);
        
        Object[] obj = result.toArray();
        System.out.print(obj);
       
        for(int j =0; j< arr.length; j++){
            arr[j] = (int) obj[j];
            
        }

    }
}
