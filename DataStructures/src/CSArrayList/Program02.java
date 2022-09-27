/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSArrayList;

import accountPinAmount.AccountPinAmount;

/**
 *
 * @author JCSchneider
 */
public class Program02 {

    public static void main(String[] args) {
        CSArrayList<AccountPinAmount> chattList = new CSArrayList<AccountPinAmount>();

        chattList.add(new AccountPinAmount("123", "123"));
        chattList.add(new AccountPinAmount("2462727930553249", "5630", 99306.31));
        chattList.add(new AccountPinAmount("4574792818083281", "6293", 8154.66));
        chattList.add(new AccountPinAmount("9133580900430046", "2587", 56244.04));
        chattList.add(new AccountPinAmount("2462727930553249", "5630", 99306.31));
        chattList.add(new AccountPinAmount("9271608383267515", "4123", 98901.84));
        chattList.add(new AccountPinAmount("3547837443556381", "6865", 90430.46));
        chattList.add(new AccountPinAmount("7536208925948083", "5929", 68842.04));
        chattList.add(new AccountPinAmount("3355937125762055", "8255", 96589.43));
        chattList.add(new AccountPinAmount("1177296282827177", "2104", 9736.68));
        chattList.add(new AccountPinAmount("2190601408871630", "5437", 77428.28));
        chattList.add(new AccountPinAmount("7536208925948083", "5929", 68842.04));
        
        chattList.printAll();
        System.out.println("Length: " + chattList.length());

        System.out.println(chattList.get(0));
        System.out.println(chattList.get(0).getAccountNumber() + " " + chattList.get(0).getAmount());

        String samplePin = "123";
        String sampleAccount = "123";

        if (samplePin.equals(chattList.get(0).getPin())) {
            System.out.println("True");
            chattList.get(0).changeAmount(50.00);
        } else {
            System.out.println("False");
        }

        chattList.printAll();

        for (AccountPinAmount apa : chattList) {
            if (apa.getAccountNumber().equals(sampleAccount)) {
                if (apa.getPin().equals(samplePin)) {
                    apa.changeAmount(-150.00);
                    System.out.println(apa.toString());
                } else {
                    System.out.println("Sorry, I can't find your pin. Go away");
                }
            } else {
                System.out.println("Sorry, I can't seem to find your account.");
            }
        }
        chattList.printAll();
        
        double avg = 0.0;
        double min = Integer.MAX_VALUE;
        double max = Integer.MIN_VALUE;
        int counter = 0;
        for(AccountPinAmount apa: chattList){
            avg += apa.getAmount();
            if(min > apa.getAmount()){
                min = apa.getAmount();
            }
            
            if(max < apa.getAmount()){
                max = apa.getAmount();
            }
            counter++;
        }
        System.out.println("Min/Avg/Max: " + min + "/" + avg + "/" + max);
    }

}
