package src.LinkedList;

import java.util.*;

public class linkedlistclass {

    public static class Node{
        int i;
        Node next;

        Node(int x){
            i = x;
            next = null;
        }

    }

    public static class Nod1{

        int data ;
        Nod1 prev;
        Nod1 next;

        Nod1(int x){
            data = x;
            prev = null;
            next = null;
        }

    }

    public static class Nodc{

        int data;
        Nodc next;

        Nodc(int x){
            data = x;

        }

    }

    public static class Nodcc{
        int data;
        Nodcc prev;
        Nodcc next;

        Nodcc(int x){
            data = x;
        }
    }

    public static class LRUCache{
      public  Deque<Integer> de;
        HashSet<Integer> hs;
        int CACHE_SIZE ;
        LRUCache(int capacity){
             de = new LinkedList<>();
             hs = new HashSet<>();
            CACHE_SIZE = capacity;

        }
    }
    public static void main(String[] args) {
     /*   Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.next = temp2;*/

      //  Node head = null;
/*         head =  insertAtbegining(30,head);
        head =  insertAtbegining(5,head);
head = insertAtEnd(20,head);*/

     //    printInt(head);

      //  printRec(head);
        
      //  insertAtbegining(5,head);
   /*     head = insertAtGivenPos(2,24,head);
       head = insertAtGivenPos(4,44,head);
        head = insertAtGivenPos(3,34,head);
        head = insertAtGivenPos(1,14,head);*/
    
       /* printInt(head);
        deleteFirstNode(head);
        System.out.println("**************");
       *//* printInt(head);*//*

        for (Node temp = head; temp != null; temp = temp.next)
            System.out.print(temp.i + " ");*/
/*Node head = null;
        head =pushData(head,5);
        head =pushData(head,6);
        head =pushData(head,7);*/
      /*  deleteLast(head);

        for(Node temp = head; temp != null ; temp = temp.next){
            System.out.println(temp.i+" ");

        
        }*/
        
     /*   searchinLl(head,5);*/

        /// Doubly Linked List
/*
        Nod1 head = null;
        head= pushDll(head,7);
        head= pushDll(head,1);
        head= pushDll(head,6);
        head= pushDll(head,4);
        
        head =pushAtBeg(head,10);

        for(Nod1 temp = head ; temp != null; temp =temp.next)
            System.out.println(temp.data+"  ");
        System.out.println("*******************************");
       // head = reverseALl(head);

       // head = deleteHead(head);
    //    head =deleteLastDLl(head);

       head = inserATgivenPosDll(head, 2,11);
       
      head = insertAtLastDll(head,40);

        for(Nod1 temp = head ; temp != null; temp =temp.next)
            System.out.println(temp.data+"  ");*/

        // circular single ll
      /*  Nodc head = null;
       head = circularSpush(head,6);
        head = circularSpush(head,5);

       for(Nodc temp = head ; temp != null ; temp = temp.next)
           System.out.println(temp.data +" ");*/

      /*  Nodc head = null;
       head = insertAtBegCircularLL(head,5);
        head = insertAtBegCircularLL(head,4);
        head = insertAtBegCircularLL(head,6);

        head = insertAtEndCircularLL(head,10);
        circularLLTraversal(head);
        System.out.println("***********************************");
        head = deleteHeadCircularLL(head);
        deleteKthNodeCircularLL(head,1);
         circularLLTraversal(head);*/

        //DOuble Circular LL

      /*  Nodcc head = null;
       head = circularDllPush(head,5);
        head = circularDllPush(head,4);


        circularDLLTraversal(head);*/

        Node head = null;
        head = pushData(head,40);
        head = pushData(head,30);
        head = pushData(head,10);
        head = pushData(head,10);

      /*  for(Node temp = head ; temp != null ; temp = temp.next)
            System.out.println(temp.i);*/
        head = insertinSortedSingleLL(head,5);
        head = insertinSortedSingleLL(head,7);
     //  head = insertinSortedSingleLL(head,35);
        System.out.println("*****");
        for(Node temp = head ; temp != null ; temp = temp.next)
            System.out.println(temp.i);
     /*   int nodeVal = middleOfLL(head);
        System.out.println(nodeVal);*/
     //  head = reverseLL(head);
      // head = removeDupSortedLL(head);
      //  head =reverseInGroup(head,3);
        System.out.println("*****");

     /*   head = createLoop(head,2);

        System.out.println("*****");
      head =  removeLoop(head);*/
        System.out.println("@@@@@@@@@@@@");
       // head = oddEvenSeg(head);

     // head =  pairwiseSwap(head);
        LRUCache lc = new LRUCache(3);
        cachework(10);
        for(Node temp = head ; temp != null ; temp = temp.next)
            System.out.println(temp.i);

    }

