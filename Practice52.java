import java.util.Scanner;

public class Practice52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Shape[] s = new Shape[3];
		
		int i;
		for (i = 0; i < s.length; i++) {
			if (i == 0) { 
				System.out.print("도형의 정보를 입력하세요 (X좌표, Y좌표): ");
				Shape s1 = new Shape();
				s1.setX(sc.nextInt());
				s1.setY(sc.nextInt());
				s[i] = s1;
			} else if (i == 1) { 			
				System.out.print("사각형의 정보를 입력하세요: ");
				Rectangle r1 = new Rectangle();
				r1.setX(sc.nextInt());
				r1.setY(sc.nextInt());
				r1.setWidth(sc.nextDouble());
				r1.setLength(sc.nextDouble());
				s[1] = r1; 
			} else if (i == 2) {			
				System.out.print("삼각형의 정보를 입력하세요: ");
				Triangle t1 = new Triangle();
				t1.setX(sc.nextInt());
				t1.setY(sc.nextInt());
				t1.setBase(sc.nextDouble());
				t1.setHeight(sc.nextDouble());
				s[2] = t1;
			}		
		}
		
		System.out.println();
		
		System.out.println("입력된 정보입니다.\n");
		System.out.println("1. 도형, " + s[0].toString());
		System.out.println("2. 사각형, " + s[1].toString());
		System.out.println("3. 삼각형, " + s[2].toString());		
		
		System.out.println();
		
		System.out.print("중심좌표 이동 거리를 입력하세요 (dx, dy): ");
		int dx = sc.nextInt();
		int dy = sc.nextInt();
		
		for (i = 0; i < s.length; i++) {
			s[i].move(dx, dy);
		}
		
		System.out.println("이동 후의 정보입니다.\n");
		System.out.println("1. 도형, " + s[0].toString());
		System.out.println("2. 사각형, " + s[1].toString());
		System.out.println("3. 삼각형, " + s[2].toString());	
		
		sc.close();		
	}

}
