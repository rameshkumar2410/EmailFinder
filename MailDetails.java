package com.org;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Ramesh
 *
 */
public class MailDetails {

    private List<String> allEmails;
    private List<String> friendList;

    /**
     * 
     * @return allEmails
     */
    public List<String> getAllMailList() {
        //Added All Mail ID List
        allEmails = new ArrayList<String>();
        allEmails.add("enemy@uni.edu.sg");
        allEmails.add("bff@uni.edu.sg");
        allEmails.add("evil@spam.com");
        allEmails.add("bff@uni.edu.sg");
        return allEmails;

    }

    /**
     * 
     * @return friendList
     */
    public List<String> getFriendMailList() {
        //Added Friends Mail ID List
        friendList = new ArrayList<String>();
        friendList.add("enemy@uni.edu.sg");
        friendList.add("bff@uni.edu.sg");
        friendList.add("provost@uni.edu.sg");
        friendList.add("john@doe.com");
        return friendList;
    }

    /**
     * 
     * @param allEmails
     * @param friendList
     * @return Number of emails in allEmails are from friends.
     */
    public int getFriendMailCount(List<String> allEmails, List<String> friendList) {
        int totalFriendsMail = (int) allEmails.stream().filter(mail -> friendList.contains(mail)).count();
        return totalFriendsMail;
    }
    
   /**
     * 
     * @param allEmails
     * @param friendList
     * @return Number of distinct emails in allEmails are from friends.
     */
    public int getFriendMailDistinctCount(List<String> allEmails, List<String> friendList) {
        int totalFriendsMail = (int) allEmails.stream().distinct().filter(mail -> friendList.contains(mail)).count();
        return totalFriendsMail;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MailDetails mailDetails = new MailDetails();
        int totalFriendsMail = mailDetails.getFriendMailCount(mailDetails.getAllMailList(), mailDetails.getFriendMailList());
        System.out.println("Number of friends Email ==  " + totalFriendsMail);
    }

}
