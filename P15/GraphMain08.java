package P15;

import java.util.Scanner;

public class GraphMain08 {
    public static void main(String[] args) throws Exception {
        Graph08 gedung = new Graph08(6);
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        gedung.printGraph();
        gedung.removeEdge(1, 3);
        gedung.printGraph();
        Scanner sc08 = new Scanner(System.in);
        System.out.print("Masukkan gedung asal: ");
        int asal = sc08.nextInt();
        System.out.print("Masukkan gedung tujuan: ");
        int tujuan = sc08.nextInt();
        gedung.isConnected(asal, tujuan);
        System.out.print("Masukkan gedung asal: ");
        asal = sc08.nextInt();
        System.out.print("Masukkan gedung tujuan: ");
        tujuan = sc08.nextInt();
        gedung.isConnected(asal, tujuan);
        sc08.close();
        GraphMatriks08 gdg = new GraphMatriks08(4);
        gdg.makeEdge(0, 1, 50);
        gdg.makeEdge(1, 0, 60);
        gdg.makeEdge(1, 2, 70);
        gdg.makeEdge(2, 1, 80);
        gdg.makeEdge(2, 3, 40);
        gdg.makeEdge(3, 0, 90);
        gdg.printGraph();
        System.out.println("Hasil setelah penghapusan edge");
        gdg.removeEdge(2, 1);
        gdg.printGraph();
        gdg.totalDegree(2);
    }
}
