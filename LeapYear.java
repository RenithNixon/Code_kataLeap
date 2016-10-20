import java.util.*;
class LeapYear
{
public static void main(String args[])
{
int year;
Scanner sc=new Scanner(System.in);
year=sc.nextInt();
if(year>1900)
{
if(year%4==0)
{
System.out.println("The given year is a leap year");
}
else
{
System.out.println("The given year is not a leap year");
}
}
}
}
