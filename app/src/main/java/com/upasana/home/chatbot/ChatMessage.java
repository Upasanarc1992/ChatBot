package com.upasana.home.chatbot;

/**
 * Created by home on 4/2/2017.
 */

public class ChatMessage {

        private String content;
        private boolean isMine;

        public ChatMessage(String content, boolean isMine) {
            this.content = content;
            this.isMine = isMine;
        }

        public String getContent() {
            return content;
        }

        public boolean isMine() {
            return isMine;
        }
}
