grammar RPN;
 	 
@members {
  int val = 0;
  int a = 0;
  int b = 0;
  int c = 0;
  boolean result = false;
  Stack<Integer> stack = new Stack<Integer>();
}

@header {
    import java.util.*;
}
 	 
start
 	 : (expr ';' {System.out.println("Val: " + val);System.out.println("Result: " + result);System.out.println("Stack: " + stack); val=0; result = false;} )+
 	 ;
 	 
expr
   : INT {a =$INT.int; System.out.println("a="+a);}
     INT {b = $INT.int; System.out.println("b="+b);}
     '+' {val = a+b; stack.push(val);}

   | INT {a =$INT.int; System.out.println("a="+a);}
     INT {b = $INT.int; System.out.println("b="+b);}
     '-' {val = a-b;}

   | INT {a =$INT.int; System.out.println("a="+a);}
     INT {b = $INT.int; System.out.println("b="+b);}
     '*' {val = a*b;}

   | INT {a =$INT.int; System.out.println("a="+a);}
     INT {b = $INT.int; System.out.println("b="+b);}
     '/' {val = a/b;}

   | INT {a =$INT.int; System.out.println("a="+a);}
     INT {b = $INT.int; System.out.println("b="+b);}
     '%' {val = a%b;}

   | INT {a =$INT.int; System.out.println("a="+a);}
     INT {b = $INT.int; System.out.println("b="+b);}
     '<' {result = (a < b);}

   | INT {a =$INT.int; System.out.println("a="+a);}
     INT {b = $INT.int; System.out.println("b="+b);}
     '<=' {result = (a <= b);}

   | INT {a =$INT.int; System.out.println("a="+a);}
     INT {b = $INT.int; System.out.println("b="+b);}
     '>' {result = (a > b);}

   | INT {a =$INT.int; System.out.println("a="+a);}
     INT {b = $INT.int; System.out.println("b="+b);}
     '>=' {result = (a >= b);}

   | INT {a =$INT.int; System.out.println("a="+a);}
     INT {b = $INT.int; System.out.println("b="+b);}
     '==' {result = (a == b);}

   | INT {a =$INT.int; System.out.println("a="+a);}
     INT {b = $INT.int; System.out.println("b="+b);}
        '!=' {result = (a != b);};


INT : [0-9]+;
AND : '&&';
OR : '||';
NOT : '!';
WS : [ \r\t\n]+ -> skip ;
