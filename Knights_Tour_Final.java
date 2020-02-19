import java.util.Scanner;

public class Knights_Tour_Final
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an X value: ");
    int xValue = input.nextInt();
    System.out.println("Enter a Y value: ");
    int yValue = input.nextInt();
    LinkedList list = new LinkedList();
    list.insert(list, xValue);
    list.insert(list, yValue);


    while (!new Warnsdorff_Heuristic().findClosedTour(xValue, yValue))
    {
      ;
    }
  }
}
