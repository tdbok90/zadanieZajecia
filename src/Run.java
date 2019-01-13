public class Run {

    public static void main(String[] args) {
      int[] tab = new int[10];
        boolean warunek=false;
      for(int i=0;i<tab.length;i++){
          tab[i]=i;
      }
while(warunek==false) {
    try {
        int a = tab[8];
        warunek=true;
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Troszke przypał.");
    } finally {
        System.out.println("W takim razie jedziemy dalej.");
    }
}
    }

}
