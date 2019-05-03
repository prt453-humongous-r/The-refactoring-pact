public class TestFlyweight {
    public static void main(String []args){
        Code code = new Code();
        code.setCode("Java Code.");
        Platform platform = PlatformFactory.getPlatformInstance("JAVA");
        platform.execute(code);
    }

}
