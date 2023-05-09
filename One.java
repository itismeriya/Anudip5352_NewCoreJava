class One{

public static void main(String s[ ]) {

Float h1 = new Float(Float.NaN);

Float h2 = new Float(Float.NaN);

System.out.print((h1 == h2) + " ");

System.out.print(h1.equals(h2) + " ");

System.out.print(Float.NaN == Float.NaN);

}

}