package 算法导论.最大子数组的线性解法;

public class Answer {

    private int left;
    private int right;
    private int sum;

    Answer (int left, int right, int sum) {
        this.left = left;
        this.right = right;
        this.sum = sum;
    }

    int getLeft () {
        return left;
    }

    int getRight () {
        return right;
    }

    int getSum () {
        return sum;
    }

    void setLeft(int left) {
        this.left = left;
    }

    void setRight(int right) {
        this.right = right;
    }

    void setSum(int sum) {
        this.sum = sum;
    }

    void setAnswer(int left, int right, int sum) {
        this.left = left;
        this.right = right;
        this.sum = sum;
    }

}
