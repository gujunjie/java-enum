package project19;

public class Text {
         
	public static void main(String[] args) {
		
		Weekday mon=Weekday.MON;
		mon.show();
		System.out.println(mon.toString());
		
		for(Weekday w:Weekday.values())//values方法：返回该枚举类所有对象的数组
		{
			System.out.println(w.toString());
		}
		
		Weekday tue=Weekday.valueOf("FIR");//valueOf方法：通过传入一个字符串返回指定名的枚举类对象
		System.out.println(tue.toString());
		tue.show();
		
		
		
		
	}
	
}