    private static void cachework(int page) {
        Deque<Integer> de = new LinkedList<>();
        HashSet<Integer> hs =  new HashSet<>();;
        int CACHE_SIZE = 4;

        if(!hs.contains(page)){
            if(de.size() == CACHE_SIZE){
               int last =  de.removeLast();
               hs.remove(last);
            }
        }else{
            de.remove(page);
        }de.push(page);
        hs.add(page);
    }

    private static Node pairwiseSwap(Node head) {
        if(head == null || head.next != null)
            return head;
        int count = 1;
        Node temp = head;
        Node next = temp.next;
        Node curr = null;
        while(temp != null){
            if(count ==2) {
                curr = next;
                next.i = temp.i;
                temp.i = curr.i;
                ;
            }
            else count ++;
        }return head;
    }

    private static Node oddEvenSeg(Node head) {

        Node temp = head;
        Node even_start = null;
        Node odd_start = null;
        Node even_end = null;
        Node odd_end = null;
        if(head == null || head.next != null)
            return head;
        while(temp != null){
            if(temp.i%2 == 0) {
                if(even_start == null){
                    even_start = temp;
                    even_end = temp;
                }
                else{
                    even_end.next = temp;
                    even_end = even_end.next;
                }
            }else{
                if(odd_start == null){
                    odd_start = temp;
                    odd_end = temp;
                }else{
                    odd_end.next = temp;
                    odd_end = odd_end.next;
                }


            }temp = temp.next;

        }even_end.next = odd_start;
        odd_end.next = null;

        return even_start;
    }

    private static Node removeLoop(Node head) {

        Node slow = head;
        Node fast = head;
        Node pointer = head;

        while(fast != null || fast.next != null){
            slow = slow.next;
            pointer = fast;
            fast = fast.next.next;


            if(slow.i == fast.i){
                pointer.next = null;
            }

        }return head;
    }

    private static Node createLoop(Node head, int pos) {
        Node temp = head;
        int count = 1;

            if(count < pos) {
                temp = temp.next;
                count++;
            }
        Node joint_pt = temp;
        while(temp.next != null)
            temp = temp.next;
        temp.next =  joint_pt;

        return head;



    }

    private static Node reverseInGroup(Node head, int group) {
        int count = 1;
        Node curr = head;
        Node prev = null;
        Node next = null;
        while(curr != null && count <=group){
           next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next ;
            count++;
        }

        if(next != null){
          head.next =  reverseInGroup(next,group);
        }
        return prev;
    }

    private static Node removeDupSortedLL(Node head) {

       /* unsorted array*/
       /* Node curr = head;
        Node prev = null;
        Set<Integer> set = new HashSet();

        while(curr != null){
           int x = curr.i;
            if(set.contains(x))
                prev.next = curr.next;
            else{
                set.add(x);
                prev = curr;
            }curr = curr.next;
        }return head;*/

        /*sorted array*/
        Node curr = head;
        Node next = curr.next;

        while(curr.next != null){
            if(curr.i == next.i){
                curr.next = next.next;


            }else{
                curr = curr.next;
            }next = next.next;


        }return head;


    }

