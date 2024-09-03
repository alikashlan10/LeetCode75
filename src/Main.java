//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3,1,3,4,3};
        int ops =solution.maxOperations(nums,6);
        System.out.println(ops);
    }
}