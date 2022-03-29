public class exc{
    public static void main(String[]args){
        int a=10,b=0;
        int c[]={1,2,3};
        try{
            int d=a/b;
             c[10]=33;
        }
        catch(ArithmeticException e){
            System.out.println("\n Division by zero exception \n");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("\n Array Index Out Of Bound Exception \n");
        }
        catch(Exception e){
            System.out.println("\n Exception: \n"+e);
        }
       
    }

}