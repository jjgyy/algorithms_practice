package 算法导论.最大子数组的线性解法;

public class Answer {

    private int left;
    private int right;
    private int sum;

    public Answer (int left, int right, int sum) {
        this.left = left;
        this.right = right;
        this.sum = sum;
    }

    public int getLeft () {
        return left;
    }

    public int getRight () {
        return right;
    }

    public int getSum () {
        return sum;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void setAnswer(int left, int right, int sum) {
        this.left = left;
        this.right = right;
        this.sum = sum;
    }

}
