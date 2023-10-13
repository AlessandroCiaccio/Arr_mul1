public class MyClass {
    public static void main(String args[]) {
        int[][] matrix={{1,2,3},{7,8,9,10},{2,5,4,2}};
        int sum=0;
        
        for (int i=0; i<matrix.length; i++){
            sum+=matrix[i][0];
            
        }
        System.out.println(sum);
    }
}