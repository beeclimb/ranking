package github.beeclimb.depthbreadth;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Jun
 * @date 2021/12/23
 * @leetcode 695. Max Area of Island
 */
public class MaxAreaOfIsland {
    int[] dx = {0, -1, 0, 1};
    int[] dy = {1, 0, -1, 0};


    public int maxAreaOfIsland(int[][] grid) {
        int answer = 0;
        for (int x = 0; x < grid.length; ++x) {
            for (int y = 0; y < grid[0].length; ++y) {
                answer = Math.max(answer, dfs(grid, x, y));
            }
        }
        return answer;
    }

    public int dfs(int[][] grid, int x, int y) {
        if (x < 0 || x > grid.length - 1 || y < 0 || y > grid[0].length - 1 || grid[x][y] == 0) {
            return 0;
        }
        grid[x][y] = 0;
        int area = 1;
        for (int i = 0; i < 4; ++i) {
            int nextX = x + dx[i], nextY = y + dy[i];
            area += dfs(grid, nextX, nextY);
        }
        return area;
    }

    public int maxAreaOfIsland2(int[][] grid) {
        int answer = 0;
        for (int x = 0; x != grid.length; ++x) {
            for (int y = 0; y != grid[0].length; ++y) {
                Deque<Integer> visitedX = new LinkedList<>();
                Deque<Integer> visitedY = new LinkedList<>();
                visitedX.push(x);
                visitedY.push(y);
                int area = 0;
                while (!visitedX.isEmpty()) {
                    int currentX = visitedX.pop(), currentY = visitedY.pop();
                    if (currentX < 0 || currentX > grid.length - 1 || currentY < 0 || currentY > grid[0].length - 1 || grid[currentX][currentY] == 0) {
                        continue;
                    }
                    ++area;
                    grid[currentX][currentY] = 0;
                    for (int i = 0; i < 4; ++i) {
                        int nx = currentX + dx[i];
                        int ny = currentY + dy[i];
                        visitedX.push(nx);
                        visitedY.push(ny);
                    }
                }
                answer = Math.max(answer, area);
            }
        }
        return answer;
    }

    public int maxAreaOfIsland3(int[][] grid) {
        int answer = 0;
        Queue<Integer> visitedX = new LinkedList<>();
        Queue<Integer> visitedY = new LinkedList<>();
        for (int x = 0; x < grid.length; ++x) {
            for (int y = 0; y < grid[0].length; ++y) {
                visitedX.offer(x);
                visitedY.offer(y);
                int area = 0;
                while (!visitedX.isEmpty()) {
                    int currentX = visitedX.poll();
                    int currentY = visitedY.poll();
                    if (currentX < 0 || currentX > grid.length - 1 || currentY < 0 || currentY > grid[0].length - 1 || grid[currentX][currentY] == 0) {
                        continue;
                    }
                    ++area;
                    grid[currentX][currentY] = 0;
                    for (int i = 0; i < 4; ++i) {
                        int nextX = currentX + dx[i];
                        int nextY = currentY + dy[i];
                        visitedX.offer(nextX);
                        visitedY.offer(nextY);
                    }
                }
                answer = Math.max(answer, area);
            }
        }
        return answer;
    }

}
