import java.util.Arrays;

public class Hello {
    public static void main(String[] args) {
        int[] ns = new int[]{1, 2, 3, 11, 22, 1};

        System.out.println(Arrays.toString(ns));

        for (int i = 0; i < ns.length - 1; i++) {
            for (int j = 0; j < ns.length - i - 1; j++) {
                if (ns[j] > ns[j+1]) {
                    // 交换ns[j]和ns[j+1]:
                    int tmp = ns[j];
                    ns[j] = ns[j+1];
                    ns[j+1] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(ns));
    }
}