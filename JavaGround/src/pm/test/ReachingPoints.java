package pm.test;

public class ReachingPoints {
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
    	while(tx >= sx && ty >= sy) {
    		if (tx == ty) break;
    		else if (tx > ty) {
    			if (ty > sy) tx = tx % ty;
    			else return (tx-sx) % ty == 0;
    			
    		}
    		else {
    			if(tx > sx) ty = ty % tx;
    			else return (ty-sy)%tx == 0;
    		}
    	}
    	
    	return (tx==sx && ty == sy);
    }	
}
