import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrderProcessor {
    private static final Logger logger = LoggerFactory.getLogger(OrderProcessor.class);

    public void processOrder(int orderId) {
        logger.info("주문 처리 시작: Order ID = {}", orderId);
        try {
            Thread.sleep(1000); // 주문 처리 시간 가정
            logger.info("주문 처리 완료: Order ID = {}", orderId);
        } catch (InterruptedException e) {
            logger.error("주문 처리 중 오류 발생: {}", e.getMessage());
        }
    }

    public static void main(String[] args) {
        OrderProcessor processor = new OrderProcessor();
        processor.processOrder(101);
    }
}
