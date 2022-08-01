package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Celebrity karsu = new Celebrity("Karsu Donmez");
        Celebrity feritOdman = new Celebrity("Ferit Odman");
        Follower deniz = new Follower("Deniz");
        Follower jeff = new Follower("Jeff");
        Follower robert = new Follower("Robert");
        Follower sandra =  new Follower("Sandra");
        Follower steven = new Follower("Steven");
        Follower olivia =  new Follower("Olivia");
        karsu.register(deniz);
        karsu.register(robert);
        karsu.register(steven);
        feritOdman.register(jeff);
        feritOdman.register(sandra);
        feritOdman.register(olivia);
        karsu.tweet(":) Which artists will be guests in my room?" + "\n" + "Sometimes I will sing songs with their valuable guests and sometimes I will give my guests pleasant moments with the little games I have prepared!\n");
        feritOdman.tweet("It rarely happens to me, but I was hittin’ it hard tonight. \uD83E\uDD41!!");
        feritOdman.unregister(jeff);
        karsu.tweet("WHAAA I am the new FOOD COLUMNIST of @andcgram Magazine! Thank you @chantaljanzen!! I am sooo soo soooo HAPPY! my first dish is #Ceviche..!!");

    }
}
