package com.myproject;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isTrue = true;
        ArrayList<String> list = new ArrayList<>();





        LinkedList<SydneyDistance> townList = new LinkedList<>();
        SydneyDistance town1 = new SydneyDistance("Adelaide",1374);
        SydneyDistance town2 = new SydneyDistance("Alice Springs",2771);
        SydneyDistance town3 = new SydneyDistance("Brisbane" , 917);
        SydneyDistance town4 = new SydneyDistance("Darwin" , 3972);
        SydneyDistance town5 = new SydneyDistance("Melbourne" , 877);
        SydneyDistance town6 = new SydneyDistance("Perth" , 3923);

        townList.addAll(Arrays.asList(town1,town2,town3,town4,town5,town6));
        townList.sort(Comparator.comparingInt(distance -> distance.getDistanceFromSydney()));
        System.out.println(townList);

        boolean isT = true;
        System.out.printf("Available actions: (select word or letter):\n" +
                "(F)orward\n" +
                "(B)ackaward\n" +
                "(L)ist places\n" +
                "(M)enu\n" +
                "(Q)uit");
        System.out.println();
        boolean isForward = true;
        boolean isBackwards = true;
        ListIterator<SydneyDistance> myIterator = townList.listIterator();
        while(isT){
            String userInput = scanner.nextLine();
            if(userInput.equalsIgnoreCase("F")){
                isForward = true;
                if(myIterator.hasNext()){
                    System.out.println(myIterator.next().getTownName());
                }else{
                    break;
                }
            }else if(userInput.equalsIgnoreCase("B")){
                if(isForward == true){
                    myIterator.previous().getTownName();
                    isBackwards = true;
                    isForward = false;
                }
                if(myIterator.hasPrevious()){
                    System.out.println(myIterator.previous().getTownName());
                }else{
                    break;
                }

            }else if(userInput.equalsIgnoreCase("L")){
                    for(SydneyDistance el : townList){
                        System.out.println(el.getTownName());
                    }
            }else if(userInput.equalsIgnoreCase("M")){
                System.out.printf("Available actions: (select word or letter):\n " +
                        "(F)orward\n" +
                        "(B)ackaward\n" +
                        "(L)ist places\n" +
                        "(M)enu\n" +
                        "(Q)uit");
            }else if(userInput.equalsIgnoreCase("Q")){
              isT = false;
            }
        }


    }

public static void reverse(int [] number){
        System.out.println("Array = " + Arrays.toString(number));
        for(int i = 0; i < number.length/2;i++){
            int firstConst = number[i];
            int lastConst = number[number.length - 1- i];
            number[i] = lastConst;
            number[number.length - 1-i] = firstConst;
        }
        System.out.println("Reversed array = " + Arrays.toString(number));
}


}
