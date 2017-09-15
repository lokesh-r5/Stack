class StackMin{
	class StackNode{
		int value;
		StackNode next;
		int minValue;
		StackNode(int value){
			this.value= value;
			this.next= null;
			this.minValue= value;
		}
	}
	StackNode top;
	void push(int value){
		StackNode newStackNode= new StackNode(value);
		if(top==null){
			top=newStackNode;
		}
		else{
			newStackNode.next= top;
			if(top.minValue<newStackNode.minValue){
				newStackNode.minValue= top.minValue;
			}
			top= newStackNode;
		}
	}
	
	int pop(){
		if(top==null){
			System.out.println("stack is empty");
		}
		else{
			int temp= top.value;
			top= top.next;
			return temp;
		}
		return 0;
	}
	
	int min(){
		if(top==null){
			System.out.println("stack is empty");
		}
		else{
			int temp= top.minValue;
			top= top.next;
			return temp;
		}
		return 0;
	}
	public static void main(String args[]){
		StackMin stack= new StackMin();
		stack.push(1);
		stack.push(9);
		stack.push(2);
		stack.push(8);
		stack.push(3);
		stack.push(7);
		System.out.println(stack.pop());
		System.out.println(stack.min());
	}
}