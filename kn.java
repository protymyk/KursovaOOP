package kursn;
import java.util.Scanner;
import static java.lang.Math.*;
public class kn {
	public static void main(String[] args) {
		ff v1=new ff();
		Scanner scan = new Scanner(System.in); 
		System.out.println("������ ������ �������: "); 
		int h = scan.nextInt(); 
		System.out.println("������ ����� ������: "); 
		int r = scan.nextInt();
		v1.h=h;//�������� ������
		v1.r=r;//�������� ������
		double vv = v1.calc(); //�������� ���� � ����� ff
		System.out.println("����� �������� ������� = " + vv); 

	
	
	}
}
