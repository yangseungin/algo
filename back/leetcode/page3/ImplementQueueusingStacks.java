package page3;

import java.util.Stack;

public class ImplementQueueusingStacks {
	public static void main(String[] args) {
		MyQueue queue = new MyQueue();

		queue.push(1);
		queue.push(2);
		queue.peek(); // returns 1
		queue.pop(); // returns 1
		queue.empty(); // returns false
	}

	public static class MyQueue {
		Stack<Integer> input = new Stack();
		Stack<Integer> output = new Stack();

		/** Initialize your data structure here. */
		public MyQueue() {

		}

		/** Push element x to the back of queue. */
		public void push(int x) {
			input.push(x);
		}

		/**
		 * Removes the element from in front of queue and returns that element.
		 */
		public int pop() {
			peek();
			return output.pop();

		}

		/** Get the front element. */
		public int peek() {
			  if (output.empty())
		            while (!input.empty())
		                output.push(input.pop());
		        return output.peek();
		}

		/** Returns whether the queue is empty. */
		public boolean empty() {
			return input.empty() && output.empty();
		}
	}

}
