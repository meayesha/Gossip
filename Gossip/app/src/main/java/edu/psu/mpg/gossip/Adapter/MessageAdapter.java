package edu.psu.mpg.gossip.Adapter;

public class MessageAdapter {
    private static final MessageAdapter ourInstance = new MessageAdapter();

    public static MessageAdapter getInstance() {
        return ourInstance;
    }

    private MessageAdapter() {
    }
}
