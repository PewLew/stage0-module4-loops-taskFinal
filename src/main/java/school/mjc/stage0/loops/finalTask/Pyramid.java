package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int e = 0, count = 0, count1 = 0;

        for (int i = 1; i <= cathetusLength; ++i) {
            for (int space = 1; space <= cathetusLength - i; ++space) {
                System.out.print(" ");
                ++count;
            }

            while (e != 2 * i - 1) {
                if (count <= cathetusLength - 1) {
                    System.out.print((i + e) + " ");
                    ++count;
                } else {
                    ++count1;
                    System.out.print((i + e - 2 * count1) + " ");
                }

                ++e;
            }
            count1 = count = e = 0;

            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
