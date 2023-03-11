package day14multidimensionalarraysarraylists;

public class Md02 {
    public static void main(String[] args) {
        //Example 1: Type code to find the multip of all elements of md array

        int [][] a={{5,4},{10,6,3}};
        int i=1;
        for(int[] w:a){
            for(int k:w){
                i=i*k;
            }
        }
        System.out.println(i);
    }
}