    private static Node reverseLL(Node head) {
       if(head == null || head.next == null)
           return head;
       Node prev = null;
       Node curr = head;
       Node next = null;

       while(curr != null){
           next = curr.next;
           curr.next = prev;
           prev = curr;
           curr = next;
       } return prev;
    }

    private static int middleOfLL(Node head) {

        if(head == null || head.next ==null)
            return head.i;

        Node curr = head;
        Node pss = head;
        int count = 1;

        while(curr != null){
            curr = curr.next;
            count++;
        }


            count = count+1;
        int pos = count/2;
        int c2 = 1;

        while(c2 != pos){
            pss = pss.next;
            c2++;
        }return pss.i;
    }

    private static Node insertinSortedSingleLL(Node head, int i) {
        Node temp = new Node(i);
        Node curr = head;

        if(head == null)
            return temp;

        if(head.i > temp.i){
            temp.next = head;
        head=temp;
        return head;}



        while(curr.next != null){
            if(curr.i < temp.i && curr.next.i > temp.i){
                temp.next =curr.next;
                curr.next = temp;
            }
            else if(curr.next == null & curr.i == temp.i){
                    curr.next = temp;

            }

            curr = curr.next;
        }if(curr.i < temp.i)
            curr.next = temp;

        return head;
    }

    private static void circularDLLTraversal(Nodcc head) {
        if(head == null)
            return ;

        System.out.println(head.data);
        for(Nodcc temp = head.next ; temp != head ; temp = temp.next)
            System.out.println(temp.data);
    }

    private static Nodcc circularDllPush(Nodcc head, int data) {
        Nodcc temp = new Nodcc(data);
        if(head == null){
            temp.next = temp ;
            temp.prev = temp ;
            return temp;
        }
        else{
            head.prev.next = temp;
            temp.next =head;
            head.prev = temp;



        }

        return temp;
    }

    private static Nodc deleteKthNodeCircularLL(Nodc head, int pos) {

        int count = 1;
        Nodc curr = head;
        if(head == null)
            return head;

        if(pos == 1)
            deleteHeadCircularLL(head);
        else {
            while (count < pos - 1) {
                curr = curr.next;
                count++;
            }
            curr.next = curr.next.next;
        }
        return head;
    }

    private static Nodc deleteHeadCircularLL(Nodc head) {

        if(head == null)
            return head;

        Nodc curr = head.next;

        if(head.next == head)
            return null;

        else{
            int x = head.data;
            head.data = curr.data;
            curr.data = x;

            head.next = head.next.next;


        }return head;
    }

    private static Nodc insertAtEndCircularLL(Nodc head, int data) {

        Nodc temp = new Nodc(data);
        Nodc curr = head;

        if(head == null){
            temp.next = temp;
            return temp;
        }
        else{
            temp.next = curr.next;
            curr.next = temp;
            int x = temp.data;
            temp.data = curr.data;
            curr.data = x;
            head = head.next;
           
        }return head;
    }

    private static Nodc insertAtBegCircularLL(Nodc head, int data) {
       /* Nodc curr = head;
        Nodc temp = new Nodc(data);

        if(head == null)
            return temp.next = temp;

        else {
            while (curr.next != head)
                curr = curr.next;
            curr.next = temp;
            temp.next = head;
        }
        return temp;*/

        Nodc temp = new Nodc(data);
        Nodc curr = head;

        if(curr == null){
            temp.next = temp;
            return temp;
        }


        else{
            temp.next = curr.next;
            curr.next = temp;

            int x = temp.data;
            temp.data = curr.data;
            curr.data = x;
            curr = temp;
        } return head;

    }

    private static void circularLLTraversal(Nodc head){

        Nodc curr = head;
        if(head == null)
            return;
        System.out.println(curr.data);
        for(Nodc temp = head.next ; temp != head ; temp = temp.next)
            System.out.println(temp.data);
       /* do{
            System.out.println(curr.data);
            curr = curr.next;
        }

        while(curr != head);*/

    }
    private static Nod1 insertAtLastDll(Nod1 head, int num) {

        Nod1 temp = new Nod1(num);
        if(head == null)
            return temp;

        Nod1 curr = head;

        while(curr.next != null){
            curr.prev = curr;
            curr = curr.next;
        }

        curr.next = temp;
        temp.prev = curr;

        return head;
    }

