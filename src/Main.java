//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,12,-5,-6,50,3};
        double ops =solution.findMaxAverage(nums,4);
        System.out.println(ops);
    }
}