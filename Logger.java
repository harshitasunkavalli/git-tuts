public class Logger{
    private static Logger instance;
    private Logger(){
       System.out.println("Private constructor:");
        }
     public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void getLogDat(){
System.out.println("Log Data are:");
    }
    public void getLog(){
        System.out.println("Logs information: ");
    }
    public void Data(){
        System.out.println("Data are for out");
    }

}

