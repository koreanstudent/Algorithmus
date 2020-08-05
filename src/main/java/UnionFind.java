public class UnionFind {
    public static void main(String[] args) {
        int parent[] = new int[7];
        for(int i = 1; i < 7; i++) {
            parent[i] = i;
        }

        unionParent(parent, 1, 2);
        unionParent(parent, 2, 3);
        unionParent(parent, 4, 5);
        unionParent(parent, 5, 6);
        System.out.println("1과 3의 연결" + findParent(parent,1,3));
        System.out.println("4과 6의 연결" + findParent(parent,4,6));
    }

    static int getParent(int parent[], int x) {
        if(parent[x] == x) return x;
        return parent[x] = getParent(parent, parent[x]);
    }

    // 각 부모 노드를 합친다.
    static void unionParent(int parent[], int a, int b) {
        a = getParent(parent, a);
        b = getParent(parent, b);

        if(a < b) {
            parent[b] = a;
        } else {
            parent[a] = b;
        }
    }

    static int findParent(int parent[], int a, int b) {
        a = getParent(parent, a);
        b = getParent(parent, b);
        if(a == b) {
            return 1;
        } else {
            return 0;
        }
    }
}
