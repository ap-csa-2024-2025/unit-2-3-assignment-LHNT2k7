public class Classwork
{
  public static void main(String[] args)
  {
    System.out.println(firstLastN("hfhsef",2));
  }
    public static String firstLastN(String word, int n)
    {
        String output = new String();
        String FirstN = word.substring(0,n);
        int indexOfNthtoLast = word.length() - n;
        String LastN = word.substring(indexOfNthtoLast);

        output = FirstN + LastN;
        return output;
    }

}



