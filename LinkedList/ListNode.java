

 // Definition for singly-linked list.
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class ll876leetcode {
    public ListNode middleNode(ListNode head) {
     ListNode temp = head;
     int len = 0;
     while(temp != null){
        temp = temp.next;
        len++;
     }   
     int mid = len/2 + 1;
     temp = head;
     for(int i=1; i<=mid-1; i++){
        temp = temp.next;
     }
     return temp;
    }
}

//next other

class Solution {
    public void reverseList(ListNode head) {

       // Iterative Method
       ListNode curr = head;
       ListNode prev = null;
       ListNode Next = null; // head
       while (curr != null) {
           Next = curr.next;
           curr.next = prev;
           prev = curr;
           curr = Next;

       }
       // return prev;
   }
   public ListNode reverseBetween(ListNode head, int left, int right) {
       // if(head.next==null || left==right) return head;
     ListNode a = null, b = null, c = null, d = null;
     int pos = 1;
     ListNode temp = head;
     while(temp!=null){
       if(pos==left-1) a=temp;
       if(pos==left) b=temp;
       if(pos==right) c=temp;
       if(pos==right+1) d=temp;
       temp = temp.next;
       pos++;
     }  
     if(a!=null) a.next = null;
     if(c!=null) c.next = null;
     reverseList(b);
     if(a!=null) a.next = c; 
     b.next = d;
     if(a==null) return c;
     return head;
   }
}