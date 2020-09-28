import java.util.Arrays;
import java.util.LinkedList;

public class SimpleLinkedListTester {
    private static StringBuilder sb;

    public static void main(String[] args) {
        sb = new StringBuilder();

        testConstructors();
        testAdd();
        testSizeAndClear();
        testContainsAndIndexOf();
        testGet();
        testRemove();
        testSet();
    }

    private static void testConstructors() {
        try {
            LinkedList<String> list = new LinkedList<>();

            sb.append("Initial contents of list: " + list);
            sb.append("\nInitial size of list: " + list.size());
        } catch (Exception e) {
            sb.append("\nFailed to create list: ");
            sb.append(e.toString());
        }

        try {
            LinkedList<String> list = new LinkedList<>(Arrays.asList("Aa", "Bb", "Cc", "Dd", "Ee", "Ff"));

            sb.append("\nInitial contents of list: " + list);
            sb.append("\nInitial size of list: " + list.size());
        } catch (Exception e) {
            sb.append("\nFailed to create list: ");
            sb.append(e.toString());
        }

        try {
            LinkedList<String> list = new LinkedList<>(null);

            sb.append("\nInitial contents of list: " + list);
            sb.append("\nInitial size of list: " + list.size());
        } catch (Exception e) {
            sb.append("\nFailed to create list: ");
            sb.append(e.toString());
        }

        String expected = sb.toString();
        sb.setLength(0);

        try {
            SimpleLinkedList simpleList = new SimpleLinkedList();

            sb.append("Initial contents of list: " + simpleList);
            sb.append("\nInitial size of list: " + simpleList.size());
        } catch (Exception e) {
            sb.append("\nFailed to create list: ");
            sb.append(e.toString());
        }

        try {
            SimpleLinkedList simpleList = new SimpleLinkedList(Arrays.asList("Aa", "Bb", "Cc", "Dd", "Ee", "Ff"));

            sb.append("\nInitial contents of list: " + simpleList);
            sb.append("\nInitial size of list: " + simpleList.size());
        } catch (Exception e) {
            sb.append("\nFailed to create list: ");
            sb.append(e.toString());
        }

        try {
            SimpleLinkedList simpleList = new SimpleLinkedList(null);

            sb.append("\nInitial contents of list: " + simpleList);
            sb.append("\nInitial size of list: " + simpleList.size());
        } catch (Exception e) {
            sb.append("\nFailed to create list: ");
            sb.append(e.toString());
        }

        String actual = sb.toString();
        sb.setLength(0);

        if (!expected.equals(actual)) {
            System.out.println("FAILED: testConstructors.\n");
            System.out.println(expected);
            System.out.println();
            System.out.println(actual);
        } else {
            System.out.println("PASSED: testConstructors.");
        }
    }

