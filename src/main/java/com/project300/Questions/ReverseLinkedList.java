//package com.project300.Questions;
//
//public class ReverseLinkedList {
//    /**
//     * Definition for singly-linked list.
//     * public class ListNode {
//     *     int val;
//     *     ListNode next;
//     *     ListNode() {}
//     *     ListNode(int val) { this.val = val; }
//     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//     * }
//     */
//    class Solution {
//        public ListNode reverseList(ListNode head) {
//            ListNode currentNode = head;
//            ListNode previousNode = null;
//
//            /*
//             *   At each node, set previousNode to replace the nextNode
//             *   Set previousNode to currentNode
//             *   Set currentNode to nextNode
//             *   So for [ <- P - C - N -> ] becomes:
//             *          [ <- N - C - P -> ]
//             *   Where nextNode now points to previousNode in singly LinkedList
//             */
//
//            while(currentNode != null){
//                ListNode nextNode = currentNode.next;
//                currentNode.next = previousNode;
//                previousNode = currentNode;
//                currentNode = nextNode;
//            }
//
//            return previousNode;
//        }
//    }
//}
