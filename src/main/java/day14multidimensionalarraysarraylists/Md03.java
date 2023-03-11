package day14multidimensionalarraysarraylists;

public class Md03 {
    public static void main(String[] args) {
        //Example 1: Find the sum of the minumum and maximum elements in a md array
        int[][] a={{5,4},{10,6,7}};
        int min=a[0][0];
        int max=0;
        for(int[]w:a){
            for(int k:w){
               min=Math.min(min,k);
               max=Math.max(max,k);
            }
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println(min+max);
    }
}