    private static void testAdd() {
        LinkedList<String> list = new LinkedList<>();
        SimpleLinkedList simpleList = new SimpleLinkedList();

        try {
            sb.append("Initial contents of list: " + list);
            sb.append("\nInitial size of list: " + list.size());

            list.addFirst("five");
            list.addFirst("three");
            list.addLast("six");
            list.addLast("seven");
            list.addFirst("one");

            sb.append("\nUpdated contents of list: " + list);
            sb.append("\nUpdated size of list: " + list.size());

            list.add(0, "zero");
            list.add(2, "two");
            list.add(4, "four");

            sb.append("\nUpdated contents of list: " + list);
            sb.append("\nUpdated size of list: " + list.size());
        } catch (Exception e) {
            sb.append("\nFailed to add elements: ");
            sb.append(e.toString());
        }

        try {
            list.add(-1, "invalid");

            sb.append("\nUpdated contents of list: " + list);
            sb.append("\nUpdated size of list: " + list.size());
        } catch (Exception e) {
            sb.append("\nFailed to add element: ");
            sb.append(e.toString());
        }

        try {
            list.add(100, "invalid");

            sb.append("\nUpdated contents of list: " + list);
            sb.append("\nUpdated size of list: " + list.size());
        } catch (Exception e) {
            sb.append("\nFailed to add element: ");
            sb.append(e.toString());
        }

        String expected = sb.toString();
        sb.setLength(0);

        try {
            sb.append("Initial contents of list: " + simpleList);
            sb.append("\nInitial size of list: " + simpleList.size());

            simpleList.addFirst("five");
            simpleList.addFirst("three");
            simpleList.addLast("six");
            simpleList.addLast("seven");
            simpleList.addFirst("one");

            sb.append("\nUpdated contents of list: " + simpleList);
            sb.append("\nUpdated size of list: " + simpleList.size());

            simpleList.add(0, "zero");
            simpleList.add(2, "two");
            simpleList.add(4, "four");

            sb.append("\nUpdated contents of list: " + simpleList);
            sb.append("\nUpdated size of list: " + simpleList.size());
        } catch (Exception e) {
            sb.append("\nFailed to add elements: ");
            sb.append(e.toString());
        }

        try {
            simpleList.add(-1, "invalid");

            sb.append("\nUpdated contents of list: " + simpleList);
            sb.append("\nUpdated size of list: " + simpleList.size());
        } catch (Exception e) {
            sb.append("\nFailed to add element: ");
            sb.append(e.toString());
        }

        try {
            simpleList.add(100, "invalid");

            sb.append("\nUpdated contents of list: " + simpleList);
            sb.append("\nUpdated size of list: " + simpleList.size());
        } catch (Exception e) {
            sb.append("\nFailed to add element: ");
            sb.append(e.toString());
        }

        String actual = sb.toString();
        sb.setLength(0);

        if (!expected.equals(actual)) {
            System.out.println("FAILED: testAdd.\n");
            System.out.println(expected);
            System.out.println();
            System.out.println(actual);
        } else {
            System.out.println("PASSED: testAdd.");
        }
    }

    private static void testSizeAndClear() {
        LinkedList<String> list = new LinkedList<>();
        SimpleLinkedList simpleList = new SimpleLinkedList();

        try {
            sb.append("Initial contents of list: " + list);
            sb.append("\nInitial size of list: " + list.size());

            list.addFirst("five");
            list.addFirst("four");
            list.addFirst("three");
            list.addFirst("two");
            list.addFirst("one");

            sb.append("\nUpdated contents of list: " + list);
            sb.append("\nUpdated size of list: " + list.size());

            list.clear();

            sb.append("\nUpdated contents of list: " + list);
            sb.append("\nUpdated size of list: " + list.size());
        } catch (Exception e) {
            sb.append("\nFailed to add elements: ");
            sb.append(e.toString());
        }

        String expected = sb.toString();
        sb.setLength(0);

        try {
            sb.append("Initial contents of list: " + simpleList);
            sb.append("\nInitial size of list: " + simpleList.size());

            simpleList.addFirst("five");
            simpleList.addFirst("four");
            simpleList.addFirst("three");
            simpleList.addFirst("two");
            simpleList.addFirst("one");

            sb.append("\nUpdated contents of list: " + simpleList);
            sb.append("\nUpdated size of list: " + simpleList.size());

            simpleList.clear();

            sb.append("\nUpdated contents of list: " + simpleList);
            sb.append("\nUpdated size of list: " + simpleList.size());
        } catch (Exception e) {
            sb.append("\nFailed to add elements: ");
            sb.append(e.toString());
        }

        String actual = sb.toString();
        sb.setLength(0);

        if (!expected.equals(actual)) {
            System.out.println("FAILED: testSizeAndClear.\n");
            System.out.println(expected);
            System.out.println();
            System.out.println(actual);
        } else {
            System.out.println("PASSED: testSizeAndClear.");
        }
    }

