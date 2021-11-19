package Sort;

public class SortMain {
    public static void main(String[] args) {
        Sorter sorter = new Sorter();
        int [] intArgs = new int[args.length];


        for (int a = 0; a < args.length; a++) {
            intArgs[a] = Integer.parseInt(args[a]);
        }
        int[] sorted = sorter.sort(intArgs);
        for (int a : intArgs) {
            System.out.println(a);
        }

    }
}
