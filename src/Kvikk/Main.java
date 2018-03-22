package Kvikk;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	protected static int[] idList() {
		int[] rt = new int[4];
		for(int i=1;i<=10;i++) {
			rt[i] = i + i^i;
		}
		return rt;
	}

}
