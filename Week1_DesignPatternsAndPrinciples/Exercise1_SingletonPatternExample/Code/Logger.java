public class Logger {
    
    // a private static variable to hold the single instance.
    private static Logger instance;

    // a private constructor
    private Logger(){
        System.out.println("Logger initiated.");
    }


    //public static method to get the instance
    public static Logger getInstance(){
        if (instance==null){
            instance = new Logger();
        }
        return instance;
    }

    //method for logging
    public void log(String msg){
        System.out.println("LOG: "+msg);
    }
}
