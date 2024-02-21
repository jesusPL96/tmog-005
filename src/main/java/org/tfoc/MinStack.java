package org.tfoc;

import java.util.NoSuchElementException;

/**
 * MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack()
 * obj.push(val)
 * obj.pop()
 * int param_3 = obj.top()
 * int param_4 = obj.getMin()
 */
public class MinStack {

    private ListNode topListNode;
    private ListNode minListNode;
    public MinStack() {


    }

    public void push(int val) {
        topListNode = new ListNode(val, topListNode);
        if(minListNode==null || minListNode.val >= val){
            minListNode = new ListNode(val, minListNode);
        }
    }

    public void pop() {

        if(topListNode != null){
            if(minListNode.val == topListNode.val){
                minListNode = minListNode.next;
            }
            topListNode = topListNode.next;
        } else{
            throw new NoSuchElementException("Cannot pop from empty stack");
        }

    }

    public int top() {

        if(topListNode!=null){
            return topListNode.val;
        } else {
            throw new IllegalStateException("Cannot get top element from empty stack");
        }
    }

    public int getMin() {

        return minListNode.val;
    }

}
