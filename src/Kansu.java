
public class Kansu {
	
	public static int totalPrice(int fruitprice, double tax ,int haiso ){
		
		 return (int)(fruitprice*tax)+haiso ;
		 
	}
	
	public static String hello(){
		 return "こんにちは";
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		double tax = 1.08;
		int haiso = 350;
		
		System.out.println("山田さん。"+hello());
		System.out.println("鈴木さん。"+hello());
		System.out.println("佐藤さん。"+hello());
		
		System.out.println(totalPrice(300, tax, haiso));
		System.out.println(totalPrice(450, tax, haiso));
		System.out.println(totalPrice(400, tax, haiso));
		System.out.println(totalPrice(350, tax, haiso));
		
	}
	
	

}
