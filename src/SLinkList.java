public class SLinkList {
    public static void main(String[] args) {
        Employee rajuKumar = new Employee("Raju", "Kumar", 31850);
        Employee amiteshKumar = new Employee("Amitesh", "Kumar", 31850);
        Employee hiteshKumar = new Employee("Hitesh", "Kumar", 31980);
        Employee sheenalKumar = new Employee("Sheenal", "Kumar", 0232);

        EmployeeLinkedList list = new EmployeeLinkedList();
        list.addToFront(rajuKumar);
        list.addToFront(amiteshKumar);
        list.addToFront(hiteshKumar);
        list.addToFront(sheenalKumar);

        list.printList();

    }
}
