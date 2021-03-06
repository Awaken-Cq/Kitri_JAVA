public class TaxiGuest {

	public static void main(String[] args) {
		Taxi t1 = new Taxi();
		System.out.println("t1 >>" + t1.toString());

		Taxi t2 = new Taxi("K5","감홍색","기아");
		System.out.println("t2 >>" + t2.toString());
		
		int price = t2.initPrice();
		int km = 20;
		System.out.println(t2.info() + "를 타고 구디에서 강남까지"
		+ km + "km이동!!");
		price = t2.calcPrice(km);
		System.out.println("요금 : " + price + "원");
		t2.sumPrice();
		System.out.println("누적 수익 : " + t2.totalPrice + "원" + "  요금창 : " + t2.price + "원");


		price = t2.initPrice();
		km = 20;
		System.out.println(t2.info() + "를 타고 강남에서 구디까지"
		+ km + "km이동!!");
		price = t2.calcPrice(km);
		System.out.println("요금 : " + price + "원");
		t2.sumPrice();
		System.out.println("누적 수익 : " + t2.totalPrice + "원" + "  요금창 : " + t2.price + "원");

		int upDown = 50;
		System.out.println("t2의 속도를 " + upDown + "만큼 가속!!");
		int speed = t2.speedUp(upDown);
		System.out.println("t2의 속도 : " + speed + "  " + t2.speed);

		upDown = 250;
		System.out.println("t2의 속도를 " + upDown + "만큼 가속!!");
		speed = t2.speedUp(upDown);
		System.out.println("t2의 속도 : " + speed + "  " + t2.speed);
		
		//그냥 t1, t2에는 .toString()이 자동적용
		System.out.println(t1 + "    " + t2);
		System.out.println(t1.toString() + "    " + t2.toString());

		
		Taxi t3 = new Taxi("K5","감홍색","기아");

		//'내용'은 같지만 '값'이 같은것이 아니다.
		System.out.println(t2 + "    " + t3);
		System.out.println(t2.hashCode() + "    " + t3.hashCode());
		//'=='(비교연산자)는 기본 DT일 경우에 값을 비교하지만
		//참조형 DT일 경우는 주소값을 비교.
		 if (t2 == t3){    
            System.out.println("t2와 t3는 같은차이다.");
        } else {
            System.out.println("t2와 t3는 다른차이다.");
        }
		if (t2 == t3){	
			System.out.println("t2와 t3는 주소값이 같은차이다.");
		} else {
			System.out.println("t2와 t3는 주소값이 다른차이다.");
		}
		
		if (t2.equals(t3)){	
			System.out.println("t2와 t3는 차이름이 같은차이다.");
		} else {
			System.out.println("t2와 t3는 차이름이 다른차이다.");
		}
		

				/*Car car =new Car();
		Car car = new Taxi();
		Taxi t = new Taxi();
		t = (Taxi)car;*/

		/*Car b = new Bus();
		Taxi t = (Taxi)b;*/


	}
}

