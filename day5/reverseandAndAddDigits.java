
import java.util.*;
public class reverseandAndAddDigits {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
        Node(int val,Node next){
            this.val = val;
            this.next = next;
        }
    }
    public static Node insertback(Node head, int val){
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = new Node(val);
        return head;
    }
    public static void printLL(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.println("end");
    }
    public static Node reverseLL(Node head){
        Node prev = null;
        Node nxt = head.next;
        while(head!=null){
            head.next = prev;
            prev=head;
            head= nxt;
            if(nxt!=null)
                nxt=nxt.next;
        }
        return prev;
    }
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("SIze of LL 1: ");
        int n1=scr.nextInt();
        System.out.println("elements of LL 1: ");
        Node head1 = new Node(scr.nextInt());

        for(int i =1;i<n1;i++){
            int val = scr.nextInt();
            insertback(head1,val);
        }
        printLL(head1);
       head1= reverseLL(head1);
        printLL(head1);
        System.out.println("SIze of LL 2: ");
        int n2=scr.nextInt();
        System.out.println("elements of LL 2: ");
        Node head2 = new Node(scr.nextInt());

        for(int i =1;i<n2;i++){
            int val = scr.nextInt();
            insertback(head2,val);
        }
        printLL(head2);
        head2= reverseLL(head2);
        printLL(head2);

        Node temp1 = head1;
        Node temp2 = head2;
        Node anshead=null;
        int carry = 0;
        while(temp1!=null && temp2!=null){
            int add = temp1.val+temp2.val+carry;
            if(add>9){
                carry = add/10;
                add%=10;
            }
            Node temp = new Node(add);
            temp.next = anshead;
            anshead=temp;
            temp1=temp1.next;
            temp2=temp2.next;
        }
        while(temp1!=null){
            int add = temp1.val+carry;
            if(add>9){
                carry = add/10;
                add%=10;
            }
            Node temp = new Node(add);
            temp.next = anshead;
            anshead=temp;
            temp1=temp1.next;
        }
        while(temp2!=null){
            int add = temp2.val+carry;
            if(add>9){
                carry = add/10;
                add%=10;
            }
            Node temp = new Node(add);
            temp.next = anshead;
            anshead=temp;
            temp2=temp2.next;
        }
        if(carry>0){
            Node temp = new Node(carry);
            temp.next = anshead;
            anshead=temp;
        }
        printLL(anshead);
    }
}
