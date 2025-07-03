/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution {
    public static Node reverseKGroup(Node head, int k) {
        // code here
        Node current = head;
        Node newHead = null;
        Node preTail = null;
        while(current != null){
            
            Node groupHead = current;
            Node temp = current;
            int count = 0;
            
            while(temp != null && count <k){
                temp = temp.next;
                count++;
            }
            Node prev = null;
            Node next = null;
            int revCount = 0;
            while( current != null && revCount <count){
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
                revCount++;
            }
            if (newHead == null){
                newHead = prev;
            }
            
            if (preTail != null){
                preTail.next = prev;
            }
            
            preTail = groupHead;
            
        }
        return newHead;
    }
}