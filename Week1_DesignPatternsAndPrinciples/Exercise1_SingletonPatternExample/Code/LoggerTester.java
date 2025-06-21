//Testing the logger.


public class LoggerTester{
    public static void main(String[] args){
        //initializing the instances
        Logger log1 = Logger.getInstance();
        Logger log2 = Logger.getInstance();

        //example log messages
        log1.log("First log.");
        log2.log("Second log.");


        //Testing for singleton
        if (log1 == log2){
            System.out.println("Both logger instances are same (Singleton).");
        }
        else{
            System.out.println("Different logger instances (Failed).");
        }
        
    }
}