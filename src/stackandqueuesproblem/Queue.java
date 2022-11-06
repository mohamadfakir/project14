package stackandqueuesproblem;

    import java.util.Iterator;
import java.util.LinkedList;

    public class Queue {

        //Declaring Linked List
        private static LinkedList list = new LinkedList();
        public String poll;

        //Creating Queue method
        public void enqueue(Object data) {
            list.add(data);
        }

        //Printing the top value
        public Object peak() {
            return list.getFirst();
        }

        //Printing the values of Queue
        public void printQueue() {
            System.out.println("Queue values are printed below");
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    System.out.print(it.next() + " ");
                }
            } else {
                System.out.println("Queue is empty");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            Queue queue = new Queue();

            //Adding values in stack
            queue.enqueue(56);
            queue.enqueue(30);
            queue.enqueue(70);

            //Printing the top element of stack
            System.out.println("Top element of Queue is : " + queue.peak());

            //Printing the total stack
            queue.printQueue();

        }
    }




