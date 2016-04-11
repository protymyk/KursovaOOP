package kursn;
import java.util.Scanner;
import static java.lang.Math.*;
public class kn {
	public static void main(String[] args) {
		ff v1=new ff();
		Scanner scan = new Scanner(System.in); 
		System.out.println("Введіть висоту циліндра: "); 
		int h = scan.nextInt(); 
		System.out.println("Введіть радіус циліндр: "); 
		int r = scan.nextInt();
		v1.h=h;//передача змінних
		v1.r=r;//передача змінних
		double vv = v1.calc(); //прийнятя зміної з класу ff
		System.out.println("Обьєм заданого циліндра = " + vv); 

	
	
	}
}
