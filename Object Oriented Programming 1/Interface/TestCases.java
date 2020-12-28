public class TestCases {
    public static void main(String[] args) {

        // Set s1 = new Set();
        // s1.add(1);
        // s1.add(2);
        // s1.add(3);
        // s1.add(2);
        // s1.display();

        // Set s1 =  new Set();
        // Set s2 = new Set();
        // s1.add(10);
        // s1.add(12);
        // s1.add(13);
        // s1.add(14);
        // s1.add(15);
        // s1.add(17);
        // s1.add(16);
        // s1.add(18);
        // s1.add(20);
        // s1.add(21);
        // s1.add(22);
        // s2.add(1);
        // s2.add(2);
        // s2.add(3);
        // System.out.println("Count: "+s1.count());
        // s1.display();
        // s2.display();
        // System.out.println("Count: "+s2.count());

        // Set s1 = new Set();
        // s1.add(1);
        // s1.add(2);
        // s1.add(3);s
        // s1.add(6);
        // System.out.println(s1.isElementOf(2));
        // System.out.println(s1.isElementOf(10));

        // Set s1 = new Set();
        // Set s2 = new Set();
        // Set union = null;
        // s1.add(1);
        // s1.add(2);
        // s1.add(3);
        // s1.add(4);
        // s2.add(10);
        // s2.add(2);
        // s2.add(20);
        // union = s1.union(s2);
        // union.display();

        Set s1 =  new Set();
        s1.add(10);
        s1.add(12);
        s1.add(13);
        s1.add(14);
        s1.add(15);
        s1.add(17);
        s1.add(16);
        s1.add(18);
        s1.add(20);
        s1.add(21);
        s1.add(22);
        Set s2 = new Set();
        s2.add(41);
        s2.add(42);
        s2.add(43);
        s2.add(44);
        s2.add(45);
        s2.add(46);
        s2.add(47);
        s2.add(48);
        s2.add(49);
        s2.add(50);
        Set union = s1.union(s2);
        union.display();
    }
}
