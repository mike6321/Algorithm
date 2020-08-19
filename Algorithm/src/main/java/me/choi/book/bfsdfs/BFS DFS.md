# BFS DFS

### BFS, DFS를 제대로 이해하기 위해 알아야할 자료구조

* 스택
* 큐
* 재귀

------



## 스택

> 상자쌓기
>
> 상자를 쌓을때 아래서 부터 차곡차곡 쌓아야하지만 상자를 뺄땐 통상적으로 위에서 부터 뺀다. 



#### 자바에서의 문법

~~~java
public Element push(Element item); // 데이터 추가
public Element pop(); // 최근에 추가된(Top) 데이터 삭제
public Element peek(); // 최근에 추가된(Top) 데이터 조회
public boolean empty(); // stack의 값이 비었는지 확인, 비었으면 true, 아니면 false
public int seach(Object o); // 인자값으로 받은 데이터의 위치 반환, 그림으로 설명하겠음
~~~



------



## 큐

> 아래가 뚫려있는 양동이에 물 붓는 것이라 생각하자
>
> 제일 처음 들어온 물이 첫 빠따로 나간다.



| boolean add(E e)   | 해당 큐의 맨 뒤에 전달된 요소를 삽입함.만약 삽입에 성공하면 true를 반환하고, 큐에 여유 공간이 없어 삽입에 실패하면 IllegalStateException을 발생시킴. |
| ------------------ | ------------------------------------------------------------ |
| E element()        | 해당 큐의 맨 앞에 있는(제일 먼저 저장된) 요소를 반환함.      |
| boolean offer(E e) | 해당 큐의 맨 뒤에 전달된 요소를 삽입함.                      |
| E peek()           | 해당 큐의 맨 앞에 있는(제일 먼저 저장된) 요소를 반환함.만약 큐가 비어있으면 null을 반환함. |
| E poll()           | 해당 큐의 맨 앞에 있는(제일 먼저 저장된) 요소를 반환하고, 해당 요소를 큐에서 제거함.만약 큐가 비어있으면 null을 반환함. |
| E remove()         | 해당 큐의 맨 앞에 있는(제일 먼저 저장된) 요소를 제거함.      |



## 재귀

재귀함수가 언제 끝날지 **종료 조건**을 꼭 명시해야한다.

컴퓨터 내부의 재귀함수 실행은 스택의 구현과 같다.

~~~java
public class FactorialEx {
    public static void main(String[] args) {
        int result = factorialRecursive(5);
        System.out.println(result);
    }

    private static int factorialRecursive(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * factorialRecursive(n - 1);
    }

}
~~~

비재귀로 루프를 돌리는 것보다 코드가 훨씬 간결해진다.

------



## DFS

노드 = 도시

간선 = 도로

**인접 행렬** : 2차원 배열로 그래프의 연결 관계를 표현하는 방식

![image](https://user-images.githubusercontent.com/33277588/90604912-883d8300-e238-11ea-9b08-eb161186a226.png)

**인접 리스트** : 리스트로 그래프의 연결 관계를 표현하는 방식

![image](https://user-images.githubusercontent.com/33277588/90604873-778d0d00-e238-11ea-9a90-4bdf2ff67a85.png)



### 방문체크와 스택 

번호가 낮은 순서대로 스택에 넣는것이 관행이다.

~~~java
public class Dfs {
    public static boolean[] visited = new boolean[9];
    public static List<ArrayList<Integer>> graph = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            graph.add(new ArrayList<Integer>());
        }

        init();

        dfs(1);
    }

    public static void dfs(int x) {
        visited[x] = true;
        System.out.println(x + " ");

        for (int i = 0; i < graph.get(x).size(); i++) {
            int y = graph.get(x).get(i);
            if (!visited[y]) {
                dfs(y);
            }
        }
    }

    private static void init() {
        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(1).add(8);

        graph.get(2).add(1);
        graph.get(2).add(7);

        graph.get(3).add(1);
        graph.get(3).add(4);
        graph.get(3).add(5);

        graph.get(4).add(3);
        graph.get(4).add(5);

        graph.get(5).add(3);
        graph.get(5).add(4);

        graph.get(6).add(7);

        graph.get(7).add(2);
        graph.get(7).add(6);
        graph.get(7).add(8);

        graph.get(8).add(1);
        graph.get(8).add(7);
    }

}
~~~

