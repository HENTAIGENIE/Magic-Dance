public class Main /*extends Application*/{

    /*
    public static String IMAGES = "/img/";
    public static String FXML = "/fxml/";

    Scene mainMenu;
    Scene game;

    @Override
    public void init(){

    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        mainMenu = new Scene(new PrimaryView(), 512, 256);
        primaryStage.setTitle("Magic Dance");
        primaryStage.setResizable(true);
        primaryStage.setScene(mainMenu);
        primaryStage.show();

    }

    @Override
    public void stop(){
        //Platform.exit() is preferred way to exiting program - allows this method to be run

    }

    */
    public static void main(String[] args){

        int b = 0;
        System.out.println(b);
        test(b);
        System.out.println(b);


        //CardClassLoader.loadCards(); <-- Load all cards to array for use
        //Application.launch(args);
    }

    public static void test (int test){
        test = 5;
    }
}
