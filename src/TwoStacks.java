class TwoStacks{
	TwoStacks(int n){
		if(n<2){
			System.out.println("Array size is not enough");
		}
		else{
			stackArray=new int[n];
			top1=-1;
			top2=n;
			size=n;
		}
	}
	private int top1;
	private int top2;
	int size;
	int stackArray[];
	
	void push1(int value){
		if(top1<top2-1){
			top1++;
			stackArray[top1]=value;
		}
		else{
			System.out.println("Stacks  full");
		}
	}
	void push2(int value){
		if(top1<top2-1){
			top2--;
			stackArray[top2]=value;
		}
		else{
			System.out.println("Stacks  full");
		}
	}
	
	int pop1(){
		if(top1>-1){
			int temp= stackArray[top1];
			top1--;
			return temp;
		}
		else{
			System.out.println("Stack1 is empty");
		}
		return 0;
	}
	
	int pop2(){
		if(top2<size){
			int temp= stackArray[top2];
			top2++;
			return temp;
		}
		else{
			System.out.println("Stack2 is empty");
		}
		return 0;
	}
	
	public static void main(String args[]){
		TwoStacks stacks= new TwoStacks(8);
		System.out.println(stacks.top1);
		System.out.println(stacks.top2);
		stacks.push1(1);
		stacks.push2(9);
		stacks.push1(2);
		stacks.push2(8);
		stacks.push1(3);
		stacks.push2(7);
		stacks.push1(4);
		stacks.push2(6);
		stacks.push1(5);
		System.out.println(stacks.pop1());
		System.out.println(stacks.pop2());
	}
}
