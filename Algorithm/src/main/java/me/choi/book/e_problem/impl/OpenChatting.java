package me.choi.book.e_problem.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 오픈채팅방
 * Time : 12:44 오전
 */
public class OpenChatting {
    //KEY : id, VALUE : nickname
    Map<String, String> information;
    List<String> log;
    public static void main(String[] args) {
        OpenChatting openChatting = new OpenChatting();
        String[] value = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        String[] solution = openChatting.solution(value);

    }

    public String[] solution(String[] record) {
        information = new HashMap<>();
        log = new ArrayList<>();

        for (int i = 0; i < record.length; i++) {
            String[] infoArr = record[i].split(" ");
            String inOutChange = "";
            String id = "";
            String nickname = "";
            if (infoArr.length == 3) {
                inOutChange = infoArr[0];
                id = infoArr[1];
                nickname = infoArr[2];
            }
            else {
                inOutChange = infoArr[0];
                id = infoArr[1];
            }
            //들어올떄
            if (inOutChange.equals("Enter")) {
                log.add(id);
                log.add("님이 들어왔습니다.");

                information.put(id, nickname);
            }
            //나갈때
            if (inOutChange.equals("Leave")) {
                log.add(id);
                log.add("님이 나갔습니다.");

                information.put(id, nickname);
            }
            //닉네임 바꿀때
            if (inOutChange.equals("Change")) {
                information.put(id, nickname);
            }

        }

        String[] answer = {};
        for (int i = 0; i < log.size(); i++) {
//            if (i % 2 == 0) {
//                //answer[i] = information.get(log.get(i));
//                System.out.println(information.get(log.get(i)));
//            }
//            else {
//                //answer[i] = information.get(log.get(i));
//                System.out.println(log.get(i));
//            }
        }


        return answer;
    }

}

