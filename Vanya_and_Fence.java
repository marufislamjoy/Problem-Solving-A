import java.util.*;
public class Vanya_and_Fence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arS = sc.nextInt();
		int height = sc.nextInt();
		int count = 0;
		int res = 0;
		int x = 0;
		for(int i = 1;i<=arS;i++) {
			x = sc.nextInt();
			if(x>height)
				res+=2;
			else
				res+=1;
			
		}
		System.out.println(res);
	}

}
