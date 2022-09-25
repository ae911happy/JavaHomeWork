package HomeWork3;

public class one {
    public static void main(String[] args) {
        String line = "this is a test of java";
        int sum = line.replaceAll("[^s]", "").length();
        System.out.println(sum);

        String s= "is";
        String[] arr= (","+line.toLowerCase()+",").split(s);
        System.out.println(arr.length- 1);

        String n[]=line.split(" ");
        int count=0;
        for(int i=0;i<6;i++) {
            if(n[i].equals("is"))
                count++;
        }
        System.out.println(count);

        StringBuffer lineReverse = new StringBuffer("this is a test of java");
        System.out.println(new StringBuffer(lineReverse).reverse());
    }
}