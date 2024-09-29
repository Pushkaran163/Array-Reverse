public class Java{
    public static void reversearr(int[]A, int N){
        for(int i=0; i<N/2; i++){
            int temp = A[i];
            A[i] = A[N-i-1];
            A[N-i-1] = temp;
        }
    }
    public static void main(String[] args){
        int[] A = {1, 2, 3, 4, 5};
        int N = A.length;
        reversearr(A, N);

        for(int i =0;i<N;i++){
            System.out.print(A[i] + " ");
        }
    }
    
}