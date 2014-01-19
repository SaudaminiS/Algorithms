package datastructs;

import io.S;

public class DataStructures
{
    public static void main(String args[])
    {
        char choice;
        try
        {
            System.out.print("Test Data Structure : s-Stack|q-Queue : ");
            choice = S.ins().charAt(0);

            switch(choice)
            {
                case 's':
                    int l=0;
                    System.out.println("********Stack Implementation********");
                    System.out.print("Enter size of stack : ");
                    l= S.ini();
                    if(l>0)
                    {
                        Stack s=new Stack(l);
                        s.implementStack();
                    }
                    break;
                case 'q':
                    l=0;
                    System.out.println("********Queue Implementation********");
                    System.out.print("Enter size of queue : ");
                    l= S.ini();
                    if(l>0)
                    {
                        Queue q=new Queue(l);
                        q.implementQueue();
                    }
                    break;
            }
        }
        catch(Exception e)
        {
            System.out.println(e+" : "+e.getStackTrace()[2].getLineNumber());
        }
    }
}
