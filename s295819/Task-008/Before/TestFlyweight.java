public class TestFlyweight {
    public static void main(String []args){
        Code code = new Code();
        code.setCode("Java Code.");
        Platform platform = new JavaPlatform();
        platform.execute(code);
    }

}
