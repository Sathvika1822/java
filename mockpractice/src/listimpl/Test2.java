package listimpl;

public class Test2 {

	public static void main(String[] args) {
		SingleLinkedList l=new SingleLinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(1,50);
        l.remove(2);
        for(int i=0;i<l.size();i++)
        {
        	System.out.print((Integer)l.get(i)+" ");
        }
        System.out.println();
        l.reverse();
        for(int i=0;i<l.size();i++)
        {
        	System.out.print((Integer)l.get(i)+" ");
        }
        System.out.println();
	}

}
