package work10;

public class Queue {
   static final int MAXQUEUE = 3;
   int[] queue = new int[MAXQUEUE];
   int front, rear;
   // �غc�l
   public Queue() { front = 0; rear = 0; }
   public boolean isEmpty() { return (front==rear); }// ��C�O�_�O�Ū�
   public boolean isFull() {// ��C�O�_�w��
      int index = rear+1 < MAXQUEUE ? rear+1 : 0;
      return (index == front);
   }
   public void enqueue(int value) {// �s�J���
      queue[rear] = value;
      rear = rear+1 < MAXQUEUE ? rear+1 : 0;
   }
   public int dequeue() {			// ���X���	
      int data = queue[front];
      front = front+1 < MAXQUEUE ? front+1 : 0;
      return data;
   }
}