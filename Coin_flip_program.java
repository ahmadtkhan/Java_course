/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aktar
 */
public class Count {
    int value;
    // To write the constructor
    public Count(int val){
        value = val;
    }
     
    public void increment() {
            if (value >= 0)
                value = value + 1;
        }
        public int getValue() {
        return value; 
    }
    public static void main(String[] args) {
        Count headCount, tailCount;
        headCount = new Count(0);
        tailCount = new Count(0);
        for (int flip = 0; flip < 100; flip++) {
            if (Math.random() < 0.5){
                headCount.increment();
            }

            else{
                tailCount.increment();
            }

        }
        System.out.println("There were " + headCount.value+ " heads.");

        System.out.println("There were " + tailCount.value + " tails.");

    }

}

