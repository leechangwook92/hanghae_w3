package com.assighments;

public class taxi extends publicTransport{

    public taxi(String name, int pay,int number) {
        super(name, pay,number);
    }

    @Override
    Boolean ride() {
        if(state == true) {
            System.out.println(number+" 택시를 탑니다.");
            return state = false;
        } else {
            System.out.println("이미 승객이 있어서 택시를 탈수 없어요");
        }
        payMoney();
        return state;
    }

    @Override
    Boolean getOff() {
        if(state == false) {
            System.out.println(number+" 택시를 내립니다. 요금은: "+pay+"입니다.");
            state = true;
        }
        return state;
    }

    @Override
    public void drive(){
        while(true) {
            if(gas > 0 ) {
                System.out.println("가스 잔량: "+gas);
                gas -= 10;
                if(speed < 100) {
                    pay += 1000;
                } else {
                    pay += 1500;
                }
            } else {
                System.out.println("가스가 없어요. 가스 잔량: "+gas+" 더 가시려면 충전하세요");
                return;
            }
        }
    }

    @Override
    void payMoney() {
        System.out.println("요금을 지불합니다 "+pay+"원입니다. 기사님 수고하세요");
    }

    public static void main(String[] args) {
        publicTransport a = new taxi("택시",4000,4885);
        a.isPerson();  // 사람 있는지 확인
        a.ride();  // 탄다
        a.isGasLeft(); // 가스 연료확인
        a.drive(); // 운행
        a.setSpeed(150);
        a.setGas(70); // 가스충전
        a.drive(); // 다시 운행
        a.getOff(); // 내린다고 한다.
    }
}
