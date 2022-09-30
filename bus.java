package com.assighments;

public class bus extends publicTransport{

    int maxPerson = 30;
    int statePerson = 2;
    int fee = 2000;

    public bus(String name,int number) {
        super(name, number);
    }

    @Override
    Boolean ride() {
        if(statePerson < maxPerson) {
            System.out.print(number+"번 버스를 탑니다. ");
            System.out.print("현재 승객은 "+statePerson+"명 입니다. ");
            statePerson += 1;
            payMoney();
        } else {
            System.out.println("최대 승객 수 초과 다음 버스를 이용하세요.");
        }
        return state;
    }

    @Override
    Boolean getOff() {
            System.out.println("버스를 내립니다.");
            statePerson -= 1;

            return true;
    }

    @Override
    public void drive(){
        while(true) {
            if(gas > 0 ) {
                System.out.println("가스 잔량: "+gas);
                gas -= 10;
                System.out.println("운행중");
            } else if(gas < 50) {
                System.out.println("가스가 없어요. 차고지행");
                return;
            }
        }
    }

    @Override
    void payMoney() {
        System.out.println("요금을 지불합니다 요금: "+fee+"원");
    }

    public void rideB(int n){
        if(statePerson > maxPerson) {
            statePerson += n;
        }
        ride();
    }

    public void busState() {
        System.out.println("탑승 승객 수 = "+statePerson);
        System.out.println("잔여 승객 수 = "+ (maxPerson-statePerson));
        System.out.println("요금  = "+fee);
    }

}
