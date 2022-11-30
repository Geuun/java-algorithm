package algorithm.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C1936 {

    static int nodeDistance(int nodeA, int nodeB) {
        int distance = 0;
        if (nodeA == nodeB) {
            return distance;
        } else if (nodeA > nodeB) {
            return nodeDistance(nodeA / 2, nodeB) + 1;
        } else {
            return nodeDistance(nodeA, nodeB / 2) + 1;
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = bufferedReader.readLine().split(" ");

        int nodeA = Integer.parseInt(inputs[0]);
        int nodeB = Integer.parseInt(inputs[1]);

        System.out.println(nodeDistance(nodeA, nodeB));
    }
}