    private static void testContainsAndIndexOf() {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Aa", "Bb", "Cc", "Dd"));
        SimpleLinkedList simpleList = new SimpleLinkedList(Arrays.asList("Aa", "Bb", "Cc", "Dd"));

        try {
            sb.append("Initial contents of list: " + list);

            boolean contains = list.contains("Bb");
            int index = list.indexOf("Bb");

            sb.append("\nList contains element: " + contains);
            sb.append("\nElement at index: " + index);
        } catch (Exception e) {
            sb.append("\nFailed to search for element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + list);

            boolean contains = list.contains("Zz");
            int index = list.indexOf("Zz");

            sb.append("\nList contains element: " + contains);
            sb.append("\nElement at index: " + index);
        } catch (Exception e) {
            sb.append("\nFailed to search for element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + list);

            boolean contains = list.contains("");
            int index = list.indexOf("");

            sb.append("\nList contains element: " + contains);
            sb.append("\nElement at index: " + index);
        } catch (Exception e) {
            sb.append("\nFailed to search for element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + list);

            boolean contains = list.contains(null);
            int index = list.indexOf(null);

            sb.append("\nList contains element: " + contains);
            sb.append("\nElement at index: " + index);
        } catch (Exception e) {
            sb.append("\nFailed to search for element: ");
            sb.append(e.toString());
        }

        String expected = sb.toString();
        sb.setLength(0);

        try {
            sb.append("Initial contents of list: " + simpleList);

            boolean contains = simpleList.contains("Bb");
            int index = simpleList.indexOf("Bb");

            sb.append("\nList contains element: " + contains);
            sb.append("\nElement at index: " + index);
        } catch (Exception e) {
            sb.append("\nFailed to search for element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + simpleList);

            boolean contains = simpleList.contains("Zz");
            int index = simpleList.indexOf("Zz");

            sb.append("\nList contains element: " + contains);
            sb.append("\nElement at index: " + index);
        } catch (Exception e) {
            sb.append("\nFailed to search for element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + simpleList);

            boolean contains = simpleList.contains("");
            int index = simpleList.indexOf("");

            sb.append("\nList contains element: " + contains);
            sb.append("\nElement at index: " + index);
        } catch (Exception e) {
            sb.append("\nFailed to search for element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + simpleList);

            boolean contains = simpleList.contains(null);
            int index = simpleList.indexOf(null);

            sb.append("\nList contains element: " + contains);
            sb.append("\nElement at index: " + index);
        } catch (Exception e) {
            sb.append("\nFailed to search for element: ");
            sb.append(e.toString());
        }

        String actual = sb.toString();
        sb.setLength(0);

        if (!expected.equals(actual)) {
            System.out.println("FAILED: testContainsAndIndexOf.\n");
            System.out.println(expected);
            System.out.println();
            System.out.println(actual);
        } else {
            System.out.println("PASSED: testContainsAndIndexOf.");
        }
    }

    private static void testGet() {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Aa", "Bb", "Cc", "Dd"));
        SimpleLinkedList simpleList = new SimpleLinkedList(Arrays.asList("Aa", "Bb", "Cc", "Dd"));

        try {
            sb.append("Initial contents of list: " + list);

            String first = list.getFirst();
            String item = list.get(2);
            String last = list.getLast();

            sb.append("\nFirst element: " + first);
            sb.append("\nElement at index 2: " + item);
            sb.append("\nLast element: " + last);
        } catch (Exception e) {
            sb.append("\nFailed to get element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + list);

            String item = list.get(-1);

            sb.append("\nElement at index -1: " + item);
        } catch (Exception e) {
            sb.append("\nFailed to get element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + list);

            String item = list.get(100);

            sb.append("\nElement at index 100: " + item);
        } catch (Exception e) {
            sb.append("\nFailed to get element: ");
            sb.append(e.toString());
        }

        try {
            list.clear();

            String first = list.getFirst();

            sb.append("\nFirst element: " + first);
        } catch (Exception e) {
            sb.append("\nFailed to get element: ");
            sb.append(e.toString());
        }

        try {
            list.clear();

            String last = list.getLast();

            sb.append("\nLast element: " + last);
        } catch (Exception e) {
            sb.append("\nFailed to get element: ");
            sb.append(e.toString());
        }

        String expected = sb.toString();
        sb.setLength(0);

        try {
            sb.append("Initial contents of list: " + simpleList);

            String first = simpleList.getFirst();
            String item = simpleList.get(2);
            String last = simpleList.getLast();

            sb.append("\nFirst element: " + first);
            sb.append("\nElement at index 2: " + item);
            sb.append("\nLast element: " + last);
        } catch (Exception e) {
            sb.append("\nFailed to get element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + simpleList);

            String item = simpleList.get(-1);

            sb.append("\nElement at index -1: " + item);
        } catch (Exception e) {
            sb.append("\nFailed to get element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + simpleList);

            String item = simpleList.get(100);

            sb.append("\nElement at index 100: " + item);
        } catch (Exception e) {
            sb.append("\nFailed to get element: ");
            sb.append(e.toString());
        }

        try {
            simpleList.clear();

            String first = simpleList.getFirst();

            sb.append("\nFirst element: " + first);
        } catch (Exception e) {
            sb.append("\nFailed to get element: ");
            sb.append(e.toString());
        }

        try {
            simpleList.clear();

            String last = simpleList.getFirst();

            sb.append("\nLast element: " + last);
        } catch (Exception e) {
            sb.append("\nFailed to get element: ");
            sb.append(e.toString());
        }

        String actual = sb.toString();
        sb.setLength(0);

        if (!expected.equals(actual)) {
            System.out.println("FAILED: testGet.\n");
            System.out.println(expected);
            System.out.println();
            System.out.println(actual);
        } else {
            System.out.println("PASSED: testGet.");
        }
    }

    private static void testRemove() {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Aa", "Bb", "Cc", "Dd", "Ee", "Ff"));
        SimpleLinkedList simpleList = new SimpleLinkedList(Arrays.asList("Aa", "Bb", "Cc", "Dd", "Ee", "Ff"));

        try {
            sb.append("Initial contents of list: " + list);
            sb.append("\nInitial size of list: " + list.size());

            String item = list.remove(2);

            sb.append("\nElement removed at index 2: " + item);
            sb.append("\nUpdated contents of list: " + list);
            sb.append("\nUpdated size of list: " + list.size());
        } catch (Exception e) {
            sb.append("\nFailed to remove element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + list);
            sb.append("\nInitial size of list: " + list.size());

            String item = list.remove(-1);

            sb.append("\nElement removed at index -1: " + item);
            sb.append("\nUpdated contents of list: " + list);
            sb.append("\nUpdated size of list: " + list.size());
        } catch (Exception e) {
            sb.append("\nFailed to remove element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + list);
            sb.append("\nInitial size of list: " + list.size());

            String item = list.remove(100);

            sb.append("\nElement removed at index 100: " + item);
            sb.append("\nUpdated contents of list: " + list);
            sb.append("\nUpdated size of list: " + list.size());
        } catch (Exception e) {
            sb.append("\nFailed to remove element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + list);
            sb.append("\nInitial size of list: " + list.size());

            boolean removed = list.remove("Cc");

            sb.append("\nElement removed: " + removed);
            sb.append("\nUpdated contents of list: " + list);
            sb.append("\nUpdated size of list: " + list.size());
        } catch (Exception e) {
            sb.append("\nFailed to remove element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + list);
            sb.append("\nInitial size of list: " + list.size());

            boolean removed = list.remove("Zz");

            sb.append("\nElement removed: " + removed);
            sb.append("\nUpdated contents of list: " + list);
            sb.append("\nUpdated size of list: " + list.size());
        } catch (Exception e) {
            sb.append("\nFailed to remove element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + list);
            sb.append("\nInitial size of list: " + list.size());

            String item = list.removeFirst();

            sb.append("\nFirst element removed: " + item);
            sb.append("\nUpdated contents of list: " + list);
            sb.append("\nUpdated size of list: " + list.size());
        } catch (Exception e) {
            sb.append("\nFailed to remove element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + list);
            sb.append("\nInitial size of list: " + list.size());

            String item = list.removeLast();

            sb.append("\nLast element removed: " + item);
            sb.append("\nUpdated contents of list: " + list);
            sb.append("\nUpdated size of list: " + list.size());
        } catch (Exception e) {
            sb.append("\nFailed to remove element: ");
            sb.append(e.toString());
        }

        String expected = sb.toString();
        sb.setLength(0);

        try {
            sb.append("Initial contents of list: " + simpleList);
            sb.append("\nInitial size of list: " + simpleList.size());

            String item = simpleList.remove(2);

            sb.append("\nElement removed at index 2: " + item);
            sb.append("\nUpdated contents of list: " + simpleList);
            sb.append("\nUpdated size of list: " + simpleList.size());
        } catch (Exception e) {
            sb.append("\nFailed to remove element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + simpleList);
            sb.append("\nInitial size of list: " + simpleList.size());

            String item = simpleList.remove(-1);

            sb.append("\nElement removed at index -1: " + item);
            sb.append("\nUpdated contents of list: " + simpleList);
            sb.append("\nUpdated size of list: " + simpleList.size());
        } catch (Exception e) {
            sb.append("\nFailed to remove element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + simpleList);
            sb.append("\nInitial size of list: " + simpleList.size());

            String item = simpleList.remove(100);

            sb.append("\nElement removed at index 100: " + item);
            sb.append("\nUpdated contents of list: " + simpleList);
            sb.append("\nUpdated size of list: " + simpleList.size());
        } catch (Exception e) {
            sb.append("\nFailed to remove element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + simpleList);
            sb.append("\nInitial size of list: " + simpleList.size());

            boolean removed = simpleList.remove("Cc");

            sb.append("\nElement removed: " + removed);
            sb.append("\nUpdated contents of list: " + simpleList);
            sb.append("\nUpdated size of list: " + simpleList.size());
        } catch (Exception e) {
            sb.append("\nFailed to remove element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + simpleList);
            sb.append("\nInitial size of list: " + simpleList.size());

            boolean removed = simpleList.remove("Zz");

            sb.append("\nElement removed: " + removed);
            sb.append("\nUpdated contents of list: " + simpleList);
            sb.append("\nUpdated size of list: " + simpleList.size());
        } catch (Exception e) {
            sb.append("\nFailed to remove element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + simpleList);
            sb.append("\nInitial size of list: " + simpleList.size());

            String item = simpleList.removeFirst();

            sb.append("\nFirst element removed: " + item);
            sb.append("\nUpdated contents of list: " + simpleList);
            sb.append("\nUpdated size of list: " + simpleList.size());
        } catch (Exception e) {
            sb.append("\nFailed to remove element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + simpleList);
            sb.append("\nInitial size of list: " + simpleList.size());

            String item = simpleList.removeLast();

            sb.append("\nLast element removed: " + item);
            sb.append("\nUpdated contents of list: " + simpleList);
            sb.append("\nUpdated size of list: " + simpleList.size());
        } catch (Exception e) {
            sb.append("\nFailed to remove element: ");
            sb.append(e.toString());
        }

        String actual = sb.toString();
        sb.setLength(0);

        if (!expected.equals(actual)) {
            System.out.println("FAILED: testRemove.\n");
            System.out.println(expected);
            System.out.println();
            System.out.println(actual);
        } else {
            System.out.println("PASSED: testRemove.");
        }
    }

    private static void testSet() {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Aa", "Bb", "Zz", "Dd", "Ee", "Ff"));
        SimpleLinkedList simpleList = new SimpleLinkedList(Arrays.asList("Aa", "Bb", "Zz", "Dd", "Ee", "Ff"));

        try {
            sb.append("Initial contents of list: " + list);
            sb.append("\nInitial size of list: " + list.size());

            String item = list.set(2, "Cc");

            sb.append("\nElement overwritten at index 2: " + item);
            sb.append("\nUpdated contents of list: " + list);
            sb.append("\nUpdated size of list: " + list.size());
        } catch (Exception e) {
            sb.append("\nFailed to set element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + list);
            sb.append("\nInitial size of list: " + list.size());

            String item = list.set(-1, "Xx");

            sb.append("\nElement overwritten at index -1: " + item);
            sb.append("\nUpdated contents of list: " + list);
            sb.append("\nUpdated size of list: " + list.size());
        } catch (Exception e) {
            sb.append("\nFailed to set element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + list);
            sb.append("\nInitial size of list: " + list.size());

            String item = list.set(100, "Xx");

            sb.append("\nElement overwritten at index 100: " + item);
            sb.append("\nUpdated contents of list: " + list);
            sb.append("\nUpdated size of list: " + list.size());
        } catch (Exception e) {
            sb.append("\nFailed to set element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + list);
            sb.append("\nInitial size of list: " + list.size());

            String item = list.set(1, null);

            sb.append("\nElement overwritten at index 1: " + item);
            sb.append("\nUpdated contents of list: " + list);
            sb.append("\nUpdated size of list: " + list.size());
        } catch (Exception e) {
            sb.append("\nFailed to set element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + list);
            sb.append("\nInitial size of list: " + list.size());

            String item = list.set(4, "");

            sb.append("\nElement overwritten at index 1: " + item);
            sb.append("\nUpdated contents of list: " + list);
            sb.append("\nUpdated size of list: " + list.size());
        } catch (Exception e) {
            sb.append("\nFailed to set element: ");
            sb.append(e.toString());
        }

        String expected = sb.toString();
        sb.setLength(0);

        try {
            sb.append("Initial contents of list: " + simpleList);
            sb.append("\nInitial size of list: " + simpleList.size());

            String item = simpleList.set(2, "Cc");

            sb.append("\nElement overwritten at index 2: " + item);
            sb.append("\nUpdated contents of list: " + simpleList);
            sb.append("\nUpdated size of list: " + simpleList.size());
        } catch (Exception e) {
            sb.append("\nFailed to set element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + simpleList);
            sb.append("\nInitial size of list: " + simpleList.size());

            String item = simpleList.set(-1, "Xx");

            sb.append("\nElement overwritten at index -1: " + item);
            sb.append("\nUpdated contents of list: " + simpleList);
            sb.append("\nUpdated size of list: " + simpleList.size());
        } catch (Exception e) {
            sb.append("\nFailed to set element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + simpleList);
            sb.append("\nInitial size of list: " + simpleList.size());

            String item = simpleList.set(100, "Xx");

            sb.append("\nElement overwritten at index 100: " + item);
            sb.append("\nUpdated contents of list: " + simpleList);
            sb.append("\nUpdated size of list: " + simpleList.size());
        } catch (Exception e) {
            sb.append("\nFailed to set element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + simpleList);
            sb.append("\nInitial size of list: " + simpleList.size());

            String item = simpleList.set(1, null);

            sb.append("\nElement overwritten at index 1: " + item);
            sb.append("\nUpdated contents of list: " + simpleList);
            sb.append("\nUpdated size of list: " + simpleList.size());
        } catch (Exception e) {
            sb.append("\nFailed to set element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + simpleList);
            sb.append("\nInitial size of list: " + simpleList.size());

            String item = simpleList.set(4, "");

            sb.append("\nElement overwritten at index 1: " + item);
            sb.append("\nUpdated contents of list: " + simpleList);
            sb.append("\nUpdated size of list: " + simpleList.size());
        } catch (Exception e) {
            sb.append("\nFailed to set element: ");
            sb.append(e.toString());
        }

        String actual = sb.toString();
        sb.setLength(0);

        if (!expected.equals(actual)) {
            System.out.println("FAILED: testSet.\n");
            System.out.println(expected);
            System.out.println();
            System.out.println(actual);
        } else {
            System.out.println("PASSED: testSet.");
        }
    }

}
