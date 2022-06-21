class Pair<T>
{
 private T first;
      private T second;

      public Pair(T first, T second)
      {
            this.first = first;
            this.second = second;
      }

      public T First 
     {
            get { return first; }
      }

      public T Second
      {
            get { return second; }
      }
}
class Program
{
public static void Main(string[] args)
{
            Pair<String> pair = new Pair<string>("An","Nga");
            Console.WriteLine("({0},{1})", pair.First,
                pair.Second);
  Console.ReadLine();
}
}
