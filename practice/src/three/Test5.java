package three;

import java.util.Date;

public class Test5 {
	public static void main(String[] args) {
        Object[] a = new Object[10];
        
        a[0] = "hello";
        a[1] = new String("world");
        a[2] = new Date();
        a[3] = new Person("ȫ�浿", 13);
        a[4] = new int[] { 1, 2, 3 };
        a[5] = new String[] { "one", "two", "three" };
        a[6] = new Integer(3);
        a[7] = new Double(3.14);
        a[8] = 3;
        a[9] = 3.14;
        
        for (Object o : a) {
            System.out.println(o);
        }
    }

}
