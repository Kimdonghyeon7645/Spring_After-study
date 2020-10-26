package Lesson4;

class Electronic {
    String name = "전자제품";
    String status;

    public Electronic(String status) {
        this.status = status;
    }
    public void currentState() {
        System.out.println(name + " " + status + "입니다.");
    }
}

class Food {
    String name = "음식";
    String status;

    public Food(String status) {
        this.status = status;
    }
    public void currentState() {
        System.out.println(name + " " + status + "입니다.");
    }
}

class GoodsShip{
    Object goods;

    public void boxing(Object goods){
        this.goods = goods;
    }
    public Object unBoxing(){
        return goods;
    }
}

class ShippingObject {
    public static void main(String[] args) {
        GoodsShip gs1 = new GoodsShip();
        gs1.boxing(new Electronic("배송 시작"));
        Electronic e1 = (Electronic)gs1.unBoxing();
        e1.currentState();

        GoodsShip gs2 = new GoodsShip();
        gs2.boxing(new Electronic("식품"));
        Food f1 = (Food)gs2.unBoxing();
        e1.currentState();
    }
}
