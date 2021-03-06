/**
 * Created with IntelliJ IDEA.
 * User: showtime
 * Date: 14.03.13
 * Time: 17:01
 * To change this template use File | Settings | File Templates.
 */
public class Position {
    public final int x;
    public final int y;
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Position position = (Position) o;

        if (x != position.x) return false;
        if (y != position.y) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}
