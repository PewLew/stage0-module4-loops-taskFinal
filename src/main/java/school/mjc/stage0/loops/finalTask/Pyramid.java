package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int k = 0, count = 0, count1 = 0;

        for (int i = 1; i <= cathetusLength; ++i) {
            for (int space = 1; space <= cathetusLength - i; ++space) {
                System.out.print(" ");
                ++count;
            }

            while (k != 2 * i - 1) {
                if (count <= cathetusLength - 1) {
                    System.out.print((i + k) + "");
                    ++count;
                } else {
                    ++count1;
                    System.out.print((i + k - 2 * count1) + "");
                }

                ++k;
            }
            count1 = count = k = 0;

            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
