package ModuleTwo;

public class QuickUnionUF {
    private int [] id;
    public QuickUnionUF(int n) {
        id = new int[n];
        for(int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    public int root(int i){
        while (id[i] != i) i = id[i];
        return i;
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }

    public void printObjects() {
        for (int i = 0; i < id.length; i++ ) {
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i : id) {
            System.out.print(i + " ");
        }
    }
}
