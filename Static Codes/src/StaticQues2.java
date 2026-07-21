class PP {
	int x=10;
	static String y;
	void show() {
		System.out.println(x+y);
	}
}
public class StaticQues2 {
	public static void main(String[] args) {
		System.out.println(PP.y);
		AAA a1=new AAA ();
		AAA a2=new AAA();
		a1.x=40; a2.y="Yoyo";
		a1.y="abc";
		a1.show();
		a2.show();
	}
}