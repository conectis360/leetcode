import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j}; // Retorna os índices, não os valores
                }
            }
        }
        return new int[0]; // Retorna um array vazio se nenhum par for encontrado
    }

    public int[] twoSumFaster(int[] nums, int target) {
        // é mais rápido pois processa apenas uma unica vez ao invés de 2 e também não percorre todo o array
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }

}
