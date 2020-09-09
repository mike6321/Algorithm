## 조합

조합문제가 나올땐 DFS로 풀어볼 생각을 해보자!



## DFS구현 (연구소)

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < m; j++) {
        if (table[i][j] == 0) {
            table[i][j] = 1;
            count += 1;

            dfs(count);

            table[i][j] = 0;
            count -= 1;
        }
    }
}
```



## static으로 배열 등의 변수를 선언해두면 편하다

```java
public static int[] dx = {-1, 0, 1, 0};
public static int[] dy = {0, 1, 0, -1};
private static int[][] table = new int[8][8];
private static int[][] temp = new int[8][8];
private static int n = 0;
private static int m = 0;
private static int score = 0;
```

