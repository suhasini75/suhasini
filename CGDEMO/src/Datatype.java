//Datatypes
public class Datatype {

	public static void main(String[] args) {
//Primitive Datatype - Integer
		int max = 2147483647;
		int min = -2147483648;
		short shortMax = 32767;
		short shortMin = -32768;
		long longMax = 9223372036854775807L;
		long longMin = -9223372036854775808L;
		byte byteMax = 127;
		byte byteMin = -128;
System.out.println("integer"+max);


//Primitive Datatype - Float
int value1 = 9/2;
float value2 = 10f/6f;
double value3 = 10d/6d;
System.out.println("value  1 = "+ value1);
System.out.println("value  2 = "+ value2);
System.out.println("value  3 = "+ value3);
int marker = 512;
double percentage = marker * 0.46f;
System.out.println("percentage:"+percentage);

//Boolean & Encode
boolean var = false;  //true or false (0 or 1)
System.out.println(var);
char var1 = '\u00A7'; //  $,*,.,
System.out.println(var1);

//String
String var2 = new String("Hello world");
System.out.println(var2);

//Typecasting  
// int�float---long---double
int i= 10;  // variable with f is a type of integer which is holding value of 10
long l = (long) i; // defining a var with name l which of datatype long = convert value that is present in I to long
System.out.println(l);


	}

}
