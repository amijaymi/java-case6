public class alistirma2 {
    public static void main(String[] args) {
        int[] array={2,4,5,6,1,3,6,9,1,2,3};
        find_max(array);
 
 
     }
     public static int find_max(int[] array2){
         int max=array2[0];
         for(int i=0;i<=array2.length;i++){
             if(array2[i]>max){
                 max=array2[i];
             }
             
         }
         return max;
     }
}
