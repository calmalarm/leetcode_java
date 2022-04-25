package valid_parentheses_20;

public class Main {
    public static void main(String[] args) {
        System.out.println("(): " + Solution.isValid("()"));
        System.out.println("()[](((([]{})))): " + Solution.isValid("()[](((([]{}))))"));
        System.out.println("(((([[]]{()}[))))): " + Solution.isValid("(((([[]]{()}[)))))"));
        System.out.println("([{(()[[{{}}][]])}]): " + Solution.isValid("([{(()[[{{}}][]])}])"));
        System.out.println("'': " + Solution.isValid(""));
        System.out.println("[[]](: " + Solution.isValid("[[]]("));
        System.out.println("[[]]()): " + Solution.isValid("[[]]())"));

    }
}
