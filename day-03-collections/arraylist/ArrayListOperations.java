import java.util.ArrayList;

class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();
        employees.add("Siddhi");
        employees.add("Samu");
        employees.add("Sakshi");
        employees.add("Priyanka");
        System.out.println(employees.get(1));
        employees.set(2, "Siya");
        employees.remove(0);
        System.out.println(employees.size());
        System.out.println(employees);
    }
}
