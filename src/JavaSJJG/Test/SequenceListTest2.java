package JavaSJJG.Test;

import JavaSJJG.linear.SequenceList;

public class SequenceListTest2 {
    public static void main(String[] args) {
        SequenceList<String> s1 = new SequenceList<>(3);
        s1.insert("张三");
        s1.insert("李四");
    }
}
