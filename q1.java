public class q1{
	public static void main(String[] args) 
	{
		
		int [] arr={5,8,9,7,4,6,3,1,0,2};
		int len =arr.length;
		int uni = 10;
		int []aux= new int[arr.length];
		int [] count = new int[uni+1];

		for(int i=0;i<len;i++){
			count[arr[i] +1]++;
		}
		for (int u=0;u<uni; u++){
			count[u+1]+=count[u];
		}
		for(int i=0;i<len;i++){
			aux[count[arr[i]]++]=arr[i];
		}
		for(int i=0;i<len;i++){
			arr[i]=aux[i];
		}
		for(int i=0;i<len;i++){
			System.out.print(" "+arr[i]);
		}
		System.out.print(" ");
	}
}
















