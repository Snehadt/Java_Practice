package src.Queue;


public class QueueDS {
static int arr[] ;
static int size;
int cap;
   static  int front;
   static  int rear;
    QueueDS(int c){
    cap = c;
    int size = 0;
    arr = new int[c];
    front = 0;
    rear = 0;
}
static boolean isEmpty(){
        return size == 0;
}

static boolean isFull(){
     //   return size == cap;
    return false;
}
    static void enqueue(int i) {
if(isFull())
    return ;
      arr[size] = i;
      size++;

    }

    static  void dequeue(){
        if(isEmpty())
            return;
        else{
            for(int i = 0 ; i < size -1 ; i++)
                arr[i] = arr[i+1];
            size--;
        }
    }

    int front(){
        if(isEmpty())
            return -1;
        else
        return arr[0];
    }

    int rear(){
        if(isEmpty())
            return -1;
        else
            return arr[size -1];
    }


    public static void main(String[] args) {

QueueDS qs = new QueueDS(5);
        enqueue(10);
    }


}
