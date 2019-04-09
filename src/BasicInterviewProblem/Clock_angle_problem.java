package BasicInterviewProblem;

import java.util.Scanner;

public class Clock_angle_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Hours: ");
		int h = sc.nextInt();
		System.out.println("Enter the Minute: ");
		int m = sc.nextInt();
		if(h<0 || h>12 || m<0 || m>60)
		{
			System.out.println("Wrong Input");
		}
		if (h==12)
		{
			h = 0;
		}
		if(m == 60)
		{
			m = 0;
		}
		int HAngle = (int)(0.5*(h*60 + m));
		int MAngle = (int)(6*m);
		int angle = Math.abs(HAngle-MAngle);
		angle = Math.min(360-angle, angle);
		System.out.println(angle);
	}
}
