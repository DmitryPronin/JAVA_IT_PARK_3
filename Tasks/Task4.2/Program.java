class Program{
    public static void main(String[] args){
        int[] arr = new int[1000];
        int i;
        int k;
        int sum1 = 0;
        int sum2 = 0;


        arr[0] = 1 + (int) (Math.random() * 1000);
        sum2 = sum2 + arr[0];
        System.out.println("sum2 = " + sum2);
        System.out.println("nulevoy" + arr[0]);
        int temp;
        for (i=1; i<=1000; i++){
            sum1 = sum1 + i;
        }

        for (i=1; i<999; i++){
            k = 0;
            temp = 1 + (int) (Math.random() * 1000);
            while (k<i){
                if (temp!=arr[k]){
                    k++;
                }
                else {
                    temp = 1 + (int) (Math.random() * 1000);
                    k = 0;
                }
            }
            arr[k] = temp;
            sum2 = sum2 + arr[i];



    }
        int rez = sum1 - sum2;
        System.out.println("System don't create this :" + rez);
        

}
}