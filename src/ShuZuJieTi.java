public class ShuZuJieTi {
	int a = 12;
	int b = 13;
	int c;
	
	// 程序入口
	public static void main(String[] args) {
		// 创建对象 必须调用构造方法
		ShuZuJieTi test = new ShuZuJieTi();
		test.say();
		test.calculator();
	}
	
	public ShuZuJieTi() {		
		int twoDim [][] = new int[4][];
		twoDim[0] = new int[2];
		twoDim[1] = new int[2];
		twoDim[2] = new int[2];
		twoDim[3] = new int[2];
		
		
		System.out.println("twoDim.length =" + twoDim.length);
		for (int i = 0; i < twoDim.length; i++) {
			System.out.println("twoDim[" + i + "].length=" + twoDim[i].length);
		}
	}
	
	public void say() {
		System.out.println(this.a);
		System.out.println(this.b);
	}
	public void calculator(){
		c = a + b;
		System.out.println(c);
	}
}