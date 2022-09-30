package CommandLine;

public class CommandLineArgument {
    public static void main(String[] args) {

//        String[] argus = {"one","two"};
        System.out.println(args.length);

        //forEach loop to print all the argument
        for (String i : args){
            System.out.println(i);
        }
    }
}
