package com.assighments;

abstract class publicTransport {

    String name;
    int gas = 100;
    int speed = 0;
    int pay;
    int number;
    Boolean state= true;

    public publicTransport(String name,int pay,int number) {
        this.name = name;
        this.pay = pay;
        this.number = number;
    }

    public publicTransport(String name,int number) {
        this.name = name;
        this.number = number;
    }

    abstract Boolean ride();
    abstract Boolean getOff();
    abstract void drive();
    abstract void payMoney();

    // 가스가 있는지 확인
    Boolean isGasLeft(){
        if(gas == 0) {
            System.out.println("gas가 없습니다.");
            return false;
        } else{
            System.out.println("지금 가스는: "+gas+" 운행 가능합니다.");
            return true;
        }
    }

    Boolean isPerson(){
        if(state == true) {
            System.out.println("손님 탑승할 수 있어요.");
        } else {
            System.out.println("만차입니다.");
        }
        return state;
    }

    // 가스 충전
    void setGas(int gas){
        this.gas = gas;
    }
    // 속도변경
    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
