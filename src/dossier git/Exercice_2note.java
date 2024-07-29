import java.util.HashMap;
import java.util.Map;

public class Exercice_2note {
    public static void main(String[] args) {
        int[] result1 = calculTowSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println((result1 != null && result1[0] == 0 && result1[1] == 1) ? "Test 1 réussi" : "Test 1 raté");

        int[] result2 = calculTowSum(new int[]{15, 12, 9, 1, 5, 3}, 8);
        System.out.println((result2 != null && result2[0] == 4 && result2[1] == 5) ? "Test 2 réussi" : "Test 2 raté");

        int[] result3 = calculTowSum(new int[]{10, 6, 8, 11, 2}, 10);
        System.out.println((result3 != null && result3[0] == 2 && result3[1] == 4) ? "Test 3 réussi" : "Test 3 raté");
    }
    
    //avec hashmap
    public static int[] calculTowSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int reste = target - nums[i];
            if (map.containsKey(reste)){
                return new int[]{map.get(reste), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    /*public static int[] calculTowSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }*/
}
