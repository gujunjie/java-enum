package project19;

public class Text {
         
	public static void main(String[] args) {
		
		Weekday mon=Weekday.MON;
		mon.show();
		System.out.println(mon.toString());
		
		for(Weekday w:Weekday.values())//values���������ظ�ö�������ж��������
		{
			System.out.println(w.toString());
		}
		
		Weekday tue=Weekday.valueOf("FIR");//valueOf������ͨ������һ���ַ�������ָ������ö�������
		System.out.println(tue.toString());
		tue.show();
		
		
		
		
	}
	
}
