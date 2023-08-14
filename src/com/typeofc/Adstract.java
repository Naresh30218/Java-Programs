import java.io.*;
import java.util.*;

abstract class abstractclass{

    abstract void disp();

}

class inherit extends abstractclass{
    
    String n;
    inherit(String name)
    {
        n=name;
    }
     public void disp()
     {
        System.out.println("The name is:"+n);
     }
}

public class adstract {
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String name=br.readLine();
        inherit i=new inherit(name);
        i.disp();
    }
    
}
