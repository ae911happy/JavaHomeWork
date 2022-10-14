package PTACaogao;


public class KMP {
    public static void main(String[] args) {
        String str2 = "abcdabd";
        int []next =new int[str2.length()];
        new KMP().getNext(str2.toCharArray(),next);
        for (int i : next) {
            System.out.println(i);
        }
    }

    private void getNext(char[] str2, int[] next) {
        int j = -1;
        int i = 0;
        next[0]=-1;
        next[1]=0;
        while (i<=str2.length-2){
            if(j==-1||str2[j]==str2[i]){
                i++;
                j++;
                next[i]=j;
            }else {
                j=next[j];
            }
        }
    }
}