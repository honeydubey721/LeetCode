import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int asteroid : asteroids) {

            if (asteroid > 0) {
                st.push(asteroid);
            } else {
                while (!st.isEmpty() && st.peek() > 0 && st.peek() < -asteroid) {
                    st.pop();
                }

                if (!st.isEmpty() && st.peek() == -asteroid) {
                    st.pop();
                } else if (st.isEmpty() || st.peek() < 0) {
                    st.push(asteroid);
                }
            }
        }

        int[] result = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            result[i] = st.pop();
        }

        return result;
    }
}