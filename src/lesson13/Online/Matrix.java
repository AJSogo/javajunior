package lesson13.Online;

public class Matrix implements IMatrix /* наследование интерфейса*/ {
    private double[][] nums;


    public Matrix() {
        nums = new double[DEFAULT_MATRIX_SIZE][DEFAULT_MATRIX_SIZE];
    }

    public Matrix(double[][] nums) {
        this.nums = nums;
    }

    public Matrix(int row, int col) {

        nums = new double[row][col];
    }

    @Override
    public int getRows() {
        return nums.length;
    }

    @Override
    public int getColumns() {
        return nums[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex)
            throws IndexOutOfBoundsException {
        if (rowIndex < 0 || rowIndex > getRows()) {
            System.out.println("rowIndex не подходит");
            return -1;
        }

        if (colIndex < 0 || colIndex > getColumns()) {
            System.out.println("colIndex не подходит");
            return 0;
        }
        return nums[rowIndex][colIndex];

    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if (rowIndex < 0 || rowIndex > getRows()) {
            System.out.println("rowIndex не подходит");
            return;
        }

        if (colIndex < 0 || colIndex > getColumns()) {
            System.out.println("colIndex не подходит");
            return;
        }
        nums[rowIndex][colIndex] = value;
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("Не совпадает количество строк");
            return null;
        }
        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("Не совпадает количество строк");
            return null;
        }
        Matrix result = new Matrix(this.getRows(), getColumns());

        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) + otherMatrix.getValueAt(i, j));
            }

        }
        return result;
    }

    @Override //минус
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {

        if (this.getRows() == otherMatrix.getRows()) {
            if (this.getColumns() == otherMatrix.getColumns()) {

                Matrix result = new Matrix(this.getRows(), this.getColumns());

                for (int i = 0; i < this.getRows(); i++) {
                    for (int j = 0; j < getColumns(); j++) {
                        result.setValueAt(i, j, (this.getValueAt(i, j) - otherMatrix.getValueAt(i, j)));
                    }
                }

                return null;
            }
            System.out.println("Размеры матриц не совпадают, разные колонки");
            return null;
        }
        System.out.println("Размеры матриц не совпадаюбт, разные ряды");
        return null;
    }

    @Override //узнать как умножаются матрицы формулы //найти в интернете
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {

        if (this.getColumns() != otherMatrix.getRows()) {
            System.out.println("Количество столбцов первой матрицы не равно количеству строк второй, умножение" +
                    "невозможно.");
            return null;
        }
        Matrix multipliedMatrix = new Matrix(this.getRows(), otherMatrix.getColumns());
        Matrix help = new Matrix(this.getRows(), otherMatrix.getColumns());


        //Чужой КОД

        for (int i = 0; i < multipliedMatrix.getRows(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumns(); j++) {
                for (int k = 0; k < this.getColumns(); k++) {
                    multipliedMatrix.nums[i][j] += (this.getValueAt(i,k) * otherMatrix.getValueAt(k, j));
                }
            }
        }

        return multipliedMatrix;
    }


    @Override //умножение на число
    public IMatrix mul(double value) {
        for (int i = 0; i < this.nums.length; i++) {
            for (int j = 0; j < this.nums.length; j++) {
                this.setValueAt(i, j, (getValueAt(i, j) * value));
            }
        }

        return null;
    }


    @Override // переворачивать матрицу по диагонали
    public IMatrix transpose() {
        Matrix traverse = new Matrix(this.getRows(), this.getColumns());
        // if rows are четные

        for (int i = 0; i < traverse.getRows(); i++) {

            for (int j = 0; j < traverse.getColumns(); j++) {

                traverse.setValueAt(((traverse.getRows() - 1) - i), ((traverse.getColumns() - 1) - j), (this.getValueAt(i, j)));
            }
        }
        traverse.printToConsole();
        return traverse;
    }

    @Override //заполнить матрицу вот этим одним числом
    public void fillMatrix(double value) {

        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                setValueAt(i, j, value);
            }
        }

    }

    @Override //найти в интернете детерминант матрицы
    public double determinant() {
        double temporary[][];
        double result = 0;

        if (isSquareMatrix() == false) {
            System.out.println("Матрица должна быть квадратная, чтобы найти определитель");
            return 0;
        }

        //если матрица заполнена одинаковыми числами
        double num = nums[0][0];
        boolean flag = true;
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if (getValueAt(i, j) != num) {
                    flag = false;
                }

            }
        }
        if (flag == true) {
            System.out.println("Матрица заполнена одинаковыми числами, поэтому детерминант равен 0");
            return 0;
        }

        //вычисление матрицы 2 на 2
        if (getColumns() == 2 && getRows() == 2) {
            System.out.println("Детерминант матрицы 2 на 2");
            return nums[0][0] * nums[1][1] - nums[0][1] * nums[1][0];
        }

        //вычисление матрицы 3 на 3
        if (getColumns() == 3 && getRows() == 3) {
            return (nums[0][0] * nums[1][1] * nums[2][2] + nums[0][1] * nums[1][2] * nums[2][0] +
                    nums[1][0] * nums[2][1] * nums[0][2]) -
                    (nums[2][0] * nums[1][1] * nums[0][2] +
                            nums[1][0] * nums[2][2] * nums[0][1]
                            + nums[0][0] * nums[2][1] * nums[1][2]);
        }



        for (int i = 0; i < nums[0].length; i++) {
            temporary = new double[nums.length - 1][nums[0].length - 1];

            for (int j = 1; j < nums.length; j++) {
                for (int k = 0; k < nums[0].length; k++) {
                    if (k < i) {
                        temporary[j - 1][k] = nums[j][k];
                    } else if (k > i) {
                        temporary[j - 1][k - 1] = nums[j][k];
                    }
                }
            }
            Matrix tempo = new Matrix(temporary);

            result += nums[0][i] * Math.pow (-1, (double) i) * tempo.determinant ();
        }
        return (result);
        //вычисление матриц больше размером
    }


    @Override
    public boolean isNullMatrix() {

        boolean flag = true;
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                if (getValueAt(i, j) != 0) {
                    flag = false;
                }
            }
        }
        if (flag == true) {
            return true;
        }

        return false;
    }

    //done
    @Override
    public boolean isIdentityMatrix() { //проверка на пустоту

        if (this.isSquareMatrix() == false) {

            return false;
        }

        boolean flag = true;

        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                if ((i == j && getValueAt(i, j) != 1) || (i != j && getValueAt(i, j) != 0)) {
                    flag = false;
                }
            }
        }
        if (flag == false) {
            return false;
        }

        return true;
    }

    //done
    @Override
    public boolean isSquareMatrix() {
        if (getColumns() == getRows()) {
            return true;
        }
        return false;
    }

    //done
    @Override
    public void printToConsole() {

        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                System.out.print(this.getValueAt(i, j) + " ");
            }
            System.out.println();

        }

    }
}

