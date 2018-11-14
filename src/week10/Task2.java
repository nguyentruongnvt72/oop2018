package week10;

public class Task2 {
    public int[] randomArray(){
        int [] temp = new int[1000];
        for(int i=0;i<1000;i++){
            temp[i] = (int) (Math.random()*(1000-1) +1);
        }
        return temp;
    }
    public void bubbleSort(int[] temp){
        for(int i=0;i<temp.length-1;i++){
            for(int j=0;j<temp.length-1;j++){
                if(temp[j]>temp[j+1]){
                    int tmp = temp[j];
                    temp[j]= temp[j+1];
                    temp[j+1]= tmp;
                }
            }
        }
    }
    public static void main(String args[]){
        Task2 tash2 = new Task2();
        int[] Arr = tash2.randomArray();
        tash2.bubbleSort(Arr);
        for(int i=0;i<Arr.length;i++){
            System.out.println(Arr[i]);
        }
    }
}
