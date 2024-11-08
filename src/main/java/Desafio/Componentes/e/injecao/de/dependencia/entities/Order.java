package Desafio.Componentes.e.injecao.de.dependencia.entities;

public class Order {
    public Integer order;
    public Double basic;
    public Double discout;

    public Order() {
    }

    public Order(Integer order, Double basic, Double discout) {
        this.order = order;
        this.basic = basic;
        this.discout = discout;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Double getBasic() {
        return basic;
    }

    public void setBasic(Double basic) {
        this.basic = basic;
    }

    public Double getDiscout() {
        return discout;
    }

    public void setDiscout(Double discout) {
        this.discout = discout;
    }
}
