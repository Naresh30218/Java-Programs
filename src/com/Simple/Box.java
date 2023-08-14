package com.Simple;

class Rect 
{  
 int l,b;   
 public Rect(int l,int b)  
{ 
 this.l=l;   
 this.b=b;   }  
 public int area()  
{   
 return l*b;  
 }
 public int perimeter() {
	return 2*(l+b);
	 
 }
}

class Box extends Rect {  
 int d;   
 public Box(int l,int b,int d)  
 {   super(l,b);   
     this.d=d;  
 }  
 public int areab()  
  {   int barea = 2*area()+2*b*d+2*l*d;   
      return barea;  
  }
 
 public int perimeterb() {
	 int bperimeter = 4*(l+b+d)  ;
	return bperimeter; 
 }
 

 public static void main(String args[])   
  {  int ab ,area,perimeter,pb;
     Rect r= new Rect(10,20);   
     area=r.area(); 
     perimeter=r.perimeter();
     System.out.println("area of rectangle is "+area);    
     System.out.println("perimeter of rectangle is "+ perimeter+"\n");
        
     Box b = new Box(8,5,6);   
     ab=b.areab();  
     pb=b.perimeterb();
     System.out.println("area of box is "+ab);   
     System.out.println("perimeter of rectangle is "+ pb+"\n");  
  
     }
 }

