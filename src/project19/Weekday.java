package project19;

public enum Weekday implements Info{ 
	
	MON(1,"星期一"){
		@Override
		public void show() {
			System.out.println("今天星期一");
		}//每个对象可以独立重写接口的抽象方法
	},
	TUE(2,"星期二"){
		@Override
		public void show() {
			System.out.println("今天星期二");
		}
	},
	WED(3,"星期三"){
		@Override
		public void show() {
			System.out.println("今天星期三");
		}
	},
	THS(4,"星期四"){
		@Override
		public void show() {
			System.out.println("今天星期四");
		}
	},
	FIR(5,"星期五"){
		@Override
		public void show() {
			System.out.println("今天星期五");
		}
	},
	SAT(6,"星期六"){
		@Override
		public void show() {
			System.out.println("今天星期六");
		}
	},
	SUN(7,"星期日"){
		@Override
		public void show() {
			System.out.println("今天星期天");
		}
	};
	
	private final int value;
	
	private final String name;
	
	private Weekday(int value,String name)
	{
		this.value=value;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "weekday "+value +name; 
	}

	@Override
	public void show() {
		System.out.println("时间过的真快");
	}
	
	

}
