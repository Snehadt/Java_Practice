package src.Stack;

public class TwoStacks {
    int arr[];
    int cap;
    int top1;
    int top2;

    TwoStacks(int capactity){
        arr = new int[capactity];
        cap = capactity;
        top1 = -1;
        top2 = capactity;
    }

    public static void main(String[] args) {

        push1(5);
        push2(5);
    }

    private static void push1(int i) {
        TwoStacks st = new TwoStacks(i);

        int top =st.top1++;
        st.arr[top] = i;

    }

    private static void push2(int i) {
        TwoStacks st = new TwoStacks(i);
        int top = st.top2--;
        st.arr[top] = i;

    }

}
