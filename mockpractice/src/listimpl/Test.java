package listimpl;

public class Test {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(2,50);
		l.remove(3);
		System.out.println(l.size());
		for(int i=0;i<l.size();i++) {
		System.out.println((Integer)l.get(i));
		}

	}

}
