class IntegerBox {
    private final List<Integer> list = new ArrayList<>();

    public void add(int in) {
        list.add(in);
    }

    public Iterator getIterator() {
        return new Iterator(this);
    }

    //defining iterator inside the integerBox so it has access to list
    public class Iterator {
        private IntegerBox box;
        private java.util.Iterator iterator;
        private int value;

        public Iterator(IntegerBox integerBox) {
            box = integerBox;
        }

        //initiation logic for iterator to use in foorloop
        public void first() {
            iterator = box.list.iterator();
            next();
        }

        //get the next step
        public void next() {
            try {
                value = (Integer) iterator.next();
            } catch (NoSuchElementException ex) {
                value = -1;
            }
        }

        //loop end condition
        public boolean isDone() {
            return value == -1;
        }

        public int currentValue() {
            return value;
        }
    }
}

public class IteratorDemo {
    public static void main(String[] args) {
        IntegerBox box = new IntegerBox();
        for (int i = 9; i > 0; --i) {
            box.add(i);
        }

        //got new instances of the class
        IntegerBox.Iterator iteratorOne = box.getIterator();

        //change for loop to use iterator
        for(iteratorOne.first();!iteratorOne.isDone();iteratorOne.next()){
            System.out.println("Iterator Value: " + iteratorOne.currentValue());
        }
    }
}
