package com.example.chatapp;
public class messages{
    String text;

    String dp;

    int senderID;

    int receiverID;

    long sent_time;

    long delivered_time;

    long seen_time;

    public messages() {}

    public messages(String text,String dp,int senderID, int receiverID, long sent_time, long delivered_time, long seen_time) {
        this.text = text;
        this.dp = dp;
        this.senderID = senderID;
        this.receiverID = receiverID;
        this.sent_time = sent_time;
        this.delivered_time = delivered_time;
        this.seen_time = seen_time;
    }
    String getText(){
        return this.text;
    }
    void setText(String text){
        this.text = text;
    }
    String getDp(){
        return this.dp;
    }
    void setDp(String dp){
        this.dp = dp;
    }
    int getSenderID() {
        return this.senderID;
    }
    void setSenderID(int senderID){
        this.senderID = senderID;
    }
    int getReceiverID(){
        return this.receiverID;
    }
    void setReceiverID(int receiverID){
        this.receiverID=receiverID;
    }
    long getSent_time(){
        return this.sent_time;
    }
    void setSent_time(long sent_time){
        this.sent_time = sent_time;
    }
    long getDelivered_time(){
        return this.delivered_time;
    }
    void setDelivered_time(long delivered_time){
        this.delivered_time = delivered_time;
    }
    long getSeen_time(){
        return this.seen_time;
    }
    void setSeen_time(long seen_time){
        this.seen_time=seen_time;
    }
    public static void main(String args[]){
        messages msg1 = new messages();
        messages msg2 = new messages(text: "Hi",dp: "/picture", senderID: 1, receiverID: 2, sent_time: 001, deliveres_time: 002,seen_time:003);
    }
}
