package 算法导论.最大子数组的线性解法;

public class FindMaxSubArray {

    public static void main(String[] args) {
        int[] array = new int[]{-1, 10, -7, -6, 5, -3, 12, -4, -1, 6};
        FindMaxSubArray findMaxSubArray = new FindMaxSubArray();
        Answer answer = findMaxSubArray.findMaxSubArray(array, array.length-1);
        System.out.println(answer.getLeft());
        System.out.println(answer.getRight());
        System.out.println(answer.getSum());
    }

    private Answer findMaxSubArray (int[] array, int end) {

        Answer answer;

        if (end == 0) {
            answer = new Answer(0, 0, array[0]);
            return answer;
        }

        Answer subAnswerWithoutEnd = findMaxSubArray(array, end-1);
        Answer subAnswerWithEnd = findMaxSubArrayWithEnd(array, end);

        if (subAnswerWithEnd.getSum() > subAnswerWithoutEnd.getSum()) {
            answer = subAnswerWithEnd;
        } else {
            answer = subAnswerWithoutEnd;
        }

        return answer;
    }

    private Answer findMaxSubArrayWithEnd (int[] array, int end) {

        Answer answer = new Answer(0, end, 0);

        for (int i=end; i>=0; i--) {
            if (sum(array, i, end) > answer.getSum()) {
                answer.setSum(sum(array, i, end));
                answer.setLeft(i);
            }
        }

        return answer;
    }

    private int sum (int[] array, int begin, int end) {
        int sum = 0;
        for (int i=begin; i<=end; i++) {
            sum += array[i];
        }
        return sum;
    }

}
