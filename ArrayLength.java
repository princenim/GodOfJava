/**
 * @author hazel
 */
public class ArrayLength {
    public static void main(String[] args) {
        ArrayLength arrayLength = new ArrayLength();
        arrayLength.printArray();
        arrayLength.twoDimFor();

    }
    public void printArray(){
        int[][] twoDim = {{1,2,3},{4,5,6}};
        System.out.println("twoDim.length="+twoDim.length);
        System.out.println("twoDim[0].length="+twoDim[0].length);

        for(int i=0; i < twoDim.length; i++){
            for(int j=0; j< twoDim[0].length; j++){
                System.out.println(twoDim[i][j]);
            }
        }
    }

    public void twoDimFor(){
        int[][] twoDim = {{1,2,3},{4,5,6}};
        for(int[] dimArray : twoDim){
            for(int data : dimArray){ //타입이름 임시변수명 : 반복대상객체
                System.out.println(data);
            }
        }
    }
}
