/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode node = new ListNode(0);
        ListNode temp = node;
        ListNode point1 = list1;
        ListNode point2 = list2;
        while(point1 != null && point2 != null){
            if(point1.val <= point2.val){
                temp.next = point1;
                point1 = point1.next;
            }else{
               temp.next =  point2;
               point2 = point2.next;
            }
            temp = temp.next;
        }
        if(point1 != null) temp.next = point1;
        else if(point2 != null )temp.next = point2;
        return node.next;
    }
}