package OrderProcessing;

@FunctionalInterface
public interface OrderFilter {
    boolean filter(Order order);
}
