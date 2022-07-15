package github.beeclimb.depthbreadth;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Jun
 * @date 2021/12/22
 * @leetcode 733. Flood Fill
 */
public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        Queue<Integer> queueSr = new LinkedList<>();
        Queue<Integer> queueSc = new LinkedList<>();
        queueSr.offer(sr);
        queueSc.offer(sc);
        int[][] visited = new int[image.length][image[0].length];
        int origin = image[sr][sc];
        int r, c;

        while (!queueSr.isEmpty()) {
            r = queueSr.poll();
            c = queueSc.poll();
            image[r][c] = newColor;
            visited[r][c] = 1;
            if (c + 1 <= image[0].length - 1 && image[r][c + 1] == origin && visited[r][c + 1] == 0) {
                queueSr.offer(r);
                queueSc.offer(c + 1);
            }
            if (r - 1 >= 0 && image[r - 1][c] == origin && visited[r - 1][c] == 0) {
                queueSr.offer(r - 1);
                queueSc.offer(c);
            }
            if (c - 1 >= 0 && image[r][c - 1] == origin && visited[r][c - 1] == 0) {
                queueSr.offer(r);
                queueSc.offer(c - 1);
            }
            if (r + 1 <= image.length - 1 && image[r + 1][c] == origin && visited[r + 1][c] == 0) {
                queueSr.offer(r + 1);
                queueSc.offer(c);
            }
        }
        return image;
    }

    public int[][] floodFill2(int[][] image, int sr, int sc, int newColor) {
        int[] dx = {0, -1, 0, 1};
        int[] dy = {1, 0, -1, 0};

        int xLength = image.length, yLength = image[0].length;
        int originColor = image[sr][sc];
        if (originColor == newColor) {
            return image;
        }
        Queue<int[]> visited = new LinkedList<>();
        image[sr][sc] = newColor;
        visited.offer(new int[]{sr, sc});

        int[] pollElement;
        int mx, my;
        while (!visited.isEmpty()) {
            pollElement = visited.poll();
            for (int i = 0; i < 4; ++i) {
                mx = pollElement[0] + dx[i];
                my = pollElement[1] + dy[i];
                if (mx >= 0 && mx < xLength && my >= 0 && my < yLength && image[mx][my] == originColor) {
                    image[mx][my] = newColor;
                    visited.offer(new int[]{mx, my});
                }
            }
        }
        return image;
    }

    public int[][] floodFill3(int[][] image, int sr, int sc, int newColor) {
        int originColor = image[sr][sc];
        if (originColor != newColor) {
            dfs(image, originColor, sr, sc, newColor);
        }
        return image;
    }

    public void dfs(int[][] image, int originColor, int sr, int sc, int newColor) {
        int[] dx = {0, -1, 0, 1};
        int[] dy = {1, 0, -1, 0};
        if (image[sr][sc] == originColor) {
            image[sr][sc] = newColor;
            for (int i = 0; i < 4; ++i) {
                int mx = sr + dx[i];
                int my = sc + dy[i];
                if (mx >= 0 && mx < image.length && my >= 0 && my < image[0].length) {
                    dfs(image, originColor, mx, my, newColor);
                }
            }
        }
    }

}
