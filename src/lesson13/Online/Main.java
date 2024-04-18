package lesson13.Online;

public class Main {
    public static void main(String[] args) {
        double[][] numsForA = {{3, 5, 7, 8},
                                {1, 3, 6, 8},
                            {2, 4, 6, 8}};
        Matrix a = new Matrix(numsForA);
        System.out.println(a.getRows());
        System.out.println(a.getColumns());
        System.out.println(a.getValueAt(0, 0));
        a.setValueAt(0, 0, 9);
        System.out.println(a.getValueAt(0, 0));

        double[][] numsForB = {{6, 6, 6, 7},
                                {5, 5, 5, 6},
                                {4, 4, 4, 5}};
        Matrix b = new Matrix(numsForB);

        //a - неявный параметр ( внутрт метода доступен по слову this

        // b - явный параметр (внутри метода доступен OtherMatrix)

        IMatrix resultAdd = a.add(b); // создаст новую матрицу, на которую можно будт сослаться через ссылку result.Add

        resultAdd.printToConsole();
        System.out.println("-----------------");
        a.printToConsole();

        System.out.println("-----------------");
        System.out.println("Traverse");

        System.out.println("-----------------");
        a.transpose();
        System.out.println();

        System.out.println("проверка на единичную матрицу");
        System.out.println(a.isIdentityMatrix());

        double[][] numsForId = {{1, 0, 0,},
                                {0, 1,  0},
                                {0, 0, 1}};
        Matrix identity = new Matrix(numsForId);
        System.out.println(identity.isIdentityMatrix());

        System.out.println("проверка на нулевую матрицу");
        double[][] numsForNull = {{0, 0, 0,},
                {0,0,  0},
                {0, 0, 0}};
        Matrix nul = new Matrix(numsForNull);
        System.out.println(nul.isNullMatrix());
        System.out.println(a.isNullMatrix());

        System.out.println("проверка на fillMatrix ");
        nul.fillMatrix(1);
        nul.printToConsole();




    }
}
