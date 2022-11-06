package stackandqueuesproblem;

    
    import java.util.Iterator;
import java.util.LinkedList;

    public class DequeueThequeueFromTheBeiginning {

        //Declaring Linked List
        private static LinkedList list = new LinkedList();

        //Creating Queue method
        public void enqueue (Object data)
        {
            list.add(data);
        }

        //Printing the top value
        public Object peak()
        {
            return list.getFirst();
        }

        //Dequeue the top value
        public Object poll()
        {
            return list.removeFirst();
        }

        //Printing the values of Queue
        public void printQueue()
        {
            System.out.println("Queue values are printed below");
            if (!list.isEmpty())
            {
                Iterator it = list.iterator();
                while (it.hasNext())
                {
                    System.out.print(it.next()+" ");
                }
            }
            else
            {
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

            //Printing the total stack
            System.out.println("Printing the original Queue");
            queue.printQueue();

            //Printing top element and dequeue it from Queue unless it is empty
            while (!list.isEmpty())
            {
                System.out.println("Top element present in Queue is : "+queue.peak());
                System.out.println("Dequeue top element from Queue : "+queue.poll);
                System.out.println("Printing the Queue");
                queue.printQueue();
                System.out.println();
            }

        }
    }

