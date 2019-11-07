package pm.test;

import java.util.Arrays;

public class ReorderLogs {
	public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, (log1, log2) -> {
            String[] split1 = log1.split(" ", 2);
            String[] split2 = log2.split(" ", 2);
            //System.out.println(split1[1].charAt(0));
            boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
            boolean isDigit2 = Character.isDigit(split2[1].charAt(0));
            
            if (!isDigit1 && !isDigit2) {
                int cmp = split1[1].compareTo(split2[1]);
                //System.out.println(cmp);
                if (cmp != 0) return cmp;
                return split1[0].compareTo(split2[0]);
            }
            //return isDigit1 ? (isDigit2 ? 0 : 1) : -1;
            if (isDigit1) {
            	if(isDigit2)
            		return 0;
            	return 1;
            }
            else
            	return -1;
        });
        return logs;
    }
	
	
	public static void main(String args[]) {
		String[] logs = {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
		ReorderLogs obj = new ReorderLogs();
		String[] result = obj.reorderLogFiles(logs);
		System.out.println(Arrays.toString(result));
	
	
	}
}
