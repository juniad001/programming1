package arrays;
//wap to find the frequency of elements occurence
public class p6 {
	public static void freq(int [] a) {
		int [] freq = new int[a.length];
		int visited = -1;
		for(int i = 0;i<a.length;i++) {
			int count = 1;
			for(int j = i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					freq[j] = visited;
				}
			}
			if(freq[i]!=visited) {
				freq[i] = count;
			}
		}
		for(int i = 0;i<freq.length;i++) {
			if(freq[i]!=visited) {
				System.out.println(a[i]+"="+freq[i]);
			}
		}
	}
	public static void main(String[] args) {
		int [] a = {10,30,45,80,100,30,10,30,80,10,10};
		freq(a);
	}
}
