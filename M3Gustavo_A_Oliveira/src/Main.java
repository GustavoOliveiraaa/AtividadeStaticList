public class Main {
    public static void main(String[] args) {
        
        // Teste da classe StaticList
        StaticList<Integer> list = new StaticList<>(5);
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        System.out.println(list); 
        
        list.remove(2);
        list.remove(4);
        
        System.out.println(list); 
        
        System.out.println(list.get(1)); 
        
        list.set(1, 4);
        
        System.out.println(list); 
        
        
        // Teste da classe Metodo2
        Metodo2 metodo2 = new Metodo2();
        
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        
        int[] result = metodo2.interleaveArrays(arr1, arr2);
        
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " "); 
        }
    }
}
