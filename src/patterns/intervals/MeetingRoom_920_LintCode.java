package patterns.intervals;

import java.util.Comparator;
import java.util.List;

public class MeetingRoom_920_LintCode {

    //   * Definition of Interval:
    public class Interval {
        int start, end;

        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }


    public class Solution {
        /**
         * @param intervals: an array of meeting time intervals
         * @return: if a person could attend all meetings
         */
        public boolean canAttendMeetings(List<Interval> intervals) {
            // Write your code here
            intervals.sort((i1, i2) -> {
                return Integer.compare(i1.start, i2.start);
            });
            return false;
        }
    }
}
