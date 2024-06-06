package P15;

public class GraphMatriks08 {
    int vertex;
    int[][] matriks;

    public GraphMatriks08(int v) {
        vertex = v;
        matriks = new int[v][v];
    }

    public void makeEdge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan) {
        matriks[asal][tujuan] = 0;
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung " + (char) ('A' + i) + ": ");
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != -1) {
                    System.out.print("Gedung " + (char) ('A' + j) + " (" + matriks[i][j] + " m), ");
                }
            }
            System.out.println("");
        }
    }

    public void totalDegree(int asal) {
        int ttlInDegree = 0;
        int ttlOutDegree = 0;
        int ttlDegree = 0;
        for (int i = 0; i < vertex; i++) {
            if (matriks[i][asal] != 0) {
                ttlInDegree++;
            }
            if (matriks[asal][i] != 0) {
                ttlOutDegree++;
            }
        }
        ttlDegree = ttlInDegree + ttlOutDegree;

        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + ": " + ttlInDegree);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + ": " + ttlOutDegree);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + ttlDegree);
    }
}
