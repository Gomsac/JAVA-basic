package ref.ex;



public class ProductOrderMain2 {

    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        orders[0] = createProductOrder("두부",2,2000);
        orders[1] = createProductOrder("김치",1,5000);
        orders[2] = createProductOrder("콜라",2,1500);

        printOrders(orders);

        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + totalAmount);
    }

    static ProductOrder createProductOrder(String productName, int quantity, int price) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.quantity = quantity;
        order.price = price;

        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.quantity + "수량: " + order.price);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.quantity * order.price;
        }

        return totalAmount;
    }
}
