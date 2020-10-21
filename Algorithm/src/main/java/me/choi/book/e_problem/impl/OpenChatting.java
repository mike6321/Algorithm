package me.choi.book.e_problem.impl;

import java.util.ArrayList;
import java.util.List;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 오픈채팅방
 * Time : 12:44 오전
 */
public class OpenChatting {
    public static void main(String[] args) {
        OpenChatting openChatting = new OpenChatting();
        String[] value = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        openChatting.solution(value);
    }

    public String[] solution(String[] record) {
        List<Information> records = new ArrayList<>();

        for (int i = 0; i < record.length; i++) {
            String[] str = record[i].split(" ");
            if (!(str.length < 3)) {
                records.add(new Information(str[0], str[1], str[2]));
            }
            else {
                records.add(new Information(str[0], str[1], null));
            }
        }

        for (int i = 0; i < records.size(); i++) {
            //Enter일때
            if (isEnterOrLeave(records, i)) {

            }
        }



        String[] answer = {};
        return answer;
    }
    //Enter면 true Leave면 false
    private boolean isEnterOrLeave(List<Information> records, int i) {
        return records.get(i).getEnterOrLeave().equals("ENTER") ? true : false;
    }
}
class Information {
    private final String id;
    private final String nickName;
    private final String enterOrLeave;

    public Information(String id, String nickName, String enterOrLeave) {
        this.id = id;
        this.nickName = nickName;
        this.enterOrLeave = enterOrLeave;
    }

//    public Information(String enterOrLeave, String id) {
//        this.enterOrLeave = enterOrLeave;
//        this.id = id;
//
//    }

    public String getId() {
        return id;
    }

    public String getNickName() {
        return nickName;
    }

    public String getEnterOrLeave() {
        return enterOrLeave;
    }
}
