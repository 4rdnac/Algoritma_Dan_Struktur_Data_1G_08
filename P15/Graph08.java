package P15;

import java.util.Scanner;

public class Graph08 {
    int vertex;
    DoubleLinkedLists08 list[];

    public Graph08(int v) {
        vertex = v;
        list = new DoubleLinkedLists08[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedLists08();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
        // jika undirected
        // list[tujuan].addFirst(asal, jarak);
    }

    public void degree(int asal) throws Exception {
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == asal) {
                    ++totalIn;
                }
            }
            for (k = 0; k < list[asal].size; k++) {
                list[asal].get(k);
            }
            totalOut = k;
        }
        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + ": " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + ": " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ":" + (totalIn + totalOut));
        // jika undirected
        // System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " +
        // list[asal].size);
    }

    public void removeEdge(int asal, int tujuan) throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (i == tujuan) {
                list[asal].remove(tujuan);
            }
        }
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.println("Gedung " + (char) ('A' + i) + " terhubung dengan ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + " m), ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }

    public void isConnected() {
        Scanner sc08 = new Scanner(System.in);

        System.out.print("Masukkan gedung asal: ");
        int asal = sc08.nextInt();
        System.out.print("Masukkan gedung tujuan: ");
        int tujuan = sc08.nextInt();
        boolean found = false;

        for (int i = 0; i < list[asal].size(); i++) {
            try {
                if (list[asal].get(i) == tujuan) {
                    found = true;
                    break;
                }
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + );
            }
        }

        char asalChar = (char) ('A' + asal);
        char tujuanChar = (char) ('A' + tujuan);

        if (found) {
            System.out.println("Gedung " + asalChar + " dan Gedung " + tujuanChar + " bertetangga");
        } else {
            System.out.println("Gedung " + asalChar + " dan Gedung " + tujuanChar + " tidak bertetangga");
        }
        System.out.println();
    }
}
