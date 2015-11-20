grammar RPN;
 	 
@members {
  int val = 0;
  int a = 0;
  int b = 0;
  boolean left, right = false;
  boolean result = false;
  Stack<Integer> intStack = new Stack<Integer>();
  Stack<Boolean> boolStack = new Stack<Boolean>();
}

@header {
    import java.util.*;
}
 	 
start
 	 : (expr ';' {
// 	                System.out.println("Bool Stack: " + boolStack);
// 	                System.out.println("Int Stack: " + intStack);
 	                if(!intStack.isEmpty())
 	                    {System.out.println("Result: " + intStack.pop());}
 	                if(!boolStack.isEmpty())
 	                    {System.out.println("Result: " + boolStack.pop());}
 	                val=0;
 	                result = false;
 	              })+;

expr
     : INT {
//          System.out.println("Int: " + $INT.int);
            intStack.push($INT.int);
            }
       INT {
                   intStack.push($INT.int);
                   }
        eval+ expr*

     | (TRUE {
//              System.out.println("Logical Operator: true");
              boolStack.push(true);
              })+
        eval+ expr*

     | (FALSE {
//               System.out.println("Logical Operator: false");
               boolStack.push(true);
               })+
       eval+ expr*;

eval
    : '+'{
            a = intStack.pop();
            b = intStack.pop();
            val = a + b;
            intStack.push(val);
         }
    |
       '-'{
            a = intStack.pop();
            b = intStack.pop();
            val = a - b;
            intStack.push(val);
          }
    |
       '*'{
           a = intStack.pop();
           b = intStack.pop();
           val = a * b;
           intStack.push(val);
           }
    |
       '/'{
           a = intStack.pop();
           b = intStack.pop();
           val = a / b;
           intStack.push(val);
        }
    |
        '%'{
            a = intStack.pop();
            b = intStack.pop();
            val = a % b;
            intStack.push(val);
           }
    |
        '<'{
            b = intStack.pop();
            a = intStack.pop();
            result = a < b;
            boolStack.push(result);
            }
    |
        '<='{
             b = intStack.pop();
             a = intStack.pop();
             result = a <= b;
             boolStack.push(result);
            }
    |
        '>'{
            b = intStack.pop();
            a = intStack.pop();
            result = a > b;
            boolStack.push(result);
            }
    |
        '>='{
             b = intStack.pop();
             a = intStack.pop();
             result = a >= b;
             boolStack.push(result);
             }
    |
        '=='{
            b = intStack.pop();
            a = intStack.pop();
            result = a == b;
            boolStack.push(result);
            }
    |
        '!='{
            b = intStack.pop();
            a = intStack.pop();
            result = a != b;
            boolStack.push(result);
            }
    |
        AND {
             left = boolStack.pop();
             right = boolStack.pop();
             result = left && right;
             boolStack.push(result);
             }
    |
        OR {
            left = boolStack.pop();
            right = boolStack.pop();
            result = left || right;
            boolStack.push(result);
            }
    |
        NOT {
            result = !boolStack.pop();
            boolStack.push(result);
            };

INT : [0-9]+;
AND : '&&';
OR : '||';
NOT : '!';
TRUE : 'true';
FALSE : 'false';
WS : [ \r\t\n]+ -> skip ;

