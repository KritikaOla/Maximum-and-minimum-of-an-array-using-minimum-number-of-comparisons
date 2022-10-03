
public class Main
{
	public static void main(String[] args) {
	    int[] arr= {2,5,3,8,1};
	    int n= arr.length;
	    int min,max;
        if(n==1){
            min= arr[0];
            max = arr[1];
        }
        
        if(arr[1]>arr[0]){
            min= arr[0];
            max= arr[1];
        }
        else{
            min= arr[1];
            max= arr[0];
        }
        for(int i=2; i<n; i++){
            if(arr[i]<min){
                min= arr[i];
            }
            else if(arr[i]>max){
                max= arr[i];
            }
	    }
	    System.out.println("min: "+min+" max: "+max);
    }
}
