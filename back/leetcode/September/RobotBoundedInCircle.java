package September;

public class RobotBoundedInCircle {
    public static void main(String[] args) {
        System.out.println(isRobotBounded("GGLLGG"));
        System.out.println(isRobotBounded("GG"));
    }

    public static boolean isRobotBounded(String instructions) {
        int direction = 0, x = 0, y = 0;
        for (int i = 0; i < instructions.length(); i++) {
            if (instructions.charAt(i) == 'G') {
                if (direction == 0) {
                    y++;
                } else if (direction == 1) {
                    x--;
                } else if (direction == 2) {
                    y--;
                } else if (direction == 3) {
                    x++;
                }
            } else if (instructions.charAt(i) == 'L') {
                direction = (direction + 1) % 4;
            } else if (instructions.charAt(i) == 'R') {
                if (direction != 0) {
                    direction -= 1;
                } else {
                    direction = 3;
                }
            }
        }
        if (direction != 0 || (x == 0 && y == 0)) {
            return true;
        }
        return false;
    }
}
