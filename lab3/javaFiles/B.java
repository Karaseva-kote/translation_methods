class B {
	interface A {
		void f();
	}
	public class BImp implements B {
		public void f() {}
	}
	private class BImp2 implements B {
		public void f() {}
	}
	public interface C {
		void f();
	}
	class CImp implements C {
		public void f() {}
	}
	private class CImp2 implements C {
		public void f() {}
	}
	private interface D {
		void f();
	}
	private class DImp implements D {
		public void f() {}
	}
	public class DImp2 implements D {
		public void f() {}
	}
	public int getD() { return 4; }
	private boolean dRef;
	public void receiveD(char d) {
		dRef = d;
	}
}