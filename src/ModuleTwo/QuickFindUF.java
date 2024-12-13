package ModuleTwo;

public class QuickFindUF {
    private int [] id;
    public QuickFindUF (int n) {
        id = new int[n];
        for(int i = 0; i < n; i ++) {
            id[i] = i;
        }
    }

    // 2 array accesses
    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    //2n + 2 array accesses
    public void union(int p, int q) {
        if (connected(p, q)) {
            System.out.println(p + " and " + q + " are already connected!");
            return;
        }
        int pId = id[p];
        int qId = id[q];
        for (int i = 0; i < id.length; i++) {
            if(id[i] == pId) {
                id[i] = qId;
            }
        }
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
