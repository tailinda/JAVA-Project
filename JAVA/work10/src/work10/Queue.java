package work10;

public class Queue {
   static final int MAXQUEUE = 3;
   int[] queue = new int[MAXQUEUE];
   int front, rear;
   // 建構子
   public Queue() { front = 0; rear = 0; }
   public boolean isEmpty() { return (front==rear); }// 佇列是否是空的
   public boolean isFull() {// 佇列是否已滿
      int index = rear+1 < MAXQUEUE ? rear+1 : 0;
      return (index == front);
   }
   public void enqueue(int value) {// 存入資料
      queue[rear] = value;
      rear = rear+1 < MAXQUEUE ? rear+1 : 0;
   }
   public int dequeue() {			// 取出資料	
      int data = queue[front];
      front = front+1 < MAXQUEUE ? front+1 : 0;
      return data;
   }
}