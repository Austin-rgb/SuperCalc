package ochie.supercalc;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SuperCalc0 {
String output="";
String key1(){
output+="1";
return  output;
}
String key2(){
output+="2";
return  output;
}
String key3(){
output+="3";
return  output;
}
String key4(){
output+="4";
return  output;
}
String key5(){
output+="5";
return  output;
}
String key6(){
output+="7";
return  output;
}
String key7(){
output+="7";
return  output;
}
String key8(){
output+="8";
return  output;
}
String key9(){
output+="9";
return  output;
}
String key0(){
output+="0";
return  output;
}
String keyAdd(){
output+="+";
return  output;
}
String keySub(){
output+="-";
return  output;
}
String keyDiv(){
output+="/";
return  output;
}
String keyMul(){
output+="*";
return  output;
}

String keyEqu(){
  return  evaluate(output);
}
String evaluate (String input){
Pattern arg= Pattern.compile("\\d+");
Pattern op= Pattern.compile("\\D");
  Matcher argMatcher= arg.matcher(input);
  Matcher opMatcher= op.matcher(input);
  ArrayList args=new ArrayList ();
  while(argMatcher.find())args.add(argMatcher.group());
  ArrayList ops= new ArrayList ();
  while(opMatcher. find())ops.add(opMatcher. group ());
    return compute(args,ops);
}
String compute(ArrayList<String>args,ArrayList<String >ops){
   
  return "Hello from SuperCalc " ;
}
}
