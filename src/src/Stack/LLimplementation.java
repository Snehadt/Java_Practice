package src.Stack;

public class LLimplementation {
   static Node head ;
   static int sz = 0;
        LLimplementation(){
            head = null;
            sz = 0;
    }
static int size(){
            return sz;
}
   void push(int num){
    Node temp = new Node(num);
    temp.next = head;
    head = temp;
    sz++;
   }

   int pop(){
            if(head == null)
                return -1;
            Node temp = head;
            head = head.next;
            sz--;
            return temp.data;
   }

   int peek(){
            if(head == null)
                return -1;
            return head.data;
   }

   static boolean isEmpty(){
            return head == null;
   }
    public static void main(String[] args) {

            LLimplementation ll = new LLimplementation();
            ll.push(5);
            ll.push(15);
             ll.push(10);
        System.out.println(size());
        System.out.println(ll.peek());
        ll.pop();
        System.out.println(ll.peek());
        System.out.println(isEmpty());
        ll.pop();
        ll.pop();
        System.out.println(ll.peek());
        System.out.println(isEmpty());
    }
}
