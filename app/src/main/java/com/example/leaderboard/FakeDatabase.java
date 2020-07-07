package com.example.leaderboard;

import java.util.ArrayList;
import java.util.List;

public class FakeDatabase {

    private List<Friend> listOfFriends = new ArrayList<>();

    public FakeDatabase(){
        listOfFriends.add(new Friend("", "Harold Rhoads", 85, "2302 pts", "level 30", 1));
        listOfFriends.add(new Friend("", "Phyllis Woods", 35, "2127 pts", "level 30", 2));
        listOfFriends.add(new Friend("", "Frank Guy", 93, "1992 pts", "level 28", 3));
        listOfFriends.add(new Friend("", "Corinne Gregg", 10, "1942 pts", "level 28", 4));
        listOfFriends.add(new Friend("", "Alan Foland", 70, "1864 pts", "level 26", 5));
        listOfFriends.add(new Friend("", "Arthur Rice", 50, "1856 pts", "level 26", 6));
        listOfFriends.add(new Friend("", "Shannon Fitzpatrick", 70, "1832 pts", "level 26", 7));
        listOfFriends.add(new Friend("", "Beverly Scott", 98, "1791 pts", "level 25", 8));
        listOfFriends.add(new Friend("", "Sandra Pendleton", 60, "1782 pts", "level 25", 9));
        listOfFriends.add(new Friend("", "Michael Nichols", 50, "1721 pts", "level 25", 10));
    }

    public List<Friend> getListOfFriends() {
        return listOfFriends;
    }
}
