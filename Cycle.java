package cn.list;

/**
 * @ClassName Cycle
 * @Description 判断一个链表是否带环，若带环返回环的入口。
 * @Auther danni
 * @Date 2019/7/27 17:23]
 * @Version 1.0
 **/

public class Cycle {
    public Node detectCycle(Node node){
        Node fast=node;
        Node slow=node;
        do{
            if(fast==null){
                return null;
            }
            fast=fast.next;
            if(fast==null){
                return null;
            }
            fast=fast.next;
            slow=slow.next;
            if(fast==slow){
                slow=node;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
            }
        }while(fast!=slow);
        return slow;
    }
    public static void main(String[] args) {
        Node node=new Node(1);
        node.next=new Node(2);
        node.next.next=new Node(3);
        node.next.next.next=new Node(4);
        node.next.next.next.next=node.next;
      //  System.out.println(  node.next.next.next.next.data);
         Cycle c=new Cycle();
        System.out.println(c.detectCycle(node));
    }
}
