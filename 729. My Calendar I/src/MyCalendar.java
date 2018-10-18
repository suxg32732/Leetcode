import java.util.LinkedList;
import java.util.List;

public class MyCalendar {

    public List<Event> events;

    private List<Integer> dates;

    public MyCalendar() {
        events = new LinkedList<>();
        dates = new LinkedList<>();
    }

    public boolean book1(int start, int end) {
        Event e = new Event(start, end);
        if (events.size() == 0) {
            events.add(e);
            return true;
        } else {
            if (end <= events.get(0).start) {
                events.add(0, e);
                return true;
            } else if (start >= events.get(events.size() - 1).end) {
                events.add(events.size(), e);
                return true;
            } else {
                for (int i = 0; i < events.size() - 1; i++) {
                    if (e.start >= events.get(i).end && e.end <= events.get(i + 1).start) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean book(int start, int end) {

        if (dates.isEmpty()) {
            dates.add(start);
            dates.add(end);
            return true;
        }

        for (int i = 1; i < dates.size() - 2; i += 2) {
            if (end <= dates.get(0)) {
                dates.add(0, start);
                dates.add(1, end);
                return true;
            }
            else if (start >= dates.get(i - 2)) {
                int size = dates.size();
                dates.add(size, start);
                dates.add(size + 1, end);
                return true;
            }
            else if (start >= dates.get(i + 1) && end <= dates.get(i + 2)) {
                dates.add(i + 2, start);
                dates.add(i + 3, end);
                return true;
            }
        }
        return false;
    }

    public class Event {

        public int start;

        public int end;

        public Event(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public String toString() {
            return "[" + start + ", " + end + ")";
        }
    }

    @Override
    public String toString() {
        return dates.toString();
    }

    public static void main(String[] args) {
        MyCalendar calendar = new MyCalendar();
        System.out.println(calendar.book(0, 2));
        System.out.println(calendar.book(1, 4));
        System.out.println(calendar.book(3, 6));

        System.out.println(calendar);
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
