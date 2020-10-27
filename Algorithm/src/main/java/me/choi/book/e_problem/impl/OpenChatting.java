package me.choi.book.e_problem.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;


/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment : 오픈채팅방
 * Time : 12:44 오전
 */
public class OpenChatting {
    private static Map<String, String> sentense = new HashMap<String, String>();

    static {
        sentense.put("Enter", "님이 들어왔습니다.");
        sentense.put("Leave", "님이 나갔습니다.");
    }

    public static void main(String[] args) {
        OpenChatting openChatting = new OpenChatting();
        String[] value = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        openChatting.solution(value);
    }

    public String[] solution(String[] record) {

        //id nickname
        Map<String, String> idNickname = new HashMap<String, String>();
        Queue<Info> queue = new LinkedList<Info>();

        for (int i = 0; i < record.length; i++) {
            String[] info = record[i].split(" ");
            String gubun = info[0];
            String id = info[1];

            queue.offer(new Info(gubun, id));

            // Change
            if (gubun.equals("Enter") || gubun.equals("Change")) {
                idNickname.put(info[1], info[2]);
            }
        }


        List<String> result = new ArrayList<String>();
        while (!queue.isEmpty()) {
            StringBuffer sb = new StringBuffer();
            Info info = queue.poll();

            if (info.getGubun().equals("Change")) {
                continue;
            }

            sb.append(idNickname.get(info.getId()));
            sb.append(sentense.get(info.getGubun()));

            result.add(sb.toString());
        }

        String[] answer = new String[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
        return answer;
    }

}
class Info {
    private final String gubun;
    private final String id;

    public Info(String gubun, String id) {
        super();
        this.gubun = gubun;
        this.id = id;
    }
    public String getGubun() {
        return gubun;
    }
    public String getId() {
        return id;

    }

}

