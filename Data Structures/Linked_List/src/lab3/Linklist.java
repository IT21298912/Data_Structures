package lab3;

public class Linklist {

    private Link first;

    public Linklist() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(String name, double avg) {
        Link newlink1 = new Link(name, avg);
        newlink1.next = first; // assign current first value to the new link next value
        first = newlink1;
    }

    public Link deleteFirst() {
        Link temp = first;
        first = first.next;
        return temp;
    }

    public Link deleteLink(String name) {
        Link current = first;
        Link previous = first;

        if (current == null) {
            return null;
        }

        while (!current.name.equals(name)) {
            previous = current;
            current = current.next;

            if (current == null) {
                return null;
            }
        }

        if (current == first) {
            first = first.next;
        } else {
            previous.next = current.next;
        }

        return current;
    }

    public void displayList() {
        Link current = first;
        while (current != null) {
            current.displayDetails();
            current = current.next;
        }
        System.out.println("\n");
    }
}
