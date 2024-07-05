public class BuyAndSellStock {
    public static int buyStock(int mac[]){
        for(int i = 0; i < mac.length - 1; i++){
            if(mac[i] > mac[i + 1]){
                int temp = mac[i];
                mac[i] = mac[i + 1];
                mac[i + 1] = temp;
                return temp;
            }
        }
        return -1; // Return a default value if no swap is done
    }

    public static void main(String[] args) {
        int mac[] = {1, 4, 5, 2, 3, 9};
        int result = buyStock(mac);
        System.out.println(result);
       
    }
}
