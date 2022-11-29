package Day_44;

public class Linked_List_1 {
    public static void main(String[] args) {
        
    }
}

// Merge two sorted linked lists ( GFG )

class LinkedList
{
    Node sortedMerge(Node head1, Node head2) {
     Node cur = new Node (0);
     Node head = cur ;
     
     Node one = head1 ;
     Node two = head2 ;
     
     while ( one != null && two != null ){
         if ( one.data < two.data ){
            cur.next = one;
             one = one.next ;
         } else {
              cur.next = two ;
             two = two.next ;
         }
         
         cur = cur.next ;
     }
     
     while ( one != null ){
         cur.next = one ;
             one = one.next ;
             cur = cur.next ;
     }
     
     while ( two != null ){
          cur.next = two ;
             two = two.next ;
            cur = cur.next ;
     }
     
     return head.next ;
   } 
}

// Introduction to Doubly Linked List ( GFG )

class Solution1 {
    Node constructDLL(int arr[]) {
        Node cur = new Node(arr[0]);
        Node head = cur ;
        
        if ( arr.length > 1 ){
            for( int i = 1 ; i < arr.length ; i++ ){
                int val = arr[i];
                Node temp = new Node (val);
                cur.next = temp ;
                cur = cur.next ;
            }
        }
        
        return  head ;
        
    }
}

// Introduction to Linked List ( GFG )

class Solution2 {
    static Node constructLL(int arr[]) {
         Node cur = new Node(arr[0]);
        Node head = cur ;
        
        if ( arr.length > 1 ){
            for( int i = 1 ; i < arr.length ; i++ ){
                int val = arr[i];
                Node temp = new Node (val);
                cur.next = temp ;
                cur = cur.next ;
            }
        }
        
        return  head ;
    }
}

// Search in Linked List ( GFG )

class Solution {
    static boolean searchKey(int n, Node head, int key) {
        // Code here
        while ( head != null ){
            if ( head.data == key){
                return true ;
            }
            head = head.next ;
        }
        
        return false ;
    }
}

// Occurence of an integer in a Linked List ( GFG )

class Solution4
{
    public static int count(Node head, int key)
    {
        int count = 0 ;
        
        while ( head != null ){
            if ( head.data == key){
                count++ ;
            }
            head = head.next ;
        }
        
        return count ;
    }
}

// 
