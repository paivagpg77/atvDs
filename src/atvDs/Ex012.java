package atvDs;

public class Ex012 {
    public static void main(String[] args) {
        int[] num = {23, 45, 12, 67, 8, 90, 34};

        int mai = num[0];
        int men = num[0];

        for (int i = 1; i < num.length; i++) {
            if (num[i] > mai) {
                mai = num[i];
            }
            if (num[i] < men) {
                men = num[i];
            }
        }

        System.out.println("maior: " + mai);
        System.out.println("menor: " + men);
    }
}
