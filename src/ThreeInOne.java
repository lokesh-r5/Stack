class ThreeInOne{
	ThreeInOne(int n){
		if(n<3){
			System.out.println("Array size is not enough");
		}
		else{
			stackArray=new int[n];
			top1=-1;
			top2=n/2-1;
			top3=n;
			size=n;
			stack2Start=n/2;
		}
	}
	private int top1;
	private int top2;
	private int top3;
	private int stack2Start;
	int size;
	int stackArray[];
	
	void push1(int value){
		if(top1<stack2Start-1){
			top1++;
			stackArray[top1]=value;
		}
		else if(top3-top2>2){
			shiftRight();
			top1++;
			stackArray[top1]=value;
		}
		else{
			System.out.println("Stacks  full");
		}
	}
	void push2(int value){
		if(top2<top3-1){
			top2++;
			stackArray[top2]=value;
		}
		else if(stack2Start-top1>2){
			shiftLeft();
			top2++;
			stackArray[top2]=value;
		}
		else{
			System.out.println("Stacks  full");
		}
	}
	void shiftLeft(){
		int newStack2Start=(stack2Start+top1)/2;
		int newTop=(stack2Start+top1-1)/2;
		for(int i= stack2Start; i<=top2; i++){
			newTop++;
			stackArray[newTop]=stackArray[stack2Start];
		}
		top2=newTop;
		stack2Start= newStack2Start;
	}
	void shiftRight(){
		int newStack2Start=(top2+top3)/2;
		int newTop= (top2+top3)/2;
		for(int i=top2; i>=stack2Start;i--){
			newTop--;
			stackArray[newTop]=stackArray[top2];
		}
		top2=newTop;
		stack2Start= newStack2Start;
		
	}
	void push3(int value){
		if(top2<top3-1){
			top3--;
			stackArray[top3]=value;
		}
		else if(stack2Start-top1>2){
			shiftLeft();
			top3--;
			stackArray[top3]=value;
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
		if(top2>size/2){
			int temp= stackArray[top2];
			top2--;
			return temp;
		}
		else{
			System.out.println("Stack2 is empty");
		}
		return 0;
	}
	
	int pop3(){
		if(top3<size){
			int temp= stackArray[top2];
			top3--;
			return temp;
		}
		else{
			System.out.println("Stack3 is empty");
		}
		return 0;
	}
	
	public static void main(String args[]){
		ThreeInOne stacks= new ThreeInOne(8);
		stacks.push1(1);
		stacks.push2(9);
		stacks.push1(2);
		stacks.push2(8);
		stacks.push3(3);
		stacks.push3(7);
		stacks.push1(4);
		stacks.push2(6);
		stacks.push2(5);
		System.out.println(stacks.pop1());
		System.out.println(stacks.pop2());
		for(int i=0; i<8;i++){
			System.out.print(stacks.stackArray[i]+" ");
		}
		System.out.println(stacks.top1);
		System.out.println(stacks.top2);
		System.out.println(stacks.top3);
	}
}
