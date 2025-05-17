import java.util.Scanner;

class ArrayX
{
    public int Arr[];

    public ArrayX(int iSize)
    {
        Arr = new int[iSize];
    }
    public void Accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements:");
        for(int i =0; i<Arr.length; i++)
        {
            Arr[i] = sc.nextInt();
        }
        sc.close();
    }
    public void Display()
    {
        System.out.print("Element from  Array are:");

        for(int i =0; i<Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }
    }
    public int Summation()
    {
        int Sum =0;

        for(int i=0; i<Arr.length; i++)
        {
            Sum = Sum+Arr[i];
        }
        return Sum;
    }
    public int Maximum()
    {
        int iMax = Arr[0];

        for(int i =0 ;i <Arr.length; i++)
        {
            if(Arr[i]>iMax)
            {
                iMax = Arr[i];
            }
        }
        return iMax;
    }
    public void CountDigits()
    {
        int iCount = 0;
        for(int i =0; i<Arr.length; i++)
        {
            int iNo = Arr[i];
            while(iNo !=0)
            {
                iCount++;
                iNo = iNo/10;
            }
            System.out.println("Count of Digit:"+iCount);
            iCount =0;
        }
    }
}
public class ArrayOperations 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int iLength =0;
        System.out.println("Enter the number of Element:");
        iLength =sc.nextInt();
        ArrayX aobj = new ArrayX(iLength);
        aobj.Accept();
        aobj.Display();
        int iRet1 = aobj.Summation();
        int iRet2 = aobj.Maximum();
        aobj.CountDigits();

        System.out.println("Sum of element form list is:"+iRet1);
        System.out.println("Maximum Element from Array:"+iRet2);

        sc.close();
    }
    
}
