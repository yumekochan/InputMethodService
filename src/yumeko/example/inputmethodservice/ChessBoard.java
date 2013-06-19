package yumeko.example.inputmethodservice;

public class ChessBoard {

	final static int BLACK = 1;
	final static int WHITE = 2;
	
	int[][] chessBoard = new int[15][15];
	
	int startX;
	int startY;
	int color;
	int tempX;
	int tempY;
	int count;
	int[] tempVector;
	
	int[][] vector = {
			{1,0},
			{0,1},
			{1,1},
			{1,-1}
	};
	
	public boolean isWin(int x,int y){
		startX = x;
		startY = y;
		count  = 1;
		for(int[] i:vector){
			tempVector = i;
			if(hasFiveLined()) return true;
		}
		return false;
	}
	
	private boolean hasFiveLined(){
		tempX = startX;
		tempY = startY;
		if(moveOnPositive()) return true;
		tempX = startX;
		tempY = startY;
		return moveOnNegative();
	}
	
	private boolean moveOnPositive(){
		if(isEnd(tempX+tempVector[0],tempY+tempVector[1])){
			return false;
		}else{
			count++;
			if(count>=5) return true;
			return moveOnPositive();
		}
	}
	
	private boolean moveOnNegative(){
		if(isEnd(tempX-tempVector[0],tempY-tempVector[1])){
			return false;
		}else{
			count++;
			if(count>=5) return true;
			return moveOnNegative();
		}
	}
	
	private boolean isEnd(int x,int y){
		if(true){
			
		}
		return false;
	}
}
