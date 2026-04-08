package Objetos;

import Entites.Enums.OrderStatus;
import java.util.Date;

public class Pedido {

    private Integer IDPedido;
    private Date momentoPedido;
    private OrderStatus orderStatus;

    public Pedido(){
    }

    public Pedido(Integer IDPedido, Date momentoPedido, OrderStatus orderStatus) {
        this.IDPedido = IDPedido;
        this.momentoPedido = momentoPedido;
        this.orderStatus = orderStatus;
    }

    public Integer getIDPedido() {
        return IDPedido;
    }

    public void setIDPedido(Integer IDPedido) {
        this.IDPedido = IDPedido;
    }

    public Date getMomentoPedido() {
        return momentoPedido;
    }

    public void setMomentoPedido(Date momentoPedido) {
        this.momentoPedido = momentoPedido;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "IDPedido=" + IDPedido +
                ", momentoPedido=" + momentoPedido +
                ", orderStatus=" + orderStatus +
                '}';
    }
}
