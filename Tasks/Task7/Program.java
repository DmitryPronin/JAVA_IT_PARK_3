class Program{
    public static void arrayReverse(int arr[]){
        int n = arr.length / 2;
        for (int i = 0; i <= n; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;

        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8,9};
        arrayReverse(array);
    }
}