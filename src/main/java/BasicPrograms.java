
public class BasicPrograms {

	public static void main(String[] args) {
		int temp;
		int[] a= {5,3,9,2,1};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++){
			if(a[i]>a[j]){
				temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}
			}
			}System.out.println(a[a.length-1]);
			}


}
