import ModuleTwo.QuickFindUF;
import ModuleTwo.QuickUnionUF;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static QuickFindUF uf;

    private static QuickUnionUF uf2;

    public static void test1(int p, int q) {
        System.out.println(uf2.connected(p, q));
        uf2.union(p, q);
        System.out.println(uf2.connected(p, q));
    }

    public static void main(String[] args) {
        uf2 = new QuickUnionUF(10);

        test1(4,3);
        test1(3,8);
        test1(6,5);
        test1(9,4);
        test1(2,1);
        uf2.connected(8,9);
        uf2.connected(5,4);
        test1(5,0);
        test1(7,2);
        test1(6,1);
        test1(7,3);
        uf2.printObjects();
    }
}