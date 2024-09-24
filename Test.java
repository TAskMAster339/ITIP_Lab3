public class Test {
    public static void hashTableTest(){
        HashTable<String, Integer> table = new HashTable<>();
        System.out.println("Is table empty? " + table.isEmpty());
        table.put("apple", 1);
        table.put("apple", 2);
        table.put("pineapple", 1);
        table.put("milk", 47);
        table.put("banana", 3);
        System.out.println(table);
        System.out.println("apple - " + table.get("apple").getFirst().getValue());
        System.out.println("apple - " + table.get("apple").getFirst().getKey());
        System.out.println(table.get("banana"));
        System.out.println("size - " + table.size());
        System.out.println("Is table empty? " + table.isEmpty());
        table.remove("pineapple");
        System.out.println(table);
    }
    public static void studentDataTest(){
        StudentData data = new StudentData();
        data.add("1БВТ23034", new Student("Дмитрий", "Гришко", 19, 2.7182818459045));
        data.add("1БВТ45567", new Student("Иван", "Иванов", 19, 3.1416));
        System.out.println(data);
        System.out.println(data.get("1БВТ23034"));
        data.remove("1БВТ45567");
        System.out.println(data);
    }
}
