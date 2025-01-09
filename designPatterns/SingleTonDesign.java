package designPatterns;

public class SingleTonDesign {
 private static SingleTonDesign ensuringInJvm;

 private SingleTonDesign(){
     System.out.println("instance is created");
 }

 public static SingleTonDesign creatingInstance(){

     return (ensuringInJvm==null)?ensuringInJvm=new SingleTonDesign():ensuringInJvm;

 }
 public  void greet(){
     System.out.println("hello");
 }

}
