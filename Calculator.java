import java.util.*;
public class Calculator{
    static int i;
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter no of values:");
        int count = input.nextInt();
        //declaring the new double array with count as size
        double[] numbers=new double[count];
        System.out.println("Enter"+count+"numbers");
        for(int i=0;i<count;i++){
            numbers[i]=input.nextDouble();
           }
           System.out.println("choose operation(+,-,*,/,%)");
           char op=input.next().charAt(0);
           //intialize 1st array element into result
           double result=numbers[0];
           switch(op)
           {
            case '+':
                for(int i=0;i<count;i++)
                {
                    result+=numbers[i];
                }
                break;
                case '-':
                   for(i=0;i<count;i++)
                   {
                    result-=numbers[i];
                   } 
                   break;
                   case '*':
                    for(int i=0;i<count;i++)
                    {
                        result*=numbers[i];
                    }
                    break;
                    case '/':
                     for(int i=0;i<count;i++)
                     {
                        if(numbers[i]==0){
                            System.out.println("ERROR:Division by Zero");
                            return;
                        }
                        result/=numbers[i];
                     }
                     break;
                     default:
                        System.out.println("Invalid op;eration:");
                        return;
           }
           System.out.println("Result:"+result);

                     

           }


    
}