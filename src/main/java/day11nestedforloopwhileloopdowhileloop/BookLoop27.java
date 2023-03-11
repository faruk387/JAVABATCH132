package day11nestedforloopwhileloopdowhileloop;

public class BookLoop27 {
    public static void main(String[] args) {
        Integer arr[]={4,6,5,-10,8,5,20};
        int num=10;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]+arr[j]==num){
                    System.out.println(arr[i]+"+"+arr[j]+"="+num);

                }
            }
        }
    }
}
