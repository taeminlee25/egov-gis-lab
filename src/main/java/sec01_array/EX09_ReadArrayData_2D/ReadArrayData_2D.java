package sec01_array.EX09_ReadArrayData_2D;

public class ReadArrayData_2D {
    public static void main() {
        // 2차원 데이터 배열의 길이
        int[][] array1 = new int[2][3];
        System.out.println(array1.length);
        System.out.println(array1[0].length);

        int[][] array2 = new int[][] {{1, 2}, {3, 4, 5}};
        System.out.println(array2.length);
        System.out.println(array2[0].length);
        System.out.println(array2[1].length);

        // 2차원 배열의 출력방법
        System.out.println(array2[0][0] + " ");
        System.out.println(array2[0][1] + " ");
        System.out.println();
        System.out.println(array2[1][0] + " ");
        System.out.println(array2[1][1] + " ");
        System.out.println(array2[1][2]);
        System.out.println();

        for(int i = 0; i < array1.length; i++) {
            for(int j = 0; j < array1[i].length; j++) {
                System.out.println(array2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for(int[] array: array2) {
            for(int k:array) {
                System.out.println(k + " ");
            }
            System.out.println();
        }
    }
}