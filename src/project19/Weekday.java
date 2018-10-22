package project19;

public enum Weekday implements Info{ 
	
	MON(1,"����һ"){
		@Override
		public void show() {
			System.out.println("��������һ");
		}//ÿ��������Զ�����д�ӿڵĳ��󷽷�
	},
	TUE(2,"���ڶ�"){
		@Override
		public void show() {
			System.out.println("�������ڶ�");
		}
	},
	WED(3,"������"){
		@Override
		public void show() {
			System.out.println("����������");
		}
	},
	THS(4,"������"){
		@Override
		public void show() {
			System.out.println("����������");
		}
	},
	FIR(5,"������"){
		@Override
		public void show() {
			System.out.println("����������");
		}
	},
	SAT(6,"������"){
		@Override
		public void show() {
			System.out.println("����������");
		}
	},
	SUN(7,"������"){
		@Override
		public void show() {
			System.out.println("����������");
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
		System.out.println("ʱ��������");
	}
	
	

}