    private static Nod1 inserATgivenPosDll(Nod1 head, int pos,int num) {

        Nod1 temp = new Nod1(num);

        if(head == null)
            return head;
        Nod1 curr = head;
        int count = 1;
        while(count != pos) {
            curr.prev = curr;
            curr = curr.next;
            count++;
        }

        curr.prev.next = temp;
        temp.prev = curr.prev;
        temp.next = curr;

return head;
    }

    private static Nodc circularSpush(Nodc head,int x) {

        Nodc temp = new Nodc(x);

        if(head == null || head.next ==null)
            return temp;

        Nodc curr = head;

        while(curr != null){
           temp.next = curr;
           curr = temp;

        }return head;
    }

    private static Nod1 deleteLastDLl(Nod1 head) {
        if(head == null || head.next == null)
            return head;

        Nod1 curr = head;

            while(curr.next != null) {
                curr = curr.next;

            }
      curr.prev.next = null;
            return head;

    }

    private static Nod1 deleteHead(Nod1 head) {

        if(head == null || head.next == null)
            return head;
        Nod1 temp = head;
         if(temp.prev == null){
             temp = temp.next;
             temp.prev = null;

         }return temp;
    }

    private static Nod1 reverseALl(Nod1 head) {

        if(head == null || head.next == null)
            return head;
        Nod1 prev = null;

        Nod1 curr = head;

        while(curr != null){
            prev = curr.prev;
            curr.prev =  curr.next;
            curr.next = prev;
            curr = curr.prev;
        } return prev.prev;
    }

    private static Nod1 pushAtBeg(Nod1 head, int data) {

        Nod1 temp = new Nod1(data);

        temp.data = data;
        temp.next = head;
        temp.prev = null;

        if(head == null)
            return temp;

        if(head != null)
            head.prev = temp;
        head =temp;

        return head;

    }

    private static Nod1 pushDll(Nod1 head, int data){

      Nod1 temp = new Nod1(data);
      temp.next = head;
      temp.prev = null;

      if(head != null)
          head.prev = temp;
      head = temp;

      return head;


    }

    private static void searchinLl(Node head, int data) {
       /* Node temp = head;
        int count = 1;
        while(temp != null){
           if( temp.i == data)
               System.out.println(temp.i+"  "+count);
           temp = temp.next;
           count++;
        }*/


    }

    private static Node pushData(Node head, int num) {

        Node node = new Node(num);
        node.i = num;
        node.next = head;
        head = node;

        return head;
    }

    private static Node deleteLast(Node head) {

        if(head == null)
            return head;
        if(head.next == null)
            return null;

        Node temp = head;
        while(temp.next.next != null)
            temp = head.next;

        temp.next = null;

return head;

    }

    private static Node deleteFirstNode(Node head) {
        if(head == null)
            return null;
        Node temp = head;

        head = head.next;
        return head;

    }

    private static Node insertAtGivenPos(int pos, int num, Node head) {
        Node temp = new Node(num);
         Node curr = head;

         if(pos == 1)
             return temp;
            for(int i = 1 ; i < pos -1 && curr != null; i++)
                curr = curr.next;
                if(curr == null)
                return head;
                temp.next = curr.next;
                curr.next = temp;
                return head;



    }

    private static Node insertAtEnd(int num, Node head) {
        Node curr = new Node(num);
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }temp.next = curr;
        return head;
    }

    private static Node insertAtbegining(int num, Node head) {
        Node curr = new Node(num);

        curr.next = head;
        return curr;

    }

    private static void printRec(Node head) {

        if(head == null)
            return;
            System.out.println(head.i);
            printRec(head.next);

    }

    private static void printInt(Node head) {

        while(head != null){
            System.out.println(head.i);
            head = head.next;
        }
    }
}
