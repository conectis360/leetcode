import java.util.HashSet;

public class containsDuplicate {
    public boolean hasDuplicate(int[] nums) {
        // Cria uma estrutura de dados que não permite duplicatas (HashSet).
        Set<Integer> setSemDuplicatas = new HashSet<>();

        // Adiciona todos os elementos do array ao conjunto.
        // Se houver duplicatas, elas não serão adicionadas novamente ao conjunto.
        for (int num : nums) {
            setSemDuplicatas.add(num);
        }

        // Compara o tamanho do array original com o tamanho do conjunto.
        // Se os tamanhos forem diferentes, significa que duplicatas foram removidas.
        return nums.length != setSemDuplicatas.size();
    }
}
