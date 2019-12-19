
public class 메소드3 {

	static void a() {
		System.out.println("a() operating");
		b();
		System.out.println("a() end");
	}
	static void b() {
		System.out.println("b() operating");
		c();
		System.out.println("b() end");
	}
	static void c() {
		System.out.println("c() operating");
		d();
		System.out.println("c() end");
	}
	static void d() {
		System.out.println("d() operating");
		System.out.println("d() end");
	}
	static void process() {
		System.out.println("a() 호출 전");
		a();
		System.out.println("a() 호출 후");
	}
	public static void main(String[] args) {
		
		process();
	}

}
