package designPatterns;

public class SingleTonLogin {
  //  private static SingleTonLogin singleTonLogin;
    private static LoginService loginService;


    public static LoginService creatingobj(){
        if (loginService==null){
            loginService = new LoginService();
        }
        return loginService;

    }



}
