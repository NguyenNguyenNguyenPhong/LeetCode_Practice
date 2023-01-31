package LeetCode;

public class _622_LeetCode {
    static class MyCircularQueue{

        int[] array;
        int SIZE;
        int headIndex;
        int tailIndex;
        int Count =0 ;// current number of element
        public MyCircularQueue(int k) {
            SIZE = k;
            array = new int[SIZE];
            headIndex = tailIndex = -1;
        }

        public boolean enQueue(int value) {
            if(isFull() == false){
                tailIndex++;

                if(tailIndex == SIZE) tailIndex = 0;
                if(isEmpty() == true) headIndex = tailIndex;
                array[tailIndex] = value;
                Count++;
                return true;
            }
            return false;
        }

        public boolean deQueue() {
            if(isEmpty() == true) return false;
            headIndex++;
            if(headIndex == SIZE)
                headIndex = 0;
            Count--;
            return true;
        }

        public int Front() {
            if(isEmpty())
                return -1;
            return array[headIndex];
        }

        public int Rear() {
            if(isEmpty())
                return -1;
            return array[tailIndex];
        }

        public boolean isEmpty() {
            return Count <= 0;
        }

        public boolean isFull() {
            return Count >= SIZE;
        }
    }

    public static void main(String[] args) {
        MyCircularQueue myCircularQueue = new MyCircularQueue(3);
        myCircularQueue.enQueue(1);
        myCircularQueue.enQueue(2);
        myCircularQueue.enQueue(3);
        myCircularQueue.deQueue();
        myCircularQueue.enQueue(4);

    }
}
