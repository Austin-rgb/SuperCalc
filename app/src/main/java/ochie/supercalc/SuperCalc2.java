package ochie.supercalc;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class SuperCalc2 extends SuperCalc1{
String keyBra(){
  output+="(";
  return  output ;
}
String keyKet(){
  output+=")";
  return  output ;
}
String evaluate (String input){
System.out.println (" evaluating "+input);
Pattern brackets = Pattern.compile("\\([\\d+[\\+|\\-|\\*|\\/]*?]+?\\)");
Matcher braMatcher= brackets.matcher(input);
while (braMatcher.find()){
  String tinput=braMatcher.group ();
 tinput =tinput.replace('(',' ');
 tinput =tinput.replace(')',' ');
 tinput =tinput.stripLeading();
  input= braMatcher.replaceFirst(evaluate(tinput));
}

Pattern arg= Pattern.compile("\\d+");
Pattern op= Pattern.compile("\\D");
  Matcher argMatcher= arg.matcher(input);
  Matcher opMatcher= op.matcher(input);
  ArrayList args=new ArrayList ();
  System.out.println (" evaluating "+input);
  while(argMatcher.find())args.add(argMatcher.group());
  System.out.println ("Found "+args.size()+ " args");  ArrayList ops= new ArrayList ();
  while(opMatcher. find())ops.add(opMatcher. group ());
  System.out.println ("Found "+ops.size()+ " ops"); 
    return compute(args,ops);
}
}
