class Handler {
    private static final Random RANDOM = new Random();
    private static int nextID = 1;
    private int id = nextID++;
    private Handler nextInChain;

    public boolean execute(int num) {
        if (RANDOM.nextInt(4) != 0) {
            System.out.println("   " + id + "-busy  ");
            nextInChain.execute(num);
        } else {
            System.out.println(id + "-handled-" + num);
        }
    }

    public void addHandler(Handler nextHandler) {
        if (nextInChain == null) {
            nextInChain = nextHandler;
        } else {
            nextInChain.addHandler(nextHandler);
        }
    }

    public void wrapAround(Handler mainHandler) {
        if (nextInChain == null) {
            nextInChain = mainHandler;
        } else {
            nextInChain.wrapAround(mainHandler);
        }
    }
}

public class ChainDemo {
    public static void main(String[] args) {
        Handler chain = new Handler();
        chain.addHandler(new Handler());
        chain.addHandler(new Handler());
        chain.wrapAround(chain);

        for (int i = 0; i < 5; i++) {
            System.out.println("Chain Number" + i + ":");
            chain.execute(i);
            //new line
            System.out.println("\n");
        }
    }
}
